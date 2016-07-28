package edu.kit.ipd.sdq.toometa.traceview.views;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import edu.kit.ipd.sdq.toometa.relations.TraceableObject;
import edu.kit.ipd.sdq.toometa.relations.AlternativeObject;
import edu.kit.ipd.sdq.toometa.relations.ConflictObject;
import edu.kit.ipd.sdq.toometa.relations.DuplicationObject;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class TracesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "edu.kit.ipd.sdq.toometa.traceview.views.TracesView";

	/**
	 * Static node Strings for possible children.
	 */
	private static final String DUPLICATES =			"Duplicates:";
	private static final String CONFLICTS_WITH =		"Conflicts with:";
	private static final String ALTERNATIVE_TO =		"Is an alternative to:";
	private static final String PARENT_OF = 			"Is parent of:";
	private static final String SUBPART_OF =			"Is subpart of:";
	private static final String DEPENDS_ON =			"Depends on:";
	private static final String HAS_DEPENDENTS =		"Has Dependents:";
	private static final String TRIGGERED_BY =			"Is triggered by";
	private static final String TRIGGER_OF =			"Is the trigger of:";
	private static final String RESOLVES =				"Resolves:";
	private static final String RESOLVED_BY =			"Is resolved by:";
	private static final String COULD_RESOLVE =			"Could resolve:";
	private static final String COULD_BE_RESOLVED_BY =	"Could be resolved by:";
	private static final String STAKEHOLDER_OF =		"Is an stakeholder of:";
	private static final String HAS_STAKEHOLDERS =		"Has stakeholders:";
	private static final String NOT_TRACEABLE =			"No traceable Object selected.";

	/**
	 * Keeps the selected TraceableObject object for further processing.
	 */
	private TraceableObject traceableObject;

	/**
	 * Keeps the number of unfolded levels to prevent loops due to self-references.
	 */
	private int unfolds = 0;

	/**
	 * Keeps a history of selected items.
	 */
	private Stack<TraceableObject> history = new Stack<TraceableObject>();

	private TreeViewer viewer;
	private Action historyBack;
	private Action historyClear;
	private Action followTrace;
	
	/**
	 * Selection listener getting the selected object. Reacts only to external selection changes.
	 */
	private ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			System.out.println("--------------------------------------" + System.lineSeparator());
			System.out.println("Selection changed from part " + part);
			// only react to selections in different views.
			if (!(part instanceof TracesView) && null != selection) {
				TraceableObject historyObject = traceableObject;
				traceableObject = null; // reset traceableObject
				// only react to IStructuredSelection
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection strucSel = (IStructuredSelection) selection;
					// check that the selection is not empty
					if (null != strucSel.getFirstElement()) {
						System.out.println("First Element is of class: " + strucSel.getFirstElement().getClass());
						// print further information if selection is of type ITreeSelection
						if (selection instanceof ITreeSelection) {
							ITreeSelection treeSel = (ITreeSelection) selection;
							System.out.println(System.lineSeparator() + "Selection is an ITreeSelection.");
							// print out the path objects
							for (TreePath o: treeSel.getPaths()) {
								System.out.println("Path: " + o + " with " + o.getSegmentCount() + " segments");
								for (int i = 0; i < o.getSegmentCount(); i++) {
									Object obj = o.getSegment(i);
									System.out.println("Object " + i + " is of type " + obj.getClass());
								}
							}
						}
						// check whether the selected object is an instance of TraceableObject
						if (strucSel.getFirstElement() instanceof TraceableObject) {
							System.out.println(System.lineSeparator() + "First element is instance of TraceableObject");
							// set the viewer on the selected element
							viewer.setInput(strucSel.getFirstElement());
							TraceableObject allRelIn = (TraceableObject) strucSel.getFirstElement();
							if(null != historyObject && !allRelIn.equals(historyObject)) {
								history.push(historyObject); // push the previous object to the history
							}
						} else {
							// in all other cases set the viewer to a message that no traceable object is selected
							viewer.setInput(NOT_TRACEABLE);
						}
					} else {
						viewer.setInput(NOT_TRACEABLE);
					}
				} else {
					viewer.setInput(NOT_TRACEABLE);
				}
			}
			System.out.println("--------------------------------------" + System.lineSeparator());
		}
	};

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	
	class ViewContentProvider implements ITreeContentProvider {
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			System.out.println("getChanged is called from viewer " + v + " with oldInput " + oldInput + " and new input " + newInput);
		}

		public void dispose() {
			System.out.println("ViewContentProvider is disposed...");
		}

		public Object[] getElements(Object inputElement) {
			System.out.println("getElements is called with parent " + inputElement + " of class " + inputElement.getClass());
			if (inputElement.equals(traceableObject)) {
				return getChildren(inputElement);
			}
			if (inputElement instanceof TraceableObject) {
				traceableObject = (TraceableObject) inputElement;
				unfolds = 0;
			}
			return new Object[] { inputElement };
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			System.out.println("getChildren is called with parent " + parentElement + " of class " + parentElement.getClass() + " and firstUnfold " + unfolds);
			if (null != parentElement) {
				if (parentElement instanceof TraceableObject && ((TraceableObject) parentElement).equals(traceableObject) && 2 > unfolds) {
					ArrayList<Object> toDisplay = new ArrayList<Object>();
					if ((null != traceableObject.getDuplicateOf() && 0 < traceableObject.getDuplicateOf().size()) ||
							(null != traceableObject.getHasDuplicates() && 0 < traceableObject.getHasDuplicates().size())) {
						toDisplay.add(DUPLICATES);
					}
					if ((null != traceableObject.getConflictsWith() && 0 < traceableObject.getConflictsWith().size()) ||
							(null != traceableObject.getHasConflicts() && 0 < traceableObject.getHasConflicts().size())) {
						toDisplay.add(CONFLICTS_WITH);
					}
					if ((null != traceableObject.getAlternativeTo() && 0 < traceableObject.getAlternativeTo().size()) ||
							(null != traceableObject.getHasAlternatives() && 0 < traceableObject.getHasAlternatives().size())) {
						toDisplay.add(ALTERNATIVE_TO);
					}
					if (null != traceableObject.getParentOf() && 0 < traceableObject.getParentOf().size()) {
						toDisplay.add(PARENT_OF);
					}
					if (null != traceableObject.getSubpartOf() && 0 < traceableObject.getSubpartOf().size()) {
						toDisplay.add(SUBPART_OF);
					}
					if (null != traceableObject.getDependsOn() && 0 < traceableObject.getDependsOn().size()) {
						toDisplay.add(DEPENDS_ON);
					}
					if (null != traceableObject.getHasDependents() && 0 < traceableObject.getHasDependents().size()) {
						toDisplay.add(HAS_DEPENDENTS);
					}
					if (null != traceableObject.getTriggeredBy() && 0 < traceableObject.getTriggeredBy().size()) {
						toDisplay.add(TRIGGERED_BY);
					}
					if (null != traceableObject.getTriggerOf() && 0 < traceableObject.getTriggerOf().size()) {
						toDisplay.add(TRIGGER_OF);
					}
					if (null != traceableObject.getResolves() && 0 < traceableObject.getResolves().size()) {
						toDisplay.add(RESOLVES);
					}
					if (null != traceableObject.getResolvedBy() && 0 < traceableObject.getResolvedBy().size()) {
						toDisplay.add(RESOLVED_BY);
					}
					if (null != traceableObject.getCouldResolve() && 0 < traceableObject.getCouldResolve().size()) {
						toDisplay.add(COULD_RESOLVE);
					}
					if (null != traceableObject.getCouldBeResolvedBy() && 0 < traceableObject.getCouldBeResolvedBy().size()) {
						toDisplay.add(COULD_BE_RESOLVED_BY);
					}
					if (null != traceableObject.getStakeholderOf() && 0 < traceableObject.getStakeholderOf().size()) {
						toDisplay.add(STAKEHOLDER_OF);
					}
					if (null != traceableObject.getHasStakeholders() && 0 < traceableObject.getHasStakeholders().size()) {
						toDisplay.add(HAS_STAKEHOLDERS);
					}
					System.out.println(toDisplay.toString());
					unfolds++;
					return toDisplay.toArray();
				} else if (parentElement.equals(DUPLICATES)) {
					List<DuplicationObject> duplicates = traceableObject.getDuplicateOf();
					duplicates.addAll(traceableObject.getHasDuplicates());
					return duplicates.toArray();
				} else if (parentElement.equals(CONFLICTS_WITH)) {
					List<ConflictObject> conflicting = traceableObject.getConflictsWith();
					conflicting.addAll(traceableObject.getHasConflicts());
					return conflicting.toArray();
				} else if (parentElement.equals(ALTERNATIVE_TO)) {
					List<AlternativeObject> alternatives = traceableObject.getAlternativeTo();
					alternatives.addAll(traceableObject.getHasAlternatives());
					return alternatives.toArray();
				} else if (parentElement.equals(PARENT_OF)) {
					return traceableObject.getParentOf().toArray();
				} else if (parentElement.equals(SUBPART_OF)) {
					return traceableObject.getSubpartOf().toArray();
				} else if (parentElement.equals(DEPENDS_ON)) {
					return traceableObject.getDependsOn().toArray();
				} else if (parentElement.equals(HAS_DEPENDENTS)) {
					return traceableObject.getHasDependents().toArray();
				} else if (parentElement.equals(TRIGGERED_BY)) {
					return traceableObject.getTriggeredBy().toArray();
				} else if (parentElement.equals(TRIGGER_OF)) {
					return traceableObject.getTriggerOf().toArray();
				} else if (parentElement.equals(RESOLVES)) {
					return traceableObject.getResolves().toArray();
				} else if (parentElement.equals(RESOLVED_BY)) {
					return traceableObject.getResolvedBy().toArray();
				} else if (parentElement.equals(COULD_RESOLVE)) {
					return traceableObject.getCouldResolve().toArray();
				} else if (parentElement.equals(COULD_BE_RESOLVED_BY)) {
					return traceableObject.getCouldBeResolvedBy().toArray();
				} else if (parentElement.equals(STAKEHOLDER_OF)) {
					return traceableObject.getStakeholderOf().toArray();
				} else if (parentElement.equals(HAS_STAKEHOLDERS)) {
					return traceableObject.getHasStakeholders().toArray();
				}
			}
			return new Object[0];
		}

		@Override
		public Object getParent(Object element) {
			System.out.println("getChildren is called with parent " + element + " of class " + element.getClass());
			if (element.equals(DUPLICATES) ||
					element.equals(CONFLICTS_WITH) ||
					element.equals(ALTERNATIVE_TO) ||
					element.equals(PARENT_OF) ||
					element.equals(SUBPART_OF) ||
					element.equals(DEPENDS_ON) ||
					element.equals(HAS_DEPENDENTS) ||
					element.equals(TRIGGERED_BY) ||
					element.equals(TRIGGER_OF) ||
					element.equals(RESOLVES) ||
					element.equals(RESOLVED_BY) ||
					element.equals(COULD_RESOLVE) ||
					element.equals(COULD_BE_RESOLVED_BY) ||
					element.equals(STAKEHOLDER_OF) ||
					element.equals(HAS_STAKEHOLDERS)) {
				return traceableObject;
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			System.out.println("hasChildren is called with parent " + element + " of class " + element.getClass());
			if (0 < getChildren(element).length) {
				return true;
			}
			return false;
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getText(Object obj) {
			if (obj instanceof EObject) {
				EObject object = (EObject) obj;
				ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
				AdapterFactoryLabelProvider lbProviderFactory = new AdapterFactoryLabelProvider(composedAdapterFactory);
				return lbProviderFactory.getText(object);
			}
			return super.getText(obj);
		}

		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			if (obj instanceof TraceableObject) {
				return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_ELCL_SYNCED);
			} else if (obj.equals(NOT_TRACEABLE)) {
				return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_TOOL_DELETE);
			} else if (obj.equals(DUPLICATES) ||
					obj.equals(CONFLICTS_WITH) ||
					obj.equals(ALTERNATIVE_TO) ||
					obj.equals(PARENT_OF) ||
					obj.equals(SUBPART_OF) ||
					obj.equals(DEPENDS_ON) ||
					obj.equals(HAS_DEPENDENTS) ||
					obj.equals(TRIGGERED_BY) ||
					obj.equals(TRIGGER_OF) ||
					obj.equals(RESOLVES) ||
					obj.equals(RESOLVED_BY) ||
					obj.equals(COULD_RESOLVE) ||
					obj.equals(COULD_BE_RESOLVED_BY) ||
					obj.equals(STAKEHOLDER_OF) ||
					obj.equals(HAS_STAKEHOLDERS)) {
				return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_TOOL_FORWARD);
			}
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * The constructor.
	 */
	public TracesView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "Toometa.Traceview.Extension.viewer");
		getSite().setSelectionProvider(viewer);
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		// Register the change listener
		getSite().getPage().addSelectionListener(selectionListener);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				TracesView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(historyBack);
		manager.add(new Separator());
		manager.add(historyClear);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(historyBack);
		manager.add(followTrace);
		manager.add(historyClear);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(historyBack);
		manager.add(followTrace);
		manager.add(historyClear);
	}

	private void makeActions() {
		historyBack = new Action() {
			public void run() {
				if (!history.empty() && null != history.peek()) {
					// reset traceableObject and display from history
					traceableObject = null;
					viewer.setInput(history.pop());
				} else {
					showMessage("The history is empty.");
				}
			}
		};
		historyBack.setText("Go back");
		historyBack.setToolTipText("Display the last traced element.");
		historyBack.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_BACK));
		
		historyClear = new Action() {
			public void run() {
				history = new Stack<TraceableObject>();
			}
		};
		historyClear.setText("Clear history");
		historyClear.setToolTipText("Clears all elements from the history.");
		historyClear.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_CLEAR));

		followTrace = new Action() {
			public void run() {
				// get the selected object, if traceable and not the current traced object, trace it.
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				if (obj instanceof TraceableObject && !obj.equals(traceableObject)) {
					history.push(traceableObject);
					viewer.setInput(obj);
				} else {
					showMessage(NOT_TRACEABLE);
				}
			}
		};
		followTrace.setText("Follow Trace");
		followTrace.setToolTipText("Follows the trace and displays the currently selected object.");
		followTrace.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				followTrace.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Sample View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	/**
	 * Destructor to remove selection listener.
	 */
	public void dispose() {
		getSite().getPage().removeSelectionListener(selectionListener);
        super.dispose();
    }
}
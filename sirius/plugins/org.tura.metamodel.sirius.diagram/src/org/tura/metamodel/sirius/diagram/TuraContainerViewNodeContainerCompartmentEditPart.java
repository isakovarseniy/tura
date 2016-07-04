package org.tura.metamodel.sirius.diagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartmentEditPart;

import form.FormPackage;
import common.HTMLLayerHolder;
import form.Orderable;


public class TuraContainerViewNodeContainerCompartmentEditPart
		extends DNodeContainerViewNodeContainerCompartmentEditPart {

	public TuraContainerViewNodeContainerCompartmentEditPart(View view) {
		super(view);
	}

    private EditPartListener editpartListener = new EditPartListener.Stub() {

        private FigureListener childFigureListener = new FigureListener() {

            public void figureMoved(IFigure source) {
            	@SuppressWarnings("unchecked")
				List<GraphicalEditPart >   ls  = getChildren();
            	ArrayList<IFigure> children = new ArrayList<>();
            	HashMap<IFigure, GraphicalEditPart> hash = new HashMap<>();
            	for (GraphicalEditPart editPart : ls){
            		hash.put(editPart.getFigure(), editPart);
            		children.add(editPart.getFigure());
            	}
            	new HTMLLikeLayout().sort(children);
            	Integer order = 0;
            	for (IFigure fig : children){
            		GraphicalEditPart editPart = hash.get(fig);
            		EObject obj = null;
               		if ( ((View) editPart.getModel()).getElement() instanceof DNodeContainerSpec){
            			obj =((DNodeContainerSpec) (((View) editPart.getModel()).getElement())).getTarget();
            		}
            		if ( ((View) editPart.getModel()).getElement() instanceof DNodeSpec){
            			obj =((DNodeSpec) (((View) editPart.getModel()).getElement())).getTarget();
            		}
     				if (obj instanceof Orderable) {
    					EditingDomain editingDomain = getEditingDomain();
    					editingDomain.getCommandStack().execute(
    							SetCommand.create(editingDomain, obj,
    									FormPackage.eINSTANCE
    											.getOrderable_Order(), order));

    				}
     				order++;
            			
            	}
            }
        };

        public void childAdded(EditPart child, int index) {
            ((GraphicalEditPart) child).getFigure().addFigureListener(
                childFigureListener);
        }

        public void removingChild(EditPart child, int index) {
            ((GraphicalEditPart) child).getFigure().removeFigureListener(
                childFigureListener);

        }

    };
	
	
    @Override
 	public void addNotify() {
         addEditPartListener(editpartListener);
         super.addNotify();
     }

    @Override
     public void removeNotify() {
         removeEditPartListener(editpartListener);
         super.removeNotify();
     }	
   
    
	
	@Override
	protected LayoutManager getLayoutManager() {

		HTMLLikeLayout layout = new HTMLLikeLayout();

		NodeImpl node = (NodeImpl) this.getModel();
		DNodeContainerSpec spec = (DNodeContainerSpec) node.getElement();
		EObject model = spec.getTarget();

		if (model instanceof HTMLLayerHolder) {
			layout.setColumns(((HTMLLayerHolder) model).getColumns());
			model.eAdapters().add(new Adapter() {

				@Override
				public void notifyChanged(Notification event) {
					if (event.getNotifier() instanceof HTMLLayerHolder && event.getFeature() instanceof EAttribute) {
						EAttribute eAttribute = (EAttribute) event.getFeature();
						if (eAttribute.getName().equalsIgnoreCase("columns")) {
							ShapeCompartmentFigure figure = (ShapeCompartmentFigure) getFigure();
							HTMLLikeLayout layout = (HTMLLikeLayout) figure.getContentPane().getLayoutManager();
							layout.setColumns(event.getNewIntValue());
							figure.getContentPane().revalidate();
							figure.getUpdateManager().performUpdate();
						}

					}
				}

				@Override
				public Notifier getTarget() {
					return null;
				}

				@Override
				public void setTarget(Notifier newTarget) {

				}

				@Override
				public boolean isAdapterForType(Object type) {
					if (type instanceof HTMLLayerHolder)
						return true;
					else
						return false;
				}

			});
			return layout;
		} else {
			return super.getLayoutManager();
		}
	}

}
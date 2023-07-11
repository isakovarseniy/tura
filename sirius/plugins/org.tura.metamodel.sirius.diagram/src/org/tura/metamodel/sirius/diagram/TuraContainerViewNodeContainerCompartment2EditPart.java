/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.diagram;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeSpec;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartment2EditPart;

import common.CommonPackage;
import common.HTMLLayerHolder;
import common.Orderable;


public class TuraContainerViewNodeContainerCompartment2EditPart extends DNodeContainerViewNodeContainerCompartment2EditPart{

    private EditPartListener editpartListener = new EditPartListener.Stub() {
        class OrderModifier implements PropertyChangeListener{
    
       	 private EditPart editPart;
       	 OrderModifier(EditPart editPart){
       		 this.editPart = editPart;
       	 }
       	 
   			@Override
   			public void propertyChange(PropertyChangeEvent evt) {
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
   									CommonPackage.eINSTANCE
   											.getOrderable_Order(), evt.getNewValue()));

   				}
   			}
   		}
           public void childAdded(EditPart child, int index) {
              ((GraphicalEditPart) child).getFigure().addPropertyChangeListener("order", new OrderModifier(child));
           }

           public void removingChild(EditPart child, int index) {
           }
           
        };
	
	
	public TuraContainerViewNodeContainerCompartment2EditPart(View view) {
		super(view);
	}


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

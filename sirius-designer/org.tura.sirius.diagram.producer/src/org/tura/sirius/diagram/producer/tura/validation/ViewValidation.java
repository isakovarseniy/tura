package org.tura.sirius.diagram.producer.tura.validation;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.dsl.config.ValidationRuleConfigurator;
import org.tura.sirius.dsl.viewpoint.tErrorValidationRule;

public class ViewValidation{
  public static List<ValidationRuleConfigurator> getRules(){
    ArrayList<ValidationRuleConfigurator> rules = new ArrayList<>();
    
    rules.add(new tErrorValidationRule("CanvasFramel name validation", "form.CanvasFrame", "Name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("CanvasFramel name repetition validation", "form.CanvasFrame", "Name repetition problem", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::Views).canvases->select(q|q.oclAsType(form::CanvasFrame).name = self.name)->size()=1" }));
    rules.add(new tErrorValidationRule("CanvasFramel multi connections validation", "form.CanvasFrame", "Canvas cannot be connected to multiple ViewPort", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::Views).viewInheritances->select(r|r.oclAsType(form::ViewInheritance).target.uid=self.oclAsType(form::CanvasFrame).uid)->size()<2" }));
    rules.add(new tErrorValidationRule("Canvas -  viewport connections validation", "form.Canvas", "Canvas is not connected to  ViewPort", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::Views).viewInheritances->select(r|r.oclAsType(form::ViewInheritance).target.uid=self.oclAsType(form::CanvasFrame).uid)->size()=1" }));
    rules.add(new tErrorValidationRule("TabPage connections validation", "form.TabPage", "TabPage is not connected to  TabCanvas", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::Views).tabPagesInheritances->select(r|r.oclAsType(form::TabPagesInheritance).target.uid=self.oclAsType(form::TabPage).uid)->size()=1" }));
    rules.add(new tErrorValidationRule("ViewPort name validation", "form.ViewPort", "Name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("ViewPort name repetition validation", "form.ViewPort", "Name repetition problem", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(form::Views).canvases->select(r|r.oclIsKindOf(form::ViewPortHolder) and r.oclAsType(form::ViewPortHolder).viewElement->select(q|q.oclIsTypeOf(form::ViewPort) and q.oclAsType(form::ViewPort).name <> null and  q.oclAsType(form::ViewPort).uid <> self.oclAsType(form::ViewPort).uid  and q.oclAsType(form::ViewPort).name=self.name)->size()> 0)->size()=0" }));
    rules.add(new tErrorValidationRule("ViewAria name validation", "form.ViewAria", "Name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("ViewAria name repetition validation", "form.ViewArea", "Name repetition problem", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(form::Views).canvases->select(r|r.oclIsKindOf(form::ViewPortHolder) and r.oclAsType(form::ViewPortHolder).viewElement->select(q|q.oclIsTypeOf(form::ViewArea) and q.oclAsType(form::ViewArea).name <> null and  q.oclAsType(form::ViewArea).uid <> self.oclAsType(form::ViewArea).uid  and q.oclAsType(form::ViewArea).name=self.name)->size()> 0)->size()=0" }));
    rules.add(new tErrorValidationRule("MenuDefinition name validation", "form.MenuDefinition", "Name cannot be empty ", new String[] { "aql:self.name <> null" }));
    rules.add(new tErrorValidationRule("MenuDefinition name repetition validation", "form.MenuDefinition", "Name repetition problem", new String[] { "aql:self.oclAsType(ecore::EObject).eContainer().oclAsType(form::Views).menus->select(q|q.oclAsType(form::MenuDefinition).name = self.name)->size()=1" }));
    
    return rules;
  }
}

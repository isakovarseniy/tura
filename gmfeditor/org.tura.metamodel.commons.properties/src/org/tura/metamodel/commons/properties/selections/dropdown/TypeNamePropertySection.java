package org.tura.metamodel.commons.properties.selections.dropdown;


public class TypeNamePropertySection extends AbstractTypeNamePropertySection{

	@Override
	protected String getQuery() {
		return "domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).uid='$1').oclAsType(domain::Package).typedefinition.types->"
				+"select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name <> null)  " 
				+"or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name <> null)"
				+"or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name <> null)"
				+")->sortedBy(r|r.name)";
	}

}

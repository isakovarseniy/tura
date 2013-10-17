package org.metamodel.tura.ui.properties.sections;

public class TypeRefTypeNamePropertySection extends
		AbstractTypeNamePropertySection {

	@Override
	protected String getQuery() {
		return "domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='$1').oclAsType(domain::Package).typedefinition.types->"
				+"select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name <> null)  " 
				+"or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name <> null)"
				+")";
	}

}

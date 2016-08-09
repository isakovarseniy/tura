package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import type.PackagePointer;
import type.TypePackage;

public class TypeGroupPointerName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		PackagePointer pkgRef = (PackagePointer) eObject;
		if (pkgRef.getPackageRef() == null || pkgRef.getPackageRef().getName() == null){
			return "";
		}else{
			return  pkgRef.getPackageRef().getName();
			
		}
	}

	@Override
	public EStructuralFeature getFeature() {
		return TypePackage.eINSTANCE.getPackagePointer_PackageRef();
	}

}

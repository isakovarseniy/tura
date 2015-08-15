/*
 * 
 */
package typedefinition.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.PrimitiveEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.providers.DomainElementTypes;
import typedefinition.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfTypeReferenceEditPart extends DomainModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TypeReferenceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TypeReferenceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.TypeExtension_104001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TypeReferenceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TypeReferenceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TypeReferenceEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TypeReferenceEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.TypeExtension_104001) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TypeReferenceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TypeReferenceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.TypeExtension_104001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TypeReferenceEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TypeReferenceEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.TypeExtension_104001) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

}

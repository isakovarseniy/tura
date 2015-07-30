/*
 * 
 */
package control.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import control.diagram.edit.parts.ArtificialFieldEditPart;
import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.CreateTriggerEditPart;
import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.edit.parts.DeleteTriggerEditPart;
import control.diagram.edit.parts.DependencyEditPart;
import control.diagram.edit.parts.FormVariableEditPart;
import control.diagram.edit.parts.InsertTriggerEditPart;
import control.diagram.edit.parts.POSTCreateTriggerEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.PREUpdateTriggerEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.SearchTriggerEditPart;
import control.diagram.edit.parts.UpdateTriggerEditPart;
import control.diagram.part.DomainDiagramEditorPlugin;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainElementTypes {

	/**
	 * @generated
	 */
	private DomainElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DomainDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Controls_1101000 = getElementType(
			"org.tura.metamodel.diagram.control.Controls_1101000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Root_1102001 = getElementType("org.tura.metamodel.diagram.control.Root_1102001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataControl_1102002 = getElementType(
			"org.tura.metamodel.diagram.control.DataControl_1102002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREFormTrigger_1103001 = getElementType(
			"org.tura.metamodel.diagram.control.PREFormTrigger_1103001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormVariable_1103017 = getElementType(
			"org.tura.metamodel.diagram.control.FormVariable_1103017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PREQueryTrigger_1103002 = getElementType(
			"org.tura.metamodel.diagram.control.PREQueryTrigger_1103002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType POSTQueryTrigger_1103003 = getElementType(
			"org.tura.metamodel.diagram.control.POSTQueryTrigger_1103003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREInsertTrigger_1103004 = getElementType(
			"org.tura.metamodel.diagram.control.PREInsertTrigger_1103004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREDeleteTrigger_1103005 = getElementType(
			"org.tura.metamodel.diagram.control.PREDeleteTrigger_1103005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType POSTCreateTrigger_1103011 = getElementType(
			"org.tura.metamodel.diagram.control.POSTCreateTrigger_1103011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREUpdateTrigger_1103010 = getElementType(
			"org.tura.metamodel.diagram.control.PREUpdateTrigger_1103010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CreateTrigger_1103012 = getElementType(
			"org.tura.metamodel.diagram.control.CreateTrigger_1103012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InsertTrigger_1103013 = getElementType(
			"org.tura.metamodel.diagram.control.InsertTrigger_1103013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UpdateTrigger_1103014 = getElementType(
			"org.tura.metamodel.diagram.control.UpdateTrigger_1103014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeleteTrigger_1103015 = getElementType(
			"org.tura.metamodel.diagram.control.DeleteTrigger_1103015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SearchTrigger_1103016 = getElementType(
			"org.tura.metamodel.diagram.control.SearchTrigger_1103016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArtificialField_1103008 = getElementType(
			"org.tura.metamodel.diagram.control.ArtificialField_1103008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_1104009 = getElementType(
			"org.tura.metamodel.diagram.control.Relation_1104009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_1104010 = getElementType(
			"org.tura.metamodel.diagram.control.Dependency_1104010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Controls_1101000, DomainPackage.eINSTANCE.getControls());

			elements.put(Root_1102001, DomainPackage.eINSTANCE.getRoot());

			elements.put(DataControl_1102002, DomainPackage.eINSTANCE.getDataControl());

			elements.put(PREFormTrigger_1103001, DomainPackage.eINSTANCE.getPREFormTrigger());

			elements.put(FormVariable_1103017, DomainPackage.eINSTANCE.getFormVariable());

			elements.put(PREQueryTrigger_1103002, DomainPackage.eINSTANCE.getPREQueryTrigger());

			elements.put(POSTQueryTrigger_1103003, DomainPackage.eINSTANCE.getPOSTQueryTrigger());

			elements.put(PREInsertTrigger_1103004, DomainPackage.eINSTANCE.getPREInsertTrigger());

			elements.put(PREDeleteTrigger_1103005, DomainPackage.eINSTANCE.getPREDeleteTrigger());

			elements.put(POSTCreateTrigger_1103011, DomainPackage.eINSTANCE.getPOSTCreateTrigger());

			elements.put(PREUpdateTrigger_1103010, DomainPackage.eINSTANCE.getPREUpdateTrigger());

			elements.put(CreateTrigger_1103012, DomainPackage.eINSTANCE.getCreateTrigger());

			elements.put(InsertTrigger_1103013, DomainPackage.eINSTANCE.getInsertTrigger());

			elements.put(UpdateTrigger_1103014, DomainPackage.eINSTANCE.getUpdateTrigger());

			elements.put(DeleteTrigger_1103015, DomainPackage.eINSTANCE.getDeleteTrigger());

			elements.put(SearchTrigger_1103016, DomainPackage.eINSTANCE.getSearchTrigger());

			elements.put(ArtificialField_1103008, DomainPackage.eINSTANCE.getArtificialField());

			elements.put(Relation_1104009, DomainPackage.eINSTANCE.getRelation());

			elements.put(Dependency_1104010, DomainPackage.eINSTANCE.getDependency());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Controls_1101000);
			KNOWN_ELEMENT_TYPES.add(Root_1102001);
			KNOWN_ELEMENT_TYPES.add(DataControl_1102002);
			KNOWN_ELEMENT_TYPES.add(PREFormTrigger_1103001);
			KNOWN_ELEMENT_TYPES.add(FormVariable_1103017);
			KNOWN_ELEMENT_TYPES.add(PREQueryTrigger_1103002);
			KNOWN_ELEMENT_TYPES.add(POSTQueryTrigger_1103003);
			KNOWN_ELEMENT_TYPES.add(PREInsertTrigger_1103004);
			KNOWN_ELEMENT_TYPES.add(PREDeleteTrigger_1103005);
			KNOWN_ELEMENT_TYPES.add(POSTCreateTrigger_1103011);
			KNOWN_ELEMENT_TYPES.add(PREUpdateTrigger_1103010);
			KNOWN_ELEMENT_TYPES.add(CreateTrigger_1103012);
			KNOWN_ELEMENT_TYPES.add(InsertTrigger_1103013);
			KNOWN_ELEMENT_TYPES.add(UpdateTrigger_1103014);
			KNOWN_ELEMENT_TYPES.add(DeleteTrigger_1103015);
			KNOWN_ELEMENT_TYPES.add(SearchTrigger_1103016);
			KNOWN_ELEMENT_TYPES.add(ArtificialField_1103008);
			KNOWN_ELEMENT_TYPES.add(Relation_1104009);
			KNOWN_ELEMENT_TYPES.add(Dependency_1104010);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ControlsEditPart.VISUAL_ID:
			return Controls_1101000;
		case RootEditPart.VISUAL_ID:
			return Root_1102001;
		case DataControlEditPart.VISUAL_ID:
			return DataControl_1102002;
		case PREFormTriggerEditPart.VISUAL_ID:
			return PREFormTrigger_1103001;
		case FormVariableEditPart.VISUAL_ID:
			return FormVariable_1103017;
		case PREQueryTriggerEditPart.VISUAL_ID:
			return PREQueryTrigger_1103002;
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return POSTQueryTrigger_1103003;
		case PREInsertTriggerEditPart.VISUAL_ID:
			return PREInsertTrigger_1103004;
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return PREDeleteTrigger_1103005;
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return POSTCreateTrigger_1103011;
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return PREUpdateTrigger_1103010;
		case CreateTriggerEditPart.VISUAL_ID:
			return CreateTrigger_1103012;
		case InsertTriggerEditPart.VISUAL_ID:
			return InsertTrigger_1103013;
		case UpdateTriggerEditPart.VISUAL_ID:
			return UpdateTrigger_1103014;
		case DeleteTriggerEditPart.VISUAL_ID:
			return DeleteTrigger_1103015;
		case SearchTriggerEditPart.VISUAL_ID:
			return SearchTrigger_1103016;
		case ArtificialFieldEditPart.VISUAL_ID:
			return ArtificialField_1103008;
		case RelationEditPart.VISUAL_ID:
			return Relation_1104009;
		case DependencyEditPart.VISUAL_ID:
			return Dependency_1104010;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return control.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return control.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return control.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}

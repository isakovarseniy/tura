/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package application.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import application.diagram.edit.parts.ApplicationInfrastructureLayerNameEditPart;
import application.diagram.edit.parts.ApplicationMapperNameEditPart;
import application.diagram.edit.parts.ApplicationMappersNameEditPart;
import application.diagram.edit.parts.ApplicationMessagesNameEditPart;
import application.diagram.edit.parts.ApplicationRecipeNameEditPart;
import application.diagram.edit.parts.ApplicationRecipesNameEditPart;
import application.diagram.edit.parts.ApplicationRoleNameEditPart;
import application.diagram.edit.parts.ApplicationStyleNameEditPart;
import application.diagram.edit.parts.ApplicationUILayerNameEditPart;
import application.diagram.edit.parts.ApplicationUIPackageNameEditPart;
import application.diagram.edit.parts.StylesPackageNameEditPart;
import application.diagram.parsers.MessageFormatParser;
import application.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser applicationRecipesName_805002Parser;

	/**
	* @generated
	*/
	private IParser getApplicationRecipesName_805002Parser() {
		if (applicationRecipesName_805002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationRecipes_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationRecipesName_805002Parser = parser;
		}
		return applicationRecipesName_805002Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationMappersName_805004Parser;

	/**
	* @generated
	*/
	private IParser getApplicationMappersName_805004Parser() {
		if (applicationMappersName_805004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationMappers_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationMappersName_805004Parser = parser;
		}
		return applicationMappersName_805004Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationUILayerName_805006Parser;

	/**
	* @generated
	*/
	private IParser getApplicationUILayerName_805006Parser() {
		if (applicationUILayerName_805006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationUILayer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationUILayerName_805006Parser = parser;
		}
		return applicationUILayerName_805006Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationStyleName_805009Parser;

	/**
	* @generated
	*/
	private IParser getApplicationStyleName_805009Parser() {
		if (applicationStyleName_805009Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationStyle_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationStyleName_805009Parser = parser;
		}
		return applicationStyleName_805009Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationInfrastructureLayerName_805007Parser;

	/**
	* @generated
	*/
	private IParser getApplicationInfrastructureLayerName_805007Parser() {
		if (applicationInfrastructureLayerName_805007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DomainPackage.eINSTANCE.getApplicationInfrastructureLayer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationInfrastructureLayerName_805007Parser = parser;
		}
		return applicationInfrastructureLayerName_805007Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationRoleName_805010Parser;

	/**
	* @generated
	*/
	private IParser getApplicationRoleName_805010Parser() {
		if (applicationRoleName_805010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationRoleName_805010Parser = parser;
		}
		return applicationRoleName_805010Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationMessagesName_805012Parser;

	/**
	* @generated
	*/
	private IParser getApplicationMessagesName_805012Parser() {
		if (applicationMessagesName_805012Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationMessages_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationMessagesName_805012Parser = parser;
		}
		return applicationMessagesName_805012Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationRecipeName_805001Parser;

	/**
	* @generated
	*/
	private IParser getApplicationRecipeName_805001Parser() {
		if (applicationRecipeName_805001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationRecipe_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationRecipeName_805001Parser = parser;
		}
		return applicationRecipeName_805001Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationMapperName_805003Parser;

	/**
	* @generated
	*/
	private IParser getApplicationMapperName_805003Parser() {
		if (applicationMapperName_805003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationMapper_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationMapperName_805003Parser = parser;
		}
		return applicationMapperName_805003Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationUIPackageName_805005Parser;

	/**
	* @generated
	*/
	private IParser getApplicationUIPackageName_805005Parser() {
		if (applicationUIPackageName_805005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getApplicationUIPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationUIPackageName_805005Parser = parser;
		}
		return applicationUIPackageName_805005Parser;
	}

	/**
	* @generated
	*/
	private IParser stylesPackageName_805008Parser;

	/**
	* @generated
	*/
	private IParser getStylesPackageName_805008Parser() {
		if (stylesPackageName_805008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getStylesPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stylesPackageName_805008Parser = parser;
		}
		return stylesPackageName_805008Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ApplicationRecipesNameEditPart.VISUAL_ID:
			return getApplicationRecipesName_805002Parser();
		case ApplicationMappersNameEditPart.VISUAL_ID:
			return getApplicationMappersName_805004Parser();
		case ApplicationUILayerNameEditPart.VISUAL_ID:
			return getApplicationUILayerName_805006Parser();
		case ApplicationStyleNameEditPart.VISUAL_ID:
			return getApplicationStyleName_805009Parser();
		case ApplicationInfrastructureLayerNameEditPart.VISUAL_ID:
			return getApplicationInfrastructureLayerName_805007Parser();
		case ApplicationRoleNameEditPart.VISUAL_ID:
			return getApplicationRoleName_805010Parser();
		case ApplicationMessagesNameEditPart.VISUAL_ID:
			return getApplicationMessagesName_805012Parser();
		case ApplicationRecipeNameEditPart.VISUAL_ID:
			return getApplicationRecipeName_805001Parser();
		case ApplicationMapperNameEditPart.VISUAL_ID:
			return getApplicationMapperName_805003Parser();
		case ApplicationUIPackageNameEditPart.VISUAL_ID:
			return getApplicationUIPackageName_805005Parser();
		case StylesPackageNameEditPart.VISUAL_ID:
			return getStylesPackageName_805008Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DomainVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DomainVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DomainElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
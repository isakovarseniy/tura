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
package mapper.diagram.providers;

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

import domain.DomainPackage;
import mapper.diagram.edit.parts.CSSMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.JavaMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.JavaPackageMapperFakePackageNameEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.RoleMapperFakeRoleNameEditPart;
import mapper.diagram.parsers.MessageFormatParser;
import mapper.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser javaMapperFakePackageNameFakeTypeName_405001Parser;

	/**
	 * @generated
	 */
	private IParser getJavaMapperFakePackageNameFakeTypeName_405001Parser() {
		if (javaMapperFakePackageNameFakeTypeName_405001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DomainPackage.eINSTANCE.getTypePointer_FakePackageName(),
					DomainPackage.eINSTANCE.getTypePointer_FakeTypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			javaMapperFakePackageNameFakeTypeName_405001Parser = parser;
		}
		return javaMapperFakePackageNameFakeTypeName_405001Parser;
	}

	/**
	 * @generated
	 */
	private IParser javaScriptMapperFakePackageNameFakeTypeName_405003Parser;

	/**
	 * @generated
	 */
	private IParser getJavaScriptMapperFakePackageNameFakeTypeName_405003Parser() {
		if (javaScriptMapperFakePackageNameFakeTypeName_405003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DomainPackage.eINSTANCE.getTypePointer_FakePackageName(),
					DomainPackage.eINSTANCE.getTypePointer_FakeTypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			javaScriptMapperFakePackageNameFakeTypeName_405003Parser = parser;
		}
		return javaScriptMapperFakePackageNameFakeTypeName_405003Parser;
	}

	/**
	 * @generated
	 */
	private IParser javaPackageMapperFakePackageName_405006Parser;

	/**
	 * @generated
	 */
	private IParser getJavaPackageMapperFakePackageName_405006Parser() {
		if (javaPackageMapperFakePackageName_405006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getPackageMapper_FakePackageName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			javaPackageMapperFakePackageName_405006Parser = parser;
		}
		return javaPackageMapperFakePackageName_405006Parser;
	}

	/**
	 * @generated
	 */
	private IParser cSSMapperFakePackageNameFakeTypeName_405004Parser;

	/**
	 * @generated
	 */
	private IParser getCSSMapperFakePackageNameFakeTypeName_405004Parser() {
		if (cSSMapperFakePackageNameFakeTypeName_405004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DomainPackage.eINSTANCE.getCSSMapper_FakePackageName(),
					DomainPackage.eINSTANCE.getCSSMapper_FakeTypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cSSMapperFakePackageNameFakeTypeName_405004Parser = parser;
		}
		return cSSMapperFakePackageNameFakeTypeName_405004Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleMapperFakeRoleName_405005Parser;

	/**
	 * @generated
	 */
	private IParser getRoleMapperFakeRoleName_405005Parser() {
		if (roleMapperFakeRoleName_405005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getRoleMapper_FakeRoleName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleMapperFakeRoleName_405005Parser = parser;
		}
		return roleMapperFakeRoleName_405005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case JavaMapperFakePackageNameFakeTypeEditPart.VISUAL_ID:
			return getJavaMapperFakePackageNameFakeTypeName_405001Parser();
		case JavaScriptMapperFakePackageNameFakeTypeEditPart.VISUAL_ID:
			return getJavaScriptMapperFakePackageNameFakeTypeName_405003Parser();
		case JavaPackageMapperFakePackageNameEditPart.VISUAL_ID:
			return getJavaPackageMapperFakePackageName_405006Parser();
		case CSSMapperFakePackageNameFakeTypeEditPart.VISUAL_ID:
			return getCSSMapperFakePackageNameFakeTypeName_405004Parser();
		case RoleMapperFakeRoleNameEditPart.VISUAL_ID:
			return getRoleMapperFakeRoleName_405005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
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

/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.generation;

import java.io.ByteArrayInputStream;
import java.util.Optional;

import com.github.javaparser.JavaParser;
import com.github.javaparser.Position;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithName;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

public class JavaPreprocessor {
	
	private CompilationUnit compilationUnit;

	public  String process (String src) {
		
		  ByteArrayInputStream in = new ByteArrayInputStream(src.getBytes());
		
			compilationUnit = new JavaParser().parse(in).getResult().get();

			compilationUnit.accept(new ModifierVisitor<Object>() {

				
				private String findLastToken(String name ) {
					int index = name.lastIndexOf(".");
					String token = name.substring(index+1);
					return token;
				}
				
				private boolean addImport(String clazz) {
					
					String classToken = findLastToken(clazz);

					NodeList<ImportDeclaration > ls =  compilationUnit.getImports();
					boolean isFound = false;
					for (  int i = 0; i < ls.size(); i++) {
						ImportDeclaration imp =   ls.get(i);
						String name = imp.getNameAsString();
						String token = findLastToken(name);
						if (clazz.equals(name)) {
							return true;
						}
						if (classToken.equals(token) ) {
							isFound = true;
							break;
						}
					}
					if (!isFound ) {
						compilationUnit.addImport(clazz);
					}
					return !isFound ;
				}
			    
				private void changeName(NodeWithName<?> a) {
					
					String name = a.getName().asString();
					
					if ( name != null && name.indexOf(".") != -1 ) {
						if (addImport(name)) {
							String token = findLastToken(name);
							a.setName(token);
						}
					}
				}
				
				
			    @Override
			    public Visitable visit(final NormalAnnotationExpr n, final Object arg) {
					Visitable v = super.visit(n, arg);
					NormalAnnotationExpr f = (NormalAnnotationExpr) v;
					changeName(f);
					return v;
			    }				

			    
			    @Override
			    public Visitable visit(final MarkerAnnotationExpr n, final Object arg) {
					Visitable v = super.visit(n, arg);

					MarkerAnnotationExpr f = (MarkerAnnotationExpr) v;
					changeName(f);
					
					return v;
			    	
			    }			    
			    
			    @Override
			    public Visitable visit(final SingleMemberAnnotationExpr n, final Object arg) {
					Visitable v = super.visit(n, arg);

					SingleMemberAnnotationExpr f = (SingleMemberAnnotationExpr) v;
					changeName(f);
					
					return v;
			    	
			    }			    
			    
			    
				@Override
				public Visitable visit(final ClassOrInterfaceType n, final Object arg) {
					Visitable v = super.visit(n, arg);

					ClassOrInterfaceType f = (ClassOrInterfaceType) v;

					if (! f.isPrimitiveType()) {
						ClassOrInterfaceType clazz = (ClassOrInterfaceType) f;
						
						Optional<Node> parent = clazz.getParentNode();
						if ( parent.isPresent()) {
							Node parentNode = parent.get();
							Optional<Position> parentBegin = parentNode.getBegin();
							Optional<Position> clazzBegin = clazz.getBegin();
							if (parentBegin.isPresent() && clazzBegin.isPresent()) {
								if (!parentBegin.equals(clazzBegin)) {
									if ( clazz.getScope().isPresent()) {
										String pkg = clazz.getScope().get().toString()+"."+clazz.getName();
										if (addImport(pkg)) {
											clazz.setScope(null);										
										}
									}
								}
								
							}
						}
					}
					return v;
				}

				
			}, null);
			return compilationUnit.toString();
		
	}

}

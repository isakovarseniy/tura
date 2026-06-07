/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.metamodel;

public interface IMetamodelCommand {

	void build(String recipeId, String infraId, Object model);

    void generate(String recipeId, String componentId ,  String ingredientId, String mapperId , String infraId,  Object model, boolean build );

	void validate(String recipeId,String componentId,String ingredientId,String mapperId,boolean recipeOnly,boolean artifactsOnly,String infraId,Object model);

	MetamodelType getMetamodelType();

}

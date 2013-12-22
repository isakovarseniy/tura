package org.tura.metamodel.wizard.infrastructure;

public class Indicator {

	public static int runTime = 0;
	public static domain.Recipe currentRecipe;
	public static domain.Ingredient currentIngredient;
	public static domain.Component currentComponent;
	public static domain.ModelMapper currentModelMapper;
	public static domain.Query currentQuery;
	
	public static void clean(){
		runTime = 0;
		currentRecipe = null;
		currentIngredient = null;
		currentComponent = null;
		currentModelMapper = null;
		currentQuery = null;
	}
	
	public static int getRunTime(){
		return runTime;
	}

	public static domain.Recipe getCurrentRecipe() {
		return currentRecipe;
	}

	public static domain.Ingredient getCurrentIngredient() {
		return currentIngredient;
	}

	public static domain.Component getCurrentComponent() {
		return currentComponent;
	}

	public static domain.ModelMapper getCurrentModelMapper() {
		return currentModelMapper;
	}

	public static domain.Query getCurrentQuery() {
		return currentQuery;
	}
	
}

package za.ac.cput.project.chapter5;

public class TemplateMethodTacoMeal extends TemplateMethodPatternMeal {

	@Override
	public void prepareIngredients() {
		System.out.println("Getting ground beef and shells");
	}

	@Override
	public void cook() {
		System.out.println("Cooking ground beef in pan");
	}

	@Override
	public void eat() {
		System.out.println("The tacos are tasty");
	}

	@Override
	public void cleanUp() {
		System.out.println("Doing the dishes");
	}

}
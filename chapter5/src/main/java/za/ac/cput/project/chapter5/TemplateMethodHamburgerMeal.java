package za.ac.cput.project.chapter5;

public class TemplateMethodHamburgerMeal extends TemplateMethodPatternMeal {

	@Override
	public void prepareIngredients() {
		System.out.println("Getting burgers, buns, and french fries");
	}

	@Override
	public void cook() {
		System.out.println("Cooking burgers on grill and fries in oven");
	}

	@Override
	public void cleanUp() {
		System.out.println("Throwing away paper plates");
	}
}
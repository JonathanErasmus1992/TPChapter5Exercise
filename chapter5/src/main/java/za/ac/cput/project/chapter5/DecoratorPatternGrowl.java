package za.ac.cput.project.chapter5;

public class DecoratorPatternGrowl extends DecoratorPatternAnimal {

	public DecoratorPatternGrowl(DecoratorAnimal animal) {
		super(animal);
	}

	@Override
	public void describe() {
		animal.describe();
		growl();
	}

	public void growl() {
		System.out.println("Grrrrr.");
	}

}

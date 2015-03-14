package za.ac.cput.project.chapter5;

public class DecoratorPatternLeg extends DecoratorPatternAnimal {

	public DecoratorPatternLeg(DecoratorAnimal animal) {
		super(animal);
	}
	@Override
	public void describe() {
		animal.describe();
		System.out.println("I have legs.");
		dance();
	}
	public void dance() {
		System.out.println("I can dance.");
	}
}

package za.ac.cput.project.chapter5;

public class DecoratorPatternWing extends DecoratorPatternAnimal {

	public DecoratorPatternWing(DecoratorAnimal animal) {
		super(animal);
	}
	@Override
	public void describe() {
		animal.describe();
		System.out.println("I have wings.");
		fly();
	}
	public void fly() {
		System.out.println("I can fly.");
	}
}
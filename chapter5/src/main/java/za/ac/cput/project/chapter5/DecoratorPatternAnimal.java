package za.ac.cput.project.chapter5;

public abstract class DecoratorPatternAnimal implements DecoratorAnimal {

	DecoratorAnimal animal;

	public DecoratorPatternAnimal(DecoratorAnimal animal) {
		this.animal = animal;
	}
}

package za.ac.cput.project.chapter5;

public class DecoratorLivingAnimal implements DecoratorAnimal {
	@Override
	public void describe() {
		System.out.println("\nI am an animal.");
	}
}

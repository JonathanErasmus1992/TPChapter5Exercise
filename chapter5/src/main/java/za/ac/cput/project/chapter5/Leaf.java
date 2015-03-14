package za.ac.cput.project.chapter5;

public class Leaf implements ComponentPattern
{
	String name;
	
	public Leaf(String name)
	{
		this.name = name;
	}
	
	@Override
	public void sayHello()
	{
		System.out.println(name + "leaf says hello");
	}
	@Override
	public void sayGoodbye()
	{
		System.out.println(name + "leaf says goodbye");
	}
}

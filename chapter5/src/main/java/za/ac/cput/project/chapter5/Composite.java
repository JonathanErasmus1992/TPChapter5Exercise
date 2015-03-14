package za.ac.cput.project.chapter5;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ComponentPattern {

	List<ComponentPattern> components = new ArrayList<ComponentPattern>();

	@Override
	public void sayHello() 
	{
		for (ComponentPattern component : components) 
		{
			component.sayHello();
		}
	}

	@Override
	public void sayGoodbye() 
	{
		for (ComponentPattern component : components) 
		{
			component.sayGoodbye();
		}
	}

	public void add(ComponentPattern component) 
	{
		components.add(component);
	}

	public void remove(ComponentPattern component) 
	{
		components.remove(component);
	}

	public List<ComponentPattern> getComponents() 
	{
		return components;
	}

	public ComponentPattern getComponent(int index) 
	{
		return components.get(index);
	}
}
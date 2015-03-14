package za.ac.cput.project.chapter5;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactoryPattern {
	private static FlyweightFactoryPattern flyweightFactory;

	private Map<String, Flyweight> flyweightPool;

	private FlyweightFactoryPattern() 
	{
		flyweightPool = new HashMap<String, Flyweight>();
	}

	public static FlyweightFactoryPattern getInstance() 
	{
		if (flyweightFactory == null) 
		{
			flyweightFactory = new FlyweightFactoryPattern();
		}
		return flyweightFactory;
	}

	public Flyweight getFlyweight(String key) 
	{
		if (flyweightPool.containsKey(key)) 
		{
			return flyweightPool.get(key);
		} 
		else 
		{
			Flyweight flyweight;
			if ("add".equals(key)) 
			{
				flyweight = new FlyweightAdder();
			} else 
			{
				flyweight = new FlyweightMultiplier();
			}
			flyweightPool.put(key, flyweight);
			return flyweight;
		}
	}
}
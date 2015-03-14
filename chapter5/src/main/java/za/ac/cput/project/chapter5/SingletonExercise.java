package za.ac.cput.project.chapter5;

public class SingletonExercise {
	private static SingletonExercise singletonExercise = null;
	private SingletonExercise()
	{
		
	}
	public static SingletonExercise getInstance()
	{
		if(singletonExercise == null)
		{
			singletonExercise = new SingletonExercise();
		}
		return singletonExercise;
	}
	public int squarePluscube( int i)
	{
		System.out.println( i + " squared: " + i*i + "\n" + i + " cubed: " + i*i*i + "\nThe sum of the two: ");
		
		return i*i + i*i*i;
	}
}
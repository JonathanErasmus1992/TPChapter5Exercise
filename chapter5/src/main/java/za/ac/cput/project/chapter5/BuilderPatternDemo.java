package za.ac.cput.project.chapter5;

public class BuilderPatternDemo {
	public static void main(String[] args)
	{
		BuilderPattern courseBuilder = new SecondYearDiplomaCourseBuilder();
		DiplomaCourseDirector diplomaDirector = new DiplomaCourseDirector(courseBuilder);
		diplomaDirector.constructDiplomaCourse();
		DiplomaCourse diplomaCourse = diplomaDirector.getDiplomaCourse();
		System.out.println("The course is: " + diplomaCourse);
		
		System.out.println();
		System.out.println();
		
		courseBuilder = new ThirdYearDiplomaCourseBuilder();
		diplomaDirector = new DiplomaCourseDirector(courseBuilder);
		diplomaDirector.constructDiplomaCourse();
		diplomaCourse = diplomaDirector.getDiplomaCourse();
		System.out.println("The course is: " + diplomaCourse);
	}
}

package za.ac.cput.project.chapter5;

public class ThirdYearAbstractFactory implements AbstractFactoryMethod {

	public Subject getSubjectName(String subjectCode) {
		if("Development Software 3".equalsIgnoreCase(subjectCode))
		{
			return new ThirdYearDS();
		}
		else
			return new ThirdYearTP();
	}
}

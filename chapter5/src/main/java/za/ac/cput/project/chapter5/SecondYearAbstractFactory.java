package za.ac.cput.project.chapter5;

public class SecondYearAbstractFactory implements AbstractFactoryMethod {
	@Override
	public Subject getSubjectName(String subjectCode) {
		if("Development Software 2".equalsIgnoreCase(subjectCode))
		{
			return new SecondYearDS();
		}
		else
			return new SecondYearTP();
	}
}

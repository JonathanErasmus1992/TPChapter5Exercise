package za.ac.cput.project.chapter5;

public class SubjectPP implements PrototypePattern {
	private String subjectCode;
	public SubjectPP(String subjectCode)
	{
		this.subjectCode = subjectCode;
	}
	@Override
	public PrototypePattern makeCopy()
	{
		return new SubjectPP(subjectCode);
	}
	@Override
	public String toString()
	{
		return "Subject{" +
				"Subject code = '" + subjectCode + '\'' +
				'}';
	}
}

package za.ac.cput.project.chapter5;

public class LecturerPP implements PrototypePattern {
	private String name;
	
	public LecturerPP(String name)
	{
		this.name = name;
	}
	@Override
	public PrototypePattern makeCopy()
	{
		return new LecturerPP(name);
	}
	@Override
	public String toString()
	{
		return "LecturerPP{" +
				"name'" + name + '\'' +
				'}';
	}
}

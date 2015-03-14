package za.ac.cput.project.chapter5;

public class EmployeeFactoryMethod 
{
	private static EmployeeFactoryMethod employeeFactoryMethod;
	private EmployeeFactoryMethod() 
	{

	}
	public static EmployeeFactoryMethod getInstance() 
	{
		if (employeeFactoryMethod == null) 
		{
			employeeFactoryMethod= new EmployeeFactoryMethod();
		}
		return employeeFactoryMethod;
	}
	public Employee getEmployeeRole(String employee)
	{
		if("Lecturer".equalsIgnoreCase(employee))
		{
			return new Lecturer();
		}
		else
		{
			return new Secretary();
		}
	}
}

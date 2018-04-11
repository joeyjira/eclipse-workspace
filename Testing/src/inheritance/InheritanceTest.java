package inheritance;

public class InheritanceTest 
{
	public static void main(String[] args)
	{
		Employee joey = new Employee("Joey", 24);
		Employee michael = new Manager("Michael", 24, 50000);
		Employee kevin = new Employee("Kevin", 24);
		
		Employee[] company = new Employee[] {joey, michael, kevin};
		
		Object nixon = new Employee("Nixon", 24);
		
		michael.getInfo();
		((Manager) michael).getInfo(2);
	}
}

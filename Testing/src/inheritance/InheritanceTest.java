package inheritance;

public class InheritanceTest 
{
	public static void main(String[] args)
	{
		Employee joey = new Employee("Joey", 24);
		Manager michael = new Manager("Michael", 24, 50000);
		Employee kevin = new Employee("Kevin", 24);
		
		Employee[] company = new Employee[] {joey, kevin, michael};
		company[0].getInfo();
		((Manager) company[2]).getInfo();
	}
}

import abstractClasses.*;

public class EqualityTest 
{
	public static void main(String[] args)
	{
		Person[] people = new Person[4];
		
		people[0] = new Employee("Harry Hacker", 100000, 2018, 3, 1);
		people[1] = new Student("Carry Cracker", "Literature");
		people[2] = new Employee("Harry Hacker", 100000, 2018, 3, 1);
		
		System.out.println();
	}
}

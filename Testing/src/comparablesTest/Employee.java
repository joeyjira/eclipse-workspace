package comparablesTest;

import java.util.Arrays;

public class Employee implements Comparable
{
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee other = (Employee) o;
		return (int) (this.salary - other.salary);
	}
	
	public String toString()
	{
		return this.getClass().getName() + "[name=" + this.name + ", salary=" + this.salary + "]";
	}
	
	public static String interfaceCheck(Comparable o)
	{
		return "This is comparable";
	}
	
	public static void main(String[] args)
	{
		Employee[] employees = new Employee[] {new Employee("Joey",3000), 
				new Employee("Ben", 1500), new Employee("Ho", 4000)};
		System.out.println(Arrays.deepToString(employees));
//		Arrays.sort(employees);
		Arrays.sort(employees, (Employee first, Employee second) -> first.name.length() - second.name.length());
		System.out.println(Arrays.deepToString(employees));
		
		System.out.println(employees instanceof Comparable[]);
		System.out.println(Employee.interfaceCheck(employees[0]));
	}
}

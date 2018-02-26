package comparablesTest;

import java.util.Arrays;

public class Employee implements Comparable<Employee>
{
	private double salary;
	
	public Employee(double salary)
	{
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return (int) (this.salary - o.salary);
	}
	
	public String toString()
	{
		return "" + this.salary;
	}
	
	public static void main(String[] args)
	{
		Object[] employees = new Employee[] {new Employee(3000), new Employee(1500), new Employee(4000)};
		System.out.println(Arrays.deepToString(employees));
		Arrays.sort(employees);
		System.out.println(Arrays.deepToString(employees));
		
		System.out.println(employees[0] instanceof Comparable);
	}
}

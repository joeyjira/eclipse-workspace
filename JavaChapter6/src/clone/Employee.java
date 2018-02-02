package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable
{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		this.hireDay = new Date();
	}
	
	public Employee clone() throws CloneNotSupportedException
	{
		// call Object.clone()
		Employee cloned = (Employee) super.clone();
		
		// clone mutable fields
		cloned.hireDay = (Date) hireDay.clone();
		
		return cloned;
	}
}

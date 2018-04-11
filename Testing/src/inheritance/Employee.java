package inheritance;

public class Employee 
{
	private String name;
	private int age;
	
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getInfo()
	{
		System.out.println("My name is " + name + ", and I'm " + age + " years old.");
		return "what";
	}
	
	public String toString()
	{
		return "toString method";
	}
	
	public String notToString()
	{
		return "not toString";
	}
}

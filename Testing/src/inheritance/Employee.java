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
	
	public void getInfo(int a)
	{
		System.out.println("My name is " + name + ", and I'm " + age + " years old.");
	}
}
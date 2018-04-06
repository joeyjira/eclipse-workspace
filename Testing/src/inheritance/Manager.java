package inheritance;

public class Manager extends Employee
{
	private double bonus;
	
	public Manager(String name, int age, double bonus)
	{
		super(name, age);
		this.bonus = bonus;
	}
	
	public void getInfo(int a)
	{
		System.out.println("I am a manager and I have a bonus of " + bonus);
	}
}

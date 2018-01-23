package com.jira.corejava;
import java.time.LocalDate;
import java.util.Random;

public class Employee
{
	private static int nextId;
	
	private int id;
	private String name = ""; // instance field initialization
	private double salary;
	private LocalDate hireDay;
	
	// static initialization block
	static
	{
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}
	
	// object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	// four overloaded constructors
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public Employee(double s)
	{
		// calls the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}
	
	// default constructor
	public Employee()
	{
		// name initialized to "" --see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double percentage) 
	{
		double raise = salary * ((100 + percentage) / 100); 
		salary += raise;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
}
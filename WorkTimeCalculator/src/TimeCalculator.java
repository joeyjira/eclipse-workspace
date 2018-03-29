import java.util.ArrayList;
import java.util.Scanner;

public class TimeCalculator 
{
	ArrayList<WorkDay> days = new ArrayList<>();
	
	public static void main(String[] args)
	{
		TimeCalculator calculator = new TimeCalculator();
		
		System.out.println("Hello Anne! Let me help you do math");
		calculator.getWorkTime();
		calculator.showTotalMinutes();
	}
	
	public void getWorkTime() 
	{
		Scanner in = new Scanner(System.in);
		boolean answer = true;
		
		while (answer) 
		{
			System.out.println("Input date: (Month/Date)");
			String date = in.nextLine();
			
			System.out.println("Input sign in time (00:00 - 23:59):" );
			String signIn = in.nextLine();
			
			System.out.println("Input sign out time (00:00 - 23:59):" );
			String signOut = in.nextLine();
			
			days.add(new WorkDay(date, signIn, signOut));
			
			System.out.println("Add another time (Y/N?):");
			String ans = in.nextLine();
			if (!ans.equals("Y")) answer = false;
		}
	}
	
	public void showTotalMinutes()
	{
		int totalMinutes = 0;
		for (int i = 0; i < days.size(); i++)
		{
			totalMinutes += days.get(i).getTotalMinutesWorked();
		}
		System.out.print("This week you worked for " + totalMinutes / 60 + " hours " + totalMinutes % 10 + " minutes");
	}
}

import java.util.*;

public class ControlFlowTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter employee name: ");
		String name = in.nextLine();
		
		System.out.println("Enter employee sales number: ");
		int salesNumber = in.nextInt();
		
		if (salesNumber > 1000)
		{
			String performance = "Excellent";
			int bonus = 1000;			
		}
		
		System.out.println("Confirm employee name and salary: y/n");
		String confirmation = in.next();
		
		if (confirmation.equals("y"))
		{
			System.out.println("Data input confirmed");
		}
		else 
		{
			System.out.println("Restart program");
		}
//		System.out.println(0x12);
	}

}

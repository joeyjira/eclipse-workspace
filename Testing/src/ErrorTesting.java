import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ErrorTesting 
{
	public static String removeLastLetter(String word) throws IOException
	{
		String temp = word;
		return temp.substring(0, temp.length() - 1);
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String message = in.next();
		Logger.getGlobal().info("Input=" + message);;
		try 
		{
			System.out.println(ErrorTesting.removeLastLetter(message));	
		}
		catch (IOException e)
		{
			System.out.println("I was ran");
			e.getMessage();
		}
	}
}

package MyTimer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class StringTesting implements Predicate<String>
{
	public boolean test(String string)
	{
		return string.length() > 6;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "It is me", "Wow", "oh lord", "this will work"));
		StringTesting objectWay = new StringTesting();
		Predicate<String> lamdaWay = (String string) -> string.length() < 10;
		list.removeIf(lamdaWay);
		System.out.println(list);
	}
}


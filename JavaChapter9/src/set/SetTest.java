package set;

import java.util.*;

public class SetTest 
{
	public static void main(String[] args)
	{
		Set<String> words = new HashSet<>();
		long totalTime = 0;
		
		try (Scanner in = new Scanner(System.in))
		{
			String hello = in.next();
			while (in.hasNext())
			{
				String word = in.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
			System.out.println(hello);
		}
		
		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println(". . .");
		System.out.println(words.size() + " distince words. " + totalTime + " milliseconds.");
	}
}

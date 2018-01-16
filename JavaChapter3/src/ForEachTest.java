import java.util.Arrays;

public class ForEachTest {
	public static void main(String[] args)
	{
		int[] a = new int[10];
		int counter = 0;
		
		for (int element: a)
		{
			counter += 3;
			element = counter;
			System.out.println(element);
		}
		
		System.out.println(Arrays.toString(a));
	}
}

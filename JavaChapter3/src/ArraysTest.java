
public class ArraysTest {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = i;
			System.out.print(a[i]);
		}
		
		String[] s = new String[10];
		for (int i = 0; i < s.length; i++)
		{
			s[i] = "1";
			System.out.println(s[i]);
		}
	}
}

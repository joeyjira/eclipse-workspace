import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String[] args)
	{
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		smallPrimes = Arrays.copyOf(smallPrimes, smallPrimes.length * 2);
		System.out.println(Arrays.toString(smallPrimes));
	}
}

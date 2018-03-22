import java.util.Scanner;

public class BinarySearch 
{
	public static int binarySearch(int[] array, int left, int right, int target)
	{
		int middle = left + right >>> 1;
		System.out.println(middle);
		
		if (right >= left)
		{
			if (target == array[middle])
				return middle;
			else if (target < array[middle])
				return binarySearch(array, left, middle - 1, target);
			else if (target > array[middle])
				return binarySearch(array, middle + 1, right, target);
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] testArray = new int[] {-10, -7, -6, -3, -1, 0, 2, 4, 6, 7, 12, 13, 15, 23};
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		System.out.println(BinarySearch.binarySearch(testArray, 0, testArray.length - 1, target));
		in.close();
	}
}

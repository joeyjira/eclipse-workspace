
public class BinarySearch 
{
	public static int binarySearch(int[] a, int startIndex, int endIndex, int x)
	{
		int middleIndex = a.length / 2;
		
		if (a[middleIndex] == x)
		{
			return x;
		} 
		else if (x < a[middleIndex])
		{
			binarySearch(a, 0, middleIndex, x);
		}
		else 
		{
			binarySearch(a, middleIndex, endIndex, x);
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] testArray = new int[] {2, 4, 6, 7, 12, 13, 15, 23, 27};
		System.out.println(BinarySearch.binarySearch(testArray, 0, testArray.length - 1, 2));
	}
}

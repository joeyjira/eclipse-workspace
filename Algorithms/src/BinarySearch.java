
public class BinarySearch 
{
	public static int binarySearch(int[] a, int startIndex, int endIndex, int x)
	{
		int middleIndex = ((endIndex - startIndex) / 2) + startIndex;

		System.out.println("startIndex=" + startIndex + ",endIndex=" + endIndex + ",middleIndex=" + middleIndex);
		if (endIndex >= 1) 
		{
			if (x == a[middleIndex])
			{
				System.out.println("FOUND!");
				return middleIndex;
			} 
			else if (x < a[middleIndex])
			{
				return binarySearch(a, 0, middleIndex, x);
			}
			else if (x > a[middleIndex])
			{
				return binarySearch(a, middleIndex + 1, endIndex, x);
			}
		}	
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] testArray = new int[] {2, 4, 6, 7, 12, 13, 15, 23, 27};
		System.out.println(BinarySearch.binarySearch(testArray, 0, testArray.length - 1, 27));
	}
}

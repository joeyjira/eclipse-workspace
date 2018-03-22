
public class MyMergeSort 
{
	public static int[] sort(int[] arr, int l, int r)
	{
		if (l < r)
		{
			int m = l + r >>> 1;
			
			sort(arr, l, m);
			sort(arr, m + 1, r);
			
			merge(arr, l, m, r);
		}
		return arr;
	}
	
	private static void merge(int[] arr, int l, int m, int r)
	{
		int leftLength = m - l + 1;
		int rightLength = r - m;
		
		int[] leftTemp = new int[leftLength];
		int[] rightTemp = new int[rightLength];
		
		for (int i = 0; i < leftLength; i++)
			leftTemp[i] = arr[l + i];
		for (int j = 0; j < rightLength; j++)
			rightTemp[j] = arr[m + 1 + j];
		
		int i = 0, j = 0;
		
		int k = l;
		while (i < leftLength && j < rightLength)
		{
			
		}
	}
}

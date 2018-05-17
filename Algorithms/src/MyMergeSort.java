
public class MyMergeSort 
{
	public <T extends Comparable> void sort(Comparable<T>[] array, int left, int right) 
	{
		int middle = array.length >> 1;
		
		sort(array, left, middle);
		sort(array, middle + 1, right);
	}
	
	public <T extends Comparable> Comparable<T>[]   merge(Comparable<T> left, Comparable<T> right)
	{
		Integer[] integers = new Integer[] {1, 2, 3, 4, 5};
		return integers;
	}
}

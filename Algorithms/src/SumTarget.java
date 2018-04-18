import java.util.*;

public class SumTarget {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> table = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
            // {element: index}
			table.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++)
		{
			int complement = target - nums[i];
			System.out.println(complement);
			if (table.containsKey(complement))
//                if (table.get(complement) == i) cn ontinue; 
				System.out.println(table.get(complement));
				return new int[] { i, table.get(complement) };
		}
		
		return new int[] {};
    }
	
	public static void main(String[] args)
	{
		SumTarget summer = new SumTarget();
		int[] array = {2, 5, 5, 11};
		System.out.println(Arrays.toString(summer.twoSum(array, 10)));
	}
}

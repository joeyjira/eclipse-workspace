
public class TwoSum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int pivot = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i == pivot) continue;
            if (nums[pivot] + nums[i] == target) return new int[] {pivot, i};
            if (i == nums.length -1 && pivot != nums.length - 1)
            {
                pivot++;
                i = 0;
            }
        }
        return null;
    }
}

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangle 
{
	   static class Range {
	        public final int L;
	        public final int H;
	        public Range(int l, int h) {
	            L = l;
	            H = h;
	        }
	    }
	    
	    public int largestRectangleArea(int[] heights) {
	        
	        if (heights.length == 0) {
	            return 0;
	        }
	        
	        // The idea is just to find a min height within a range, and multiply the range by that minimum height.
	        // Then, we do the same for each adjacent range (but not including the min bar)
	        
	        int maxArea = 0;
	        Deque<Range> stack = new ArrayDeque<>();
	        
	        stack.offerFirst(new Range(0, heights.length-1));
	        
	        while (!stack.isEmpty()) {
	            Range r = stack.pollFirst();
	            
	            int minIndex = findMin(heights, r.L, r.H);
	            int min = heights[minIndex];
	            
	            // Because all bars in this range have a height of at least min
	            int area = min * (1 + r.H - r.L);
	            
	            // Store the largest area so far
	            maxArea = Math.max(maxArea, area);
	            
	            if (r.L >= r.H) {
	                // Because this range doesn't have any adjacent ones, so there's nothing to add to stack
	                continue;
	            }
	            
	            // Add adjacent ranges
	            if (minIndex > r.L) {
	                stack.offerFirst(new Range(r.L, minIndex-1));
	            }
	            if (minIndex < r.H) {
	                stack.offerFirst(new Range(minIndex+1, r.H));
	            }
	        }
	        return maxArea;
	    }
	    
	    /** Finds the min height's index within a range of heights **/
	    private int findMin(int[] heights, int lo, int hi) {
	        int minIndex = lo;
	        for (int i = lo+1; i <= hi; i++) {
	            if (heights[i] < heights[minIndex]) {
	                minIndex = i;
	            }
	        }
	        return minIndex;
	    }
}

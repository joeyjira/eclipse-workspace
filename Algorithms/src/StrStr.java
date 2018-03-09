
public class StrStr 
{
	class Solution {
	    public int strStr(String haystack, String needle) 
	    {   
	        int counter = 0;
	        int result = -1;
	        
	        if (haystack.equals(needle)) return 0;
	        
	        if (haystack.length() == 0 || needle.length() == 0 || needle.length() > haystack.length())
	            return result;
	        
	        for (int i = 0; i < haystack.length(); i++)
	        {
	            if (haystack.charAt(i) != needle.charAt(0)) continue;
	            if (i + needle.length() + 1 > haystack.length()) break; 
	            
	            if (haystack.substring(i, i + needle.length()).equals(needle))
	            {
	                result = i;
	                return result;
	            }
	        }
	        
	        return result;
	    }
	}
}

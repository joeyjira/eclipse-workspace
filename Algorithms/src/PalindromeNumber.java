
public class PalindromeNumber 
{
    public boolean isPalindrome(int x) 
    {  
        int integer = x;
        if (integer < 0) return false;
        else if (integer == 0) return true;
        StringBuilder str = new StringBuilder();
        
        while (integer > 0)
        {
            str.append(Integer.toString(integer % 10));
            integer /= 10;
        }
        System.out.println(str.reverse().toString());
        return str.toString().equals(str.reverse().toString());
    }
    
    public static void main(String[] args)
    {
    		PalindromeNumber pn = new PalindromeNumber();
    		System.out.println(pn.isPalindrome(1));
    }
}


public class MyMathPow 
{
	public double myPow(double x, int n) 
	{
        if(n < 0)
            return 1.0/(x*myPowHelper(x, -1*n-1));
        return myPowHelper(x, n);
    }
	
    private double myPowHelper(double x, int n) 
    {
        if(n == 0) return 1;
        if(x == 0) return 0;
        double p = myPowHelper(x, n/2);
        p = p*p;
        if(n%2 != 0)
            p = p*x;
        
        return p;
    }
}

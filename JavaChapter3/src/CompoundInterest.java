
public class CompoundInterest {
	public static void main(String[] args)
	{
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		// set interest rates to 10 . . . 15%
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.0;
		
		
	}
}

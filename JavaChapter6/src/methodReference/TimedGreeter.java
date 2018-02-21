package methodReference;

import javax.swing.Timer;

public class TimedGreeter extends Greeter
{
	public void greet()
	{
		Timer t = new Timer(1000, x -> super.greet());
		t.start();
	}
	
	public static void main(String[] args)
	{
		new TimedGreeter().greet();
	}
}

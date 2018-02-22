package methodReference;

import javax.swing.Timer;

public class TimedGreeter extends Greeter
{
	public void greet()
	{
		Greeter hello = new Greeter();
		Timer t = new Timer(1000, super::greet);
		t.start();
	}
	
	public static void main(String[] args)
	{
		new TimedGreeter().greet();
	}
}

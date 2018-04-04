package MyTimer;

import java.util.Date;
import java.util.logging.Logger;

public class MyTimer 
{
	private int delay;
	private Runnable function;
	private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");
	
	public MyTimer(int delay, Runnable function)
	{
		this.delay = delay;
		this.function = function;
	}
	
	public void start()
	{
		myLogger.entering("MyTimer.MyTimer", "start");
		long time = new Date().getTime();
		long nextTime = time + this.delay;
		boolean tracker = true;
		
		while (tracker)
		{
			if (new Date().getTime() == nextTime)
			{
				this.function.run();
				time = new Date().getTime();
				nextTime = time + this.delay;
			}
		}
		myLogger.exiting("MyTimer.MyTimer", "start");
	}

	public static void main(String[] args)
	{
		MyTimer timer = new MyTimer(1000, () -> System.out.println("Hello"));
		timer.start();
	}
}

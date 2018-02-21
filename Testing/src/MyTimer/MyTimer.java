package MyTimer;

import java.util.Date;

public class MyTimer 
{
	private int delay;
	private Runnable function;
	
	public MyTimer(int delay, Runnable function)
	{
		this.delay = delay;
		this.function = function;
	}
	
	public void start()
	{
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
	}

	public static void main(String[] args)
	{
		MyTimer timer = new MyTimer(1000, () -> System.out.println("Hello"));
		timer.start();
	}
}

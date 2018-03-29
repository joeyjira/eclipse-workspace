import java.util.Date;

public class WorkDay
{	
	String workDate;
	String signInTime;
	String signOutTime;
	int totalMinutesWorked;
	
	
	
	public WorkDay(String aWorkDate, String aSignInTime, String aSignOutTime)
	{
		workDate = aWorkDate;
		signInTime = aSignInTime;
		signOutTime = aSignOutTime;
		{
			System.out.println(signInTime);
			System.out.println(signOutTime);
			String[] timeArrayIn = signInTime.split(":");
			String[] timeArrayOut = signOutTime.split(":");
			
			int inMinutes = Integer.parseInt(timeArrayIn[0]) * 60 + Integer.parseInt(timeArrayIn[1]);
			int outMinutes = Integer.parseInt(timeArrayOut[0]) * 60 + Integer.parseInt(timeArrayOut[1]);
			totalMinutesWorked = outMinutes - inMinutes;
		}
	}
	
	public String getHoursWorked()
	{	
		return "" + totalMinutesWorked / 60 + " hours " + totalMinutesWorked % 60;
	}
	
	public int getTotalMinutesWorked() 
	{
		return totalMinutesWorked;
	}
	
	public String toString()
	{
		return this.getClass() + "[workDate=" + workDate + ", signInTime=" + signInTime
				+ ", signOutTime=" + signOutTime + "]";
	}
}

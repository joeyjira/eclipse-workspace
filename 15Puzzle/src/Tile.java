
public class Tile 
{
	private int value;
	
	public Tile(int value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		return getClass().getName() + "[value=" + value + "]";
	}
	
	public int getValue()
	{
		return this.value;
	}
}

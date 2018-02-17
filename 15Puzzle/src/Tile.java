
public class Tile 
{
	private int value;
	private int position;
	
	public Tile(int value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		return getClass().getName() + "[value=" + value + ", position=" + position + "]";
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void setPosition(int position)
	{
		this.position = position;
	}
}

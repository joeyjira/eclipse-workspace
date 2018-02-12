
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
		return getClass().getName() + "[value=" + value + "]";
	}
	
	public static void main(String[] args)
	{
		System.out.println(new Tile(1));
	}
}

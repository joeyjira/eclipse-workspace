import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Board 
{
	private Tile[][] board = new Tile[4][4];
	
	public Board()
	{
		
	}
	
	public Tile[] getTiles() 
	{
		Tile[] tiles = new Tile[16];
		for (int i = 1; i <= 15; i++)
		{
			tiles[i] = new Tile(i);
		}
		
		return tiles;
	}
	
	public Tile[] shuffleTiles(Tile[] tiles)
	{
		  Random rnd = ThreadLocalRandom.current();
		    for (int i = tiles.length - 1; i > 0; i--)
		    {
		      int index = rnd.nextInt(i + 1);
		      // Simple swap
		      Tile a = tiles[index];
		      tiles[index] = tiles[i];
		      tiles[i] = a;
		    }
		return tiles;
	}
}

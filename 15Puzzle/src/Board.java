import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Board 
{
	private Tile[][] board;
	
	public static Tile[][] getBoard()
	{
		this.board = new Board();
		Tile[] tiles = Board.getTiles();
		tiles = shuffleTiles(tiles);
		for (Tile t : tiles)
		{
			int row = 0;
			int column = 0;
			board[row][column] = t;
		}
		return board;
	}
	
	public Board()
	{
		board = new Tile[4][4];
	}
	
	public static Tile[] getTiles() 
	{
		Tile[] tiles = new Tile[16];
		for (int i = 0; i <= 15; i++)
		{
			tiles[i] = new Tile(i);
		}
		
		return tiles;
	}
	
	public static Tile[] shuffleTiles(Tile[] tiles)
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

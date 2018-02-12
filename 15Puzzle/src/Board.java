import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Board 
{
	private Tile[][] board;
	
	public static Board getBoard(int n)
	{
		Board gameBoard = new Board(n);
		Tile[] tiles = Board.getTiles();
		for (int i = 0; i < tiles.length; i++)
		{
			int row = 0;
			int column = 0;
			
			gameBoard.board[row][column] = tiles[i];
			column++;
			if (column == 3) break;
			
//			if (column == 3)
//			{
//				row++;
//				column = 0;
//			}
		}
		return gameBoard;
	}
	
	public Board(int size)
	{
		board = new Tile[size][size];
	}
	
	private static Tile[] getTiles() 
	{
		Tile[] tiles = new Tile[16];
		for (int i = 0; i <= 15; i++)
		{
			tiles[i] = new Tile(i);
		}
		
		return tiles;
	}
	
	public Tile[][] showBoard()
	{
		return board;
	}
	
	private static Tile[] shuffleTiles(Tile[] tiles)
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
	
	public static void main(String[] args)
	{
		System.out.println(Arrays.deepToString(Board.getBoard(4).showBoard()));
//		System.out.println(Arrays.toString(Board.getTiles()));
	}
}

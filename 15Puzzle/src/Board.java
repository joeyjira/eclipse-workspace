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
		tiles = shuffleTiles(tiles);
		
		int row = 0;
		int column = 0;
		for (int i = 0; i < tiles.length; i++)
		{
			tiles[i].setPosition(i + 1);
			gameBoard.board[row][column] = tiles[i];
			column++;
			
			if (column == 4)
			{
				row++;
				column = 0;
			}
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
	
	public void showBoard()
	{
		for (Tile[] row : board)
		{
			for (Tile tile : row)
			{
				System.out.print(" " + tile.getValue() + " ");
			}
			System.out.println();
		}
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
		Board.getBoard(4).showBoard();
	}
}

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Board 
{
	private Tile[][] board;
	private int[] emptySpace;
	
	public static Board getBoard(int n)
	{
		Board gameBoard = new Board(n);
		Tile[] tiles = Board.getTiles();
		tiles = shuffleTiles(tiles);
		
		int row = 0;
		int column = 0;
		for (int i = 0; i < tiles.length; i++)
		{
			gameBoard.board[row][column] = tiles[i];
			
			if (tiles[i].getValue() == 0)
			{
				gameBoard.emptySpace = new int[] {row, column};
			}
			
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
	
	private int[] findEmptySpace()
	{
		return emptySpace;
	}
	
//	private int[][] possibleTilesToSwap()
//	{
//		if ()
//	}
//	
	public void showBoard()
	{
		for (Tile[] row : board)
		{
			for (Tile tile : row)
			{
				if (tile.getValue() == 0)
				{
					System.out.print("");
				}
				else 
				{					
//					System.out.print(" " + tile.getValue() + " ");
					System.out.printf("%-10d", tile.getValue());
				}
			}
			System.out.println();
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
		Board board = Board.getBoard(4);
		board.showBoard();
		System.out.println(Arrays.toString(board.emptySpace));
	}
}

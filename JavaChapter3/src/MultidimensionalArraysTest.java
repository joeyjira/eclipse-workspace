import java.util.Arrays;

public class MultidimensionalArraysTest {
	public static void main(String[] args)
	{
		int[][] magicSquare;
		magicSquare = new int[4][4];
//		int[][] magicSquare = 
//			{
//					{16, 3, 2, 13},
//					{5, 10, 11, 8},
//					{9, 6, 7, 12},
//					{4, 15, 14, 1}
//			};
		System.out.print(Arrays.deepToString(magicSquare));
	}
}

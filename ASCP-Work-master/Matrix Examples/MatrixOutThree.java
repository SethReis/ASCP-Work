// A+ Computer Science
// www.apluscompsci.com

//Matrix output example 3 

import static java.lang.System.*;

public class MatrixOutThree
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};

		
		for(int row = 0; row < mat.length; row++){
		    System.out.print("row " + row + "\t");
		    for(int col = 0; col < mat[row].length; col++) {
		        System.out.print(mat[row][col] + "\t");
		    }
		    System.out.println();
		}
		
	}
}

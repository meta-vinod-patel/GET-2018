public class Assignment2
{
    //this will print the solution
/*    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }*/
 
    //to check that the current position of the queen is safe or not 
    boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
 
        //to check in the column 
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        
        //to check upper diagonal 
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;
        
        //to check lower diagonal
        for (i=row, j=col; j>=0 && i<board.length; i++, j--)
            if (board[i][j] == 1)
                return false;
        
        //this shows that the queen can be place on the position on the board[row][col];
        return true;
    }
 
    
    boolean solveNQueen(int board[][], int col)
    {

        //return true if all queens or last queen is placed on the right position
    	if (col >= board.length)
            return true;
 
    	//considering on column we place queen one by one in different position in the row
        for (int i = 0; i < board.length; i++)
        {
        	//we check every time is this position is safe for queen by calling the funtion
            if (isSafe(board, i, col))
            {
            	//if this function return true we place the queen by doing below statement
                board[i][col] = 1;
 
                //and now we check for the next place for the queen
                if (solveNQueen(board, col + 1) == true)
                    return true;

                board[i][col] = 0; //this is backtracking 
                				   //if above statement is false we set the position of the queen to zero
            }
        }
 
        //false than we check for the next row.
        return false;
    }
 
    boolean solveNQ(int board[][],int startRow, int dimensionOfMatrix)
    {
 
        if (solveNQueen(board, 0) == false)
        {
            return false;
        }
 
        //printSolution(board);
        return true;
    }
 

    public static void main(String args[])
    {
    	int board[][] = new int[][] {{0,0},{0,0}};
    	boolean result;
        Assignment2 Queen = new Assignment2();
        result = Queen.solveNQ(board,0,4);
        System.out.print(result);
    }
}
package Lecture_8;

public class Queens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new  boolean[n][n];
    }
    public static void nqueens(boolean[][]  board,int row){
        if(row==board.length) {
            //display
            return;
        }
        for (int col = 0; col <board.length ; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nqueens(board,row+1);
                board[row][col]=false;
            }

        }

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //forup
        for (int r = 0; r <row ; r++) {
            if(board[r][col]){
                return  false;
            }
        }
        int min=Math.min(row,col);
        for (int i = 0; i <=min ; i++) {
            if(board[row-1][col-1]){
                return false;
            }

        }
        min=Math.min(row,board.length-1-col);
        for (int i = 1; i <=min ; i++) {
            if(board[row-i][col+1]){
                return false;
            }

        }
        return true;
    }
    private static void display(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                System.out.print(board[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
    }
}

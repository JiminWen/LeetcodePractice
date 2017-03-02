public class TicTacToe {
    int[] rows;
    int[] cols;
    int dia,anti_dia;
    int size;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
    rows=new int[n];
    cols=new int[n];
    size=n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
    int add=player==1?-1:1;
    rows[row]+=add;
    cols[col]+=add;
    if(row==col) dia+=add;
    if(row+col==size-1) anti_dia+=add;
    
    if(Math.abs(rows[row])==size||Math.abs(cols[col])==size||Math.abs(dia)==size||Math.abs(anti_dia)==size) return player;
    return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
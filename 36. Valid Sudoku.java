public class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<=board.length-1;++i){
        HashSet<Character> col=new HashSet<>();
        HashSet<Character> row=new HashSet<>();
        HashSet<Character> block=new HashSet<>();
        for(int j=0;j<=board[0].length-1;++j){
            if(board[i][j]!='.'&&!col.add(board[i][j])){
                return false;
            }
            if(board[j][i]!='.'&&!row.add(board[j][i])){
                return false;
            }
            if(board[3*(i/3)+j/3][3*(i%3)+j%3]!='.'&&!block.add(board[3*(i/3)+j/3][3*(i%3)+j%3])){
                return false;
            }
        }
    }
    return true;
    }
}
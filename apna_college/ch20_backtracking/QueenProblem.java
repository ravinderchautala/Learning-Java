package apna_college.ch20_backtracking;
import java.util.*;

public class QueenProblem {

    public static boolean isSafe(int row,int col,char[][] board){
        // vertical
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // horizontal
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // Upper Right
        int r = row;
        for(int c=col;c>=0 && r<board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        // Upper Left
        r = row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // lower left
        r = row;
        for(int c=col;r>=0 && c<board.length;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // lower right
        r = row;
        for(int c=col;r<board.length && c<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board,List<List<String>> allBoard){
        String row = "";
        List<String> newBoard =new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j =0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='_';
                }
                newBoard.add(row);
            }
            allBoard.add(newBoard);
        }
    }

    public static void helper(char[][] board,List<List<String>> allBoards,int col ){
        if(col==board.length){
            saveBoard(board , allBoards);
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row, col,board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
            }
        }
    }
    public static List<List<String>> solveQueen(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveQueen(n));
    }
}

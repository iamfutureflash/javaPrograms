package JavaByApnaCollage;

import java.util.ArrayList;
import java.util.List;

public class CJPC_L20_Backtracking_N_Queens_Problem_Permutations_Lecture_20 {
    public static void printPermutations(String str, String prem){
        if(str.length() == 0){
            System.out.print(" " + prem + " ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutations(newStr,prem + currChar);
        }
    }
    public static boolean isSafe(int row , int col, char[][] board){
        // horizontal line
        for(int j = 0; j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        // vertical line
        for(int i = 0; i<board.length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // upper left
        int r = row;
        for(int c = col; c>=0 && r>=0;c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // upper right
        r = row;
        for(int c = col; c<board.length && r>=0;c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // LOWER LEFT
        r = row;
        for(int c = col; c>=0 && r< board.length;c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // lower right
        for(int c = col; c<board.length && r< board.length;c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newboard = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
        row = "";
        for(int j = 0; j < board[0].length; j++){
            if(board[i][j] == 'Q'){
                row+='Q';
            }else{
                row += '.';
            }
        }
        newboard.add(row);
        }
        allBoards.add(newboard);
    }
    public static void helper(char[][] board,List<List<String>> allBoards, int col ){
        if(col== board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        //
        System.out.println(solveNQueens(4));
    }
}
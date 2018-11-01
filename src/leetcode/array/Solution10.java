package leetcode.array;

public class Solution10 {
    public boolean isValidSudoku(char[][] board) {
    	
    	
    	
    	
		return false;
    }
    public static void main(String[] args){
    	char[][] board = new char[][]{
    	                               {'5','3','.','.','7','.','.','.','.'},
    	                               {'6','.','.','1','9','5','.','.','.'},
    	                               {'.','9','8','.','.','.','.','6','.'},
    	                               {'8','.','.','.','6','.','.','.','3'},
    	                               {'4','.','.','8','.','3','.','.','1'},
    	                               {'7','.','.','.','2','.','.','.','6'},
    	                               {'.','6','.','.','.','.','2','8','.'},
    	                               {'.','.','.','4','1','9','.','.','5'},
    	                               {'.','.','.','.','8','.','.','7','9'}
    	                             };
    	Solution10 solution10=new Solution10();
    	boolean len=solution10.isValidSudoku(board);
    	
    	System.out.println(len)	;
    
    }
}

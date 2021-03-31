//Game of Life
// Time Complexity :O(m*n) m = number of rows, n = no of cols
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Did not find optimized solution



// Your code here along with comments explaining your approach
public class Problem2 {

    public static void main(String[] args){
        int[] [] board = {{1,1},{1,0}};
        gameOfLife(board);


    }
    public static  void gameOfLife(int[][] board) {
        //<2 live , dies
        //2-3, lives
        //>3 dies
        //dead have 3 live, lives
        int row = board.length;
        int col = board[0].length;
        int[][] res = new int[row][col];
        for(int i = 0;i< row; i++){
            for(int j = 0;j< col; j++){
                if(board[i][j] == 0){
                    if(ifNotDead(board, i, j)){
                        res[i][j] = 1;
                    }
                    else
                        res[i][j] = 0;
                }
                else{
                    if(ifDead(board, i , j)){
                        res[i][j] = 0;
                    }
                    else
                        res[i][j] = 1;
                }
            }
        }
        System.out.println("The result array is");
        for(int i = 0;i< row; i++){
            for(int j = 0;j< col; j++){
                System.out.print(res[i][j]);
                board[i][j] = res[i][j];
            }
            System.out.println();
        }
        
    }
    public static boolean ifNotDead(int[][] board, int i , int j){
        ///check all 8 sides to find if we have exactly 
        // 3 live neighbours
        int count = 0;
        int n = board.length;
        int m = board[0].length;
        if(i-1 >= 0){
            if(board[i-1][j] ==1){
                count++;
            }
            if(j-1 >=0){
                if(board[i-1][j-1]==1){
                    count++;
                }
               
                
            }
            if(j+1 < m){
                if(board[i-1][j+1] ==1)
                    count++;
            }
           
        }
        if(i+1 < n){
            if(board[i+1][j]==1)
                count++;
            if(j-1 >=0){
                if(board[i+1][j-1]==1){
                    count++;
                }
               
                
            }
            if(j+1 < m){
                if(board[i+1][j+1] ==1)
                    count++;
            }
            
        }
        if(j-1 >= 0){
            if(board[i][j-1] ==1)
                count++;

        }
        if(j+1 <m){
            if(board[i][j+1] ==1)
                count++;

        }
        // System.out.println("Live cells near DEAD "+count);
        if(count ==3)
            return true;
        else
            return false;
        
        
    }
    public static boolean ifDead(int[][] board, int i, int j){
        int count = 0, n = board.length,  m = board[0].length;
        if(i-1 >= 0){
            if(board[i-1][j] ==1){
                count++;
            }
            if(j-1 >=0){
                if(board[i-1][j-1]==1){
                    count++;
                }
               
                
            }
            if(j+1 < m){
                if(board[i-1][j+1] ==1)
                    count++;
            }
           
        }
        if(i+1 < n){
            if(board[i+1][j]==1)
                count++;
            if(j-1 >=0){
                if(board[i+1][j-1]==1){
                    count++;
                }
            }
            if(j+1 < m){
                if(board[i+1][j+1] ==1)
                    count++;
            }
            
        }
        if(j-1 >= 0){
            if(board[i][j-1] ==1)
                count++;    
        }
        if(j+1 <m){
            if(board[i][j+1] ==1)
            count++;
             
        }
        // System.out.println("Live cells near Live "+count);
        if(count <2)
            return true;
        if(count ==2 || count ==3){
            return false;
        }
        else
            return true;
        
    }

    
}

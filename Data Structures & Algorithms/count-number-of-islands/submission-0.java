class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(i,j,grid);
                }
            }
        }
        return islands;
        
    }

    private void dfs(int row , int col , char[][] grid){
        int newRow = grid.length;
        int newCol = grid[0].length;

        if(row < 0 || col < 0 || row >= newRow || col >= newCol || grid[row][col] == '0'){
            return;
        }
        grid[row][col]='0';

        int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};

        for(int[] direction :directions){
            dfs(row+direction[0],col+direction[1],grid);
        }
    }
}

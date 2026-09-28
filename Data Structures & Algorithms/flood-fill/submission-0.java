class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor  = image[sr][sc];
        if(originalColor!=color){
            fillColor(image,sr,sc,originalColor ,color);
        }
        return image;
        
    }

    private void fillColor(int[][] image, int i , int j , int originalColor , int color){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j] != originalColor ){
            return ;
        }
        image[i][j] = color;

        fillColor(image,i+1,j,originalColor,color);
        fillColor(image,i-1,j,originalColor,color);
        fillColor(image,i,j+1,originalColor,color);
        fillColor(image,i,j-1,originalColor,color);
    }
}
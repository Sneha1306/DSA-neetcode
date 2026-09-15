class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N =9;
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i =0;i<9;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val = board[r][c];
                if(val=='.'){
                    continue;
                }
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);
                int idx=(r/3)*3+(c/3);
                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;

    }
}

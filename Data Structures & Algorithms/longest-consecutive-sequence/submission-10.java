class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> sub = new HashSet<Integer>();
        int longSeq =1;
        for(int i : nums){
            sub.add(i);
        }
        for(int i : sub){
            if(sub.contains(i-1)){
                continue;
            }
            else{
                int currNum = i;
                int currlong = 1;
                while(sub.contains(currNum+1)){
                    currNum++;
                    currlong++;
                }
                longSeq = Math.max(currlong, longSeq);
            }
        }
        return longSeq;
    }
}

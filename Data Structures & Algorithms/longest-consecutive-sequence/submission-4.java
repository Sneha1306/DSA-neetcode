class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> longSub = new HashSet<>();
        int longSeq = 1;
        for(int n : nums){
            longSub.add(n);
        }
        for(int i : longSub){
            if(longSub.contains(i-1)){
                continue;
            }
            else{
                int currnum = i;
                int currlong = 1;
                while(longSub.contains(currnum+1)){
                    currlong++;
                    currnum++;
                }
                longSeq=Math.max(currlong,longSeq);
            }
            
        }
        return longSeq;
    }
}

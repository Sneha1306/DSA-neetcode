class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> seq = new HashSet<>();
        for(int i : nums){
            seq.add(i);
        }
        int longSub = 1;
        for(int i : seq){
            if(seq.contains(i-1)){
                continue;
            }
            else{
                int currNum = i;
                int currLong = 1;
                while(seq.contains(currNum+1)){
                    currNum++;
                    currLong++;
                }
                longSub = Math.max(longSub,currLong);
            }
        }
        return longSub;
    }
}

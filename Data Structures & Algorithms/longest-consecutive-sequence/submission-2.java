class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int n:nums){
            numSet.add(n);
        }
        int longSub = 1;
        for(int n:numSet){
            if(numSet.contains(n-1))
                continue;
            else{
                int currentNum=n;
                int currlong=1;
                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currlong++;
                }
                longSub = Math.max(currlong,longSub);
            }
        }
        return longSub;
    }
}

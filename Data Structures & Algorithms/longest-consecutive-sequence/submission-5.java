class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> longSub = new HashSet<>();
        for (int i : nums){
            longSub.add(i);
        }
        int longSeq = 1;
        for(int i : longSub){
            if(longSub.contains(i-1)){
                continue;
            }
            else{
            int currNum = i;
            int currLong = 1;
            while(longSub.contains(currNum+1)){
                currNum++;
                currLong++;
            }
            longSeq=Math.max(currLong,longSeq);
            }
        }
        return longSeq;
    }
}

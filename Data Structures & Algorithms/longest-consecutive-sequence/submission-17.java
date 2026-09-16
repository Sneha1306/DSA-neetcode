class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        HashSet<Integer> seq = new HashSet<>();

        for(int i : nums){
            seq.add(i);
        }
        int longSeq = 1;

        for(int i : seq){
            if(seq.contains(i-1))
                continue;
            else{
                int currLong = 1;
                int currNum = i;
                while(seq.contains(currNum+1)){
                    currLong++;
                    currNum++;
                }
                longSeq = Math.max(currLong,longSeq);
            }
        }
        return longSeq;
        
    }
}

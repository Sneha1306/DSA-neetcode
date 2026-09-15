class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> sub = new HashSet<>();
        for(int i : nums){
            sub.add(i);
        }
        int longSeq = 1;
        for(int i : sub){
            if(sub.contains(i-1)){
                continue;
            }
            else{
                int curr = i;
                int currlong = 1;
                while(sub.contains(curr+1)){
                    currlong++;
                    curr++;
                }
                longSeq = Math.max(currlong,longSeq);
            }
        }
        return longSeq;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = 0;
        int majorityEle = nums[0];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
           int count = map.getOrDefault(nums[i],0)+1;

            map.put(nums[i],count);
           if(count>maxCount){
            maxCount = count;
            majorityEle = nums[i];
           }

        }
        return majorityEle;
    }
}
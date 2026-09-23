class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, min = nums.length+1, sum=0;

        for(right=0; right<nums.length; right++){
            sum +=nums[right];
           
            while(sum>=target){            
                 min = Math.min(min,right-left+1);
                 sum = sum-nums[left];
                 left++;
            }
           
        }
       return min == nums.length+1 ? 0 : min;
    }
}
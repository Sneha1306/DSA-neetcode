class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length -1 , min = nums[0];

        while(left<=right){
            if(nums[left]<=nums[right]){
                min = Math.min(min,nums[left]);
                break;
            }
            int mid = left + (right-left)/2;
            if(nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid+1;
            }
            else if(nums[mid]<=nums[right]){
                min = Math.min(min,nums[mid]);
                right = mid-1;
            }
        }
        return min;
    }
}

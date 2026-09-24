class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findFirstIndex(nums,target);
        int right = findLastIndex(nums,target);

        return new int[]{left,right};
    }

    int findFirstIndex(int[] nums, int target){
        int left = 0 , right = nums.length-1;

        while(left<right){
              int mid = left+(right-left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }

        if(nums.length == 0 || nums[left]!=target){
            return -1;
        }
        return left;

    }

    
    int findLastIndex(int[] nums, int target){
        int left = 0 , right = nums.length-1;

        while(left<right){
              int mid = left+(right-left+1)/2;
            if(nums[mid]>target){
                right = mid-1;
            }
            else{
               left = mid;
            }
        }

        if(nums.length == 0 || nums[left]!=target){
            return -1;
        }
        return left;

    }
}
class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const sum = new Map();

        for(let i = 0 ; i < nums.length ; i++){
            let complement = target - nums[i];
            if(sum.has(complement)){
                return [i , sum.get(complement)];
            }
            else{
                sum.set(nums[i] , i);
            }
        }
    return [];
    }
}

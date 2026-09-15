class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const twoSum = new Map();

        for(let i= 0 ; i<nums.length ; i++){
            let complement = target - nums[i];
            if(twoSum.has(complement)){
                return [i, twoSum.get(complement)];
            }
            else{
                twoSum.set(nums[i], i);
            }
        }
        return [];
    }
}

class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const dup = new Set();
        for(let i of nums){
            if(dup.has(i))
            return true;
            else
             dup.add(i)
        }
        return false
    }
}

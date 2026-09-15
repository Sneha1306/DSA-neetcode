class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        if(s.length === 0){
            return 0;
        }
        let left = 0;
        let right = 0;
        let max = -0;
        const set = new Set();
        while(right<s.length){
            if(!set.has(s[right])){
                set.add(s[right]);
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                set.delete(s[left]);
                left++;
            }
        }
        return max;
    }
}

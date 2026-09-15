class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        if(nums.length == 0){
            return 0;
        }
        const map = new Set();
        for(let i of nums){
            map.add(i);
        }

        let longSeq = 1;
        for(let i of map){
            if(map.has(i-1)){
                continue;
            }
            else{
                let currNum = i;
                let currSeq = 1;
                while(map.has(currNum+1)){
                    currNum++;
                    currSeq++;
                }
                longSeq = Math.max(currSeq,longSeq);
            }
        }

        return longSeq;
    }
}

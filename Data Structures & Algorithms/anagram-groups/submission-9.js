class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const ana = new Map();
        
        for(let s of strs){
            const arr = new Array(26).fill(0);
            for(let i = 0 ; i< s.length ; i++){
                arr[s.charCodeAt(i)-97]++;

            }

            const key = arr.join("#");

            if(!ana.has(key)){
                ana.set(key,[]);
            }
            ana.get(key).push(s)
        }
        return Array.from(ana.values());
    }
}

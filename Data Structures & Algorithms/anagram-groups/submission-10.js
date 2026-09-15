class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        if(strs.length === 0)
            return [""];

        let arr = new Array(26);
        const ana = new Map();
        
        for(let i = 0 ; i < strs.length ; i++){
            arr.fill(0);
            for(let c = 0 ; c < strs[i].length ; c++){
                arr[strs[i].charCodeAt(c) - 97]++;
            }

            const key = arr.toString();

            if(ana.has(key)){
                ana.get(key).push(strs[i]);
            }
            else{
                ana.set(key,[strs[i]]);
            }
        }
        const valuesArr = [...ana.values()];
        return valuesArr;
    }
}

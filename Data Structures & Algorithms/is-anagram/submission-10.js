class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length){
            return false;
        }

        const ana = new Array(26);
        ana.fill(0);

        for(let i = 0 ; i<s.length ; i++){
             ana[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;
            ana[t.charCodeAt(i) - 'a'.charCodeAt(0)]--;
        }

        for(let i= 0 ; i<26 ; i++){
            if(ana[i]!==0){
                return false;
            }
        }
        return true;
    }
}

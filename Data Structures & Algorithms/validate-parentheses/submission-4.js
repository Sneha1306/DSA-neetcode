class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        if(s.length===0){
            return false;
        }
        const stack = [];

        const map = new Map();
        map.set(')','(');
        map.set('}','{');
        map.set(']','[');

        for(let ch of s){
            if (ch === '(' || ch === '[' || ch === '{') {
                stack.push(ch);
            }
            else{
                if(stack.length === 0){
                    return false;
                }
                let top = stack.pop();
                if(top!==map.get(ch)){
                    return false;
                }
            }
        }
       return stack.length===0
    }
}

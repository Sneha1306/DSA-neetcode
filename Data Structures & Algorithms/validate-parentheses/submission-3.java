class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mapped = new HashMap<>();

        mapped.put('}','{');
        mapped.put(')','(');
        mapped.put(']','[');

        Stack<Character> valid = new Stack<>();

        for(char c : s.toCharArray()){
            if(!mapped.containsKey(c)){
                valid.push(c);
            }
            else{
                if(valid.isEmpty()){
                    return false;
                }
                char top = valid.pop();
                if(top!=mapped.get(c)){
                    return false;
                }
            }
        }
        return valid.isEmpty();
    }
}

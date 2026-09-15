class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mapped = new HashMap<>();

        mapped.put('}','{');
        mapped.put(']','[');
        mapped.put(')','(');

        Stack<Character> para = new Stack<>();

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(!mapped.containsKey(c)){
                para.push(c);
            }
            else{
                if(para.isEmpty()){
                    return false;
                }
                char topElement = para.pop();
                
                if(topElement!=mapped.get(c)){
                    return false;
                }
            }
        }
        return para.isEmpty();
    }
}

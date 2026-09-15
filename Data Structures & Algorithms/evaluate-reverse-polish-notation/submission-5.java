class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            {
                int b = ans.pop();
                int a = ans.pop();
                int val = operation(a,b,s);
                ans.push(val);
            }
            else{
                ans.push(Integer.parseInt(s));
            }
            
        }
        return ans.pop();        
    }
    int operation(int a , int b , String s){
        switch(s){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
            case "/" : return a/b;
            default: throw new IllegalArgumentException("Invalid operator: " + s);
        
        }
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> mapped = new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int b = mapped.pop();
                int a = mapped.pop();
                int res = operation(a,b,s);
                mapped.push(res);
            }
            else{
                mapped.push(Integer.parseInt(s));
            }
        }
        return mapped.pop();
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

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> mapped = new Stack<>();
        int result = 0;
        for(String s : tokens){
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int b = mapped.pop();
                int a = mapped.pop();
                result = operation(a,b,s);
                mapped.push(result);
            }
            else {
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

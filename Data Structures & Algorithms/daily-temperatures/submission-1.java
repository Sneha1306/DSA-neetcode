class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> temp = new Stack<>();
        for(int i = 0 ; i< temperatures.length ; i++){
            while(!temp.isEmpty() && temperatures[i]>temperatures[temp.peek()]){
                int index = temp.pop();
                ans[index]=i-index;
            }
            temp.push(i);
        }
        return ans;
        
    }
}

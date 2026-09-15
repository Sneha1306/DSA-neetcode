class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> days = new Stack<>();
        for(int i = 0; i<temperatures.length ; i++){
            while(!days.isEmpty() && temperatures[i]>temperatures[days.peek()] ){
                int index = days.pop();
                ans[index] = i - index;
            }
            days.push(i);
        }
        return ans;

    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
         Map<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement = target-numbers[i];
            if(sum.containsKey(complement)){
                return new int[] { sum.get(complement)+1,i+1};
            }
            sum.put(numbers[i],i);
        }
        return new int[] {};
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();
        for(int n : nums){
            if(dup.contains(n)){
                return true;
            }
            dup.add(n);
        }
        return false;
    }
}
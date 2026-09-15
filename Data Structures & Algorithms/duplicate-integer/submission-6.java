class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<Integer>();
        for(int i : nums){
            if(dup.contains(i)){
                return true;
            }
            else{
                dup.add(i);
            }
        }
        return false;
    }
}
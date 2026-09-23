class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0 , max = 0 , ans = 0;
        int[] occ = new int[26];
    
        for(right= 0 ; right<s.length() ; right++){
            max = Math.max(max,++occ[s.charAt(right)-'A']);
            if(right-left+1 - max >k){
                occ[s.charAt(left)-'A']--;
                left++;              
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}

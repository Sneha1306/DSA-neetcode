class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int maxOcc = 0;
        int[] arr = new int[26];
        for(right=0; right<s.length() ; right++){
            maxOcc = Math.max(maxOcc, ++arr[s.charAt(right)-'A']);
            if(right-left+1 - maxOcc > k){
                arr[s.charAt(left)-'A']--;
                left++;
                
            }
            ans= Math.max(ans, right-left+1);
        }
        return ans;
    }
}

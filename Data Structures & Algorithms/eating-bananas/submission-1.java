class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = 1;
        for(int pile : piles){
            right = Math.max(right,pile);
        }
        while(left<right){
            int mid = left+(right-left)/2;
            if(canFinish(mid,piles,h)){
                right = mid;
            }
            else{
                left= mid+1;
            }
        }
        return left;
    }
    private boolean canFinish(int mid, int[] piles, int h){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double)pile/mid);
        }
        return h>=hours;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n :nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        Queue<Integer> prio = new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));
        for(int i : freq.keySet()){
            prio.add(i);
            if(prio.size()>k){
                prio.poll();
            }
        }
        int[] arr = new int[k];
        for(int i = 0;i<k;i++){
            arr[i]=prio.poll();
        }
        return arr;
    }
}

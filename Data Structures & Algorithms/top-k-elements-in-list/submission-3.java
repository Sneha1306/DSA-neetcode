class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> top = new HashMap<>();
        for( int n : nums){
            top.put(n,top.getOrDefault(n,0)+1);
        }
        Queue<Integer> prio = new PriorityQueue<>((a,b)->top.get(a)-top.get(b));
        for(int i:top.keySet()){
            prio.add(i);
            if(prio.size()>k){
                prio.poll();
            }
        }
        int[] arr = new int[k];
            for(int i = 0 ; i<k; i++){
                arr[i]=prio.poll();
          
            }
        return arr;
    }
}

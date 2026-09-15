class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String,List<String>> ana = new HashMap<>();
        int[] arr = new int[26];
        for(String s : strs){
            Arrays.fill(arr,0);
            for(char c : s.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i<arr.length ; i++){
                sb.append(arr[i]);
                sb.append('#');
            }
            String key = sb.toString();
            if(!ana.containsKey(key)){
                ana.put(key, new ArrayList());
            }
            ana.get(key).add(s);
        }
        return new ArrayList(ana.values());
    }
}

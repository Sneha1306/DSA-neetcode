class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ana = new HashMap<>();
        int[] arr = new int[26];
        for(String s : strs){
            Arrays.fill(arr,0);
            for(int i = 0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int n : arr){
                sb.append("#");
                sb.append(n);
            }
            String key = sb.toString();
            if(!ana.containsKey(key)){
                ana.put(key,new ArrayList());
            }
            ana.get(key).add(s);
        }
        return new ArrayList(ana.values());
    }
}

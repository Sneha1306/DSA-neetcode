class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        HashMap<String,List<String>> ana = new HashMap<>();
        int arr[] = new int[26];
        for(String s : strs){
            Arrays.fill(arr,0);
            for(int i = 0 ; i < s.length() ; i++){
                arr[s.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i<26 ; i++){
                sb.append(arr[i]);
                sb.append("#");
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

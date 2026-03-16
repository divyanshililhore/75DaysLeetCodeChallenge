class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map = new HashMap<>();

       List<List<String>> ls = new ArrayList<List<String>>();

       for(String str : strs){
        char[] cd = str.toCharArray();

        Arrays.sort(cd);

        String key = new String(cd);

        if(map.containsKey(key)){
            map.get(key).add(str);
        }
        else{
            map.put(key,new ArrayList<String>());
            map.get(key).add(str);
        }
       }

       return new ArrayList<>(map.values());
    }
}
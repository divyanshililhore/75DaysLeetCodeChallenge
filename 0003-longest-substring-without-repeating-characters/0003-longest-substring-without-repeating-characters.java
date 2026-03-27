class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
    HashMap<Character,Integer> map = new HashMap<>();
int maxlen = 0;
int i=0,j=0;
while(j<n){
     map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
    while(map.get(s.charAt(j))>1){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
        if(map.get(s.charAt(i))==0){

            map.remove(s.charAt(i));
            }
            i++;
    }
   
    maxlen = Math.max(maxlen,j-i+1);
    j++;
}
return maxlen;

    }
}
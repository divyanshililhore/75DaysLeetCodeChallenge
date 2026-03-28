class Solution {
    public int characterReplacement(String s, int k) {
int n = s.length();
int i=0,j=0;
int maxlen = 0;
int maxfreq = 0;
int[] freq = new int[26];

while(j<n){
    freq[s.charAt(j)-'A']++;

    maxfreq = Math.max(maxfreq, freq[s.charAt(j)-'A']);

    if(j-i+1- maxfreq > k){
 freq[s.charAt(i)-'A']--;
 i++;

    }
    if(j-i+1- maxfreq <= k){
    maxlen = Math.max(maxlen,j-i+1);
    j++;
    }
}
return maxlen;
    }
}
class Solution {
    public boolean canBeEqual(String s1, String s2) {
if(s1.equals(s2)){
    return true;
}

char[] arr = new char[s1.length()];

int k = 0;
for(char c : s1.toCharArray()){
   arr[k++] = c;
}
for(int i=0;i<2;i++){
    if(s1.charAt(i)!=s2.charAt(i)){
    char temp = arr[i];
    arr[i] = arr[i+2];
    arr[i+2] = temp;
    }
    String s3 = new String(arr);
    if(s3.equals(s2)){
        return true;
    }
}
return false;
  }
}
class Solution {
    public int[] twoSum(int[] arr, int target) {
int m = arr.length;
for(int i=0;i<m;i++){
    for(int j=i+1;j<m;j++){
        if(arr[i]+arr[j]==target){
            return new int[] {i,j};
        }
    }
}
return new int[] {0,0};
    }
}
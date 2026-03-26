class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
      int maxsum = sum;
        int i=0;
        int j=k;
        while(j<n){
            sum-=nums[i];
            i++;
            sum+=nums[j];
            maxsum = Math.max(maxsum , sum);
            j++;
        }
        return (double) maxsum/k;
    }
}
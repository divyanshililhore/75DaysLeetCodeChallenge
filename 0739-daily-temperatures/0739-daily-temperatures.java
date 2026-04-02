class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int n = temperatures.length;
Stack<Integer> st = new Stack<>();

int[] arr = new int[n];

for(int i=0;i<n;i++){
    while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){

        int indx = st.pop();

        arr[indx]=i-indx;
    }
    st.push(i);
}
return arr;




//           int n = temperatures.length;
// int[] nums = new int[n];
//           for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(temperatures[i]<temperatures[j]){
//                     int ans = j-i;
//                     nums[i] = ans;
//  break;
//                 }
               

//             }
//           }
//           return nums;
    }
}
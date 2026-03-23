class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> set = new HashSet<>();

    for(int i=0;i<nums.length;i++){
        Set<Integer> st = new HashSet<>();
        for(int j=i+1;j<nums.length;j++){
            int ans = -(nums[i]+nums[j]);
            if(st.contains(ans)){
List<Integer> list = Arrays.asList(nums[i],nums[j],ans);
Collections.sort(list);
set.add(list);
            }
            st.add(nums[j]);
        }
    } 
    return new ArrayList<>(set);
    }
}
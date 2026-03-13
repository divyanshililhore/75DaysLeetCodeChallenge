class Solution {
    public boolean containsDuplicate(int[] nums) {

 HashSet<Integer> set = new HashSet<>();

        for(int ele : nums){
            if(set.contains(ele)){
                return true;
            }
            set.add(ele);
        }
        return false;
    //  int n = nums.length;
    //  HashMap<Integer,Integer> map = new HashMap<>();
    //  for(int ele : nums){
    // if(map.containsKey(ele)){
    //     return true;
    //     }
    //     else{
    //         map.put(ele,map.getOrDefault(ele,0)+1);
    //     }
    //  }  
    //  return false; 
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
int[] arr = new int[k];
HashMap<Integer,Integer> map = new HashMap<>();
for(int ele : nums){
    map.put(ele,map.getOrDefault(ele,0)+1);
}
int idx = 0;
while(k>0){
    int max = Integer.MIN_VALUE;
int key = -1;
    for(int j=0;j<nums.length;j++){
        if(map.containsKey(nums[j])){
            if(max<map.get(nums[j])){
                max = map.get(nums[j]);
                key = nums[j];
            }
        }
    }
        arr[idx++] = key;
        map.remove(key);
        k--;
    }
return arr;
    }
}
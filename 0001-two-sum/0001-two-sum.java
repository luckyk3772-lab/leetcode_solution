import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        HashMap<Integer,Integer>mp= new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int b = target - nums[i];
            
        
            if (mp.containsKey(b)) {
          
                return new int[]{mp.get(b), i};
            }
            
            mp.put(nums[i], i);
        }
        
        return new int[0];
    } 
}
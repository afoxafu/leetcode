package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution9 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int j = map.get(target - nums[i]);
                if (i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    	int[] nums = {3,3};
    	Solution9 solution9=new Solution9();
    
    	System.out.println(Arrays.toString(solution9.twoSum(nums,6)));
    }
}

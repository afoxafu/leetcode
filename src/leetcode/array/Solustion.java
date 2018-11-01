package leetcode.array;

import java.util.Arrays;

class Solution {
    /**
     * @param nums
     * @return
     */
    /**
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
    	int len=nums.length-1;
    	for(int i = 0;i<len;i++){
    		if (nums[i]==nums[i+1]){
    			for(int j=i;j<len;j++){
    				nums[j]=nums[j+1];
    			}
    			System.out.println(Arrays.toString(nums))	;
    			len--;
    			i--;
    		}
    		
    	}
    	return len+1;
    	
    }
    public static void main(String[] args){
    	int[] nums = new int[]{};
    	Solution solution=new Solution();
    	int len=solution.removeDuplicates(nums);
    	
    	System.out.println(len)	;
    
    }
}
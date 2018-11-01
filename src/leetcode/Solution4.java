package leetcode;

import java.util.Arrays;

public class Solution4 {
    public boolean containsDuplicate(int[] nums) {
    	if(nums.length==0){
    		return false;
    	}
    	for(int i=0;i<nums.length-1;i++){
    		int tempvalue=nums[i];
    		for(int j=i+1;j<nums.length;j++){
        		if(tempvalue==nums[j]){
        			return true;
        		}
        	}
    	}
    	
		return false;
        
    }
    public static void main(String[] args){
    	int[] nums = new int[]{1,2,3,4};
    	Solution4 solution4=new Solution4();
    	System.out.println(solution4.containsDuplicate(nums));
    
    }
}

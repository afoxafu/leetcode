package leetcode;


import java.util.Arrays;



public class Solution5 {
    public int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i=i+2){
    		if(i+1>=nums.length)return nums[i];
    		if(nums[i]!=nums[i+1])return nums[i];
    	}
		return 0; 
    }
    public static void main(String[] args){
    	int[] nums = new int[]{1,2,1,2};
    	Solution5 solution5=new Solution5();
    	System.out.println(solution5.singleNumber(nums));
    }
}

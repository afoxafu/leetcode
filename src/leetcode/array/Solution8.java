package leetcode.array;

import java.util.Arrays;

public class Solution8 {
    public void moveZeroes(int[] nums) {
    	int tempvalue=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0){
        		nums[tempvalue++]=nums[i];
        	}
        }
        for(int i=tempvalue;i<nums.length;i++){
        	nums[i]=0;
        }
       // System.out.println(tempvalue);
    }
    public static void main(String[] args){
    	int[] nums1 = {0,1,0,9,0,9};
    	Solution8 solution8=new Solution8();
    	solution8.moveZeroes(nums1);
    	System.out.println(Arrays.toString( nums1));
    }
}

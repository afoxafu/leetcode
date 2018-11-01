package leetcode;

import java.util.Arrays;

public class Solution3 {
/*    public void rotate(int[] nums, int k) {
        for (int i=0;i<k;i++){
        	int tempvalue=nums[nums.length-1];
        	for(int j=nums.length-1;j>0;j--){
        		nums[j]=nums[j-1];
        	}
        	nums[0]=tempvalue;
        }
    }*/
//    public void rotate(int[] nums, int k) {
//    		int[] tempvalue=new int[k];
//    		int num=k;
//    		for (int i=nums.length-1;i>nums.length-num-1;i--){
//    			tempvalue[--k]=nums[i];
//    		}
//        	
//        	for(int l=nums.length-1;l>num-1;l--){
//        		nums[l]=nums[l-num];
//        	}
//        	for(int i=0;i<num;i++){
//        		nums[i]=tempvalue[i];
//        	}
//        	
//    }
    public void rotate(int[] nums, int k) {
    	int tempvalue=0;
    	for(int i=0;i<k;i++){
    		tempvalue=nums[(nums.length+i-k)];
    		nums[(nums.length+i-k)]=nums[i];
    		nums[i]=tempvalue;
    	}
    	for(int i=0;i<k;i++){
    		tempvalue=nums[(nums.length+i-k)];
    		int index=nums.length+i-k;
    		for(int j=index;j>k+i;j--){
    			nums[j]=nums[j-1];
    		}
    		nums[k+i]=tempvalue;
    	}
    }
    public static void main(String[] args){
    	int[] nums = new int[]{1,2,3,4,5,6,7,8};
    	Solution3 solution3=new Solution3();
    	solution3.rotate(nums,3);
    	System.out.println(Arrays.toString(nums));
    
    }
}

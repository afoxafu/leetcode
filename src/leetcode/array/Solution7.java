package leetcode.array;

import java.util.Arrays;

public class Solution7 {
    public int[] plusOne(int[] digits) {
    	int tempvalue=0;
    	for(int i=digits.length-1;i>-1;i--){
    		if(digits[i]==9){
    			tempvalue++;
    		}else{
    			break;
    		}
    	}
    	if(tempvalue==0){
    		digits[digits.length-1]=digits[digits.length-1]+1;
    		return digits;
    	}else if(digits.length>tempvalue&&tempvalue>0){
    		digits[digits.length-1-tempvalue]=digits[digits.length-1-tempvalue]+1;
    		for(int i=digits.length-tempvalue;i<digits.length;i++){
    			digits[i]=0;
    		}
    		return digits;
    	}else if(digits.length==tempvalue){
    		int[] result=new int[digits.length+1];
    		result[0]=1;
    		return result;
    	}
    		
		return digits;
        
    }
    public static void main(String[] args){
    	int[] nums1 = {1,9,9};
    	Solution7 solution7=new Solution7();
    	System.out.println(Arrays.toString(solution7.plusOne( nums1)));
    }
}

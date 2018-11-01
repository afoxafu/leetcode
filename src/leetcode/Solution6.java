package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution6 {
    public int[] intersect(int[] nums1, int[] nums2) {
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<nums1.length;i++){
    		Integer value=map.get(nums1[i]);
    		map.put(nums1[i], (value==null?0:value)+1);
    	}
    	List<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<nums2.length;i++){
    		if(map.containsKey(nums2[i])&&map.get(nums2[i])!=0){
    			Integer value=map.get(nums2[i]);
    			map.put(nums2[i],value-1);
    			list.add(nums2[i]);
    		}
    	}
    	int[] result=new int[list.size()];
    	for(int i=0;i<list.size();i++){
    		result[i]=list.get(i);
    	}
		return result;
    }
    
    public static void main(String[] args){
    	int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
    	Solution6 solution6=new Solution6();
    	System.out.println(Arrays.toString(solution6.intersect( nums1, nums2)));
    }
}

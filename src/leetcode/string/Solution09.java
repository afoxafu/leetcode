package leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution09 {
    public String longestCommonPrefix(String[] strs) {
    	int temp=strs.length;
    	int[] temparray=new int[temp];
    	for(int i=0;i<temp;i++){
    		temparray[i]=strs[i].length();
    	}
    	if(temparray.length==0){
    		return "";
    	}
    	Arrays.sort(temparray);
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<temparray[0];i++){
    		map.put(i, 0);
    	}
    	for(int j=0;j<temparray[0];j++){
    		for(int i=0;i<temp;i++){
    			Integer value=map.get(j);
    			if(strs[0].charAt(j)==strs[i].charAt(j)){
    				map.put(j, value==0?1:value+1);
    			}
    		}
    	}
    	StringBuffer s=new StringBuffer();
    	for(int i=0;i<temparray[0];i++){
    		if(map.get(i)==temp){
    			s.append(strs[0].charAt(i));
    		}else{
    			break;
    		}
    		
    	}
    	
		return s.toString();
		
    }
    
    
    
    public static void main(String[] args){
    	
    	Solution09 solution09=new Solution09();
    
    	System.out.println(solution09.longestCommonPrefix(new String[]{"flow",""}));
    
    }
}

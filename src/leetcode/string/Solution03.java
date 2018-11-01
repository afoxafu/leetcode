package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution03 {
    public int firstUniqChar(String s) {
    	if(s==""){
    		return -1;
    	}
    	char[] chararray=s.toCharArray();
    	Map<Character,Integer> map=new HashMap<Character,Integer>();
    	int len=s.length();
    	for(int i=0;i<len;i++){
    		Integer value=map.get(chararray[i]);
    		map.put(chararray[i],(value== null?1:value+1));
    	}
    	List<Character> list =new ArrayList<Character>();
    	for(Character c:map.keySet()){
    		if(map.get(c)==1){
    			list.add(c);
    		}
    	}
    	int len1=list.size();
    	Integer[] temparray=new Integer[len1];
    	int j=0;
    	for(Character c:list){
    		for(int i=0;i<len;i++){
    			if(c==chararray[i]){
    				temparray[j++]=i;
    			}
    		}
    	}
    	Arrays.sort(temparray);
    	if (temparray.length==0){
    		return -1;
    	}
    	return temparray[0];
        
    }
    public static void main(String[] args){
    	
    	Solution03 solution03=new Solution03();
    
    	System.out.println(solution03.firstUniqChar("aaa"));
    
    }
}

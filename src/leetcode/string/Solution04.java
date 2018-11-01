package leetcode.string;

import java.util.Arrays;

public class Solution04 {
    public boolean isAnagram(String s, String t) {
    	char[] chars=s.toCharArray();
    	char[] chart=t.toCharArray();
    	int lens=s.length();
    	int lent=t.length();
    	if(lens!=lent){
    		return false;
    	}
    	int[] bucket=new int[26];
    	for(int i=0;i<lens;i++){
    		bucket[chars[i]-'a']++;
    	}
    	for(int i=0;i<lens;i++){
    		bucket[chart[i]-'a']--;
    	}
    	for(int i=0;i<26;i++){
    		if(bucket[i]!=0)
    			return false;
    	}
    	return true;
    }
    public static void main(String[] args){
    	
    	Solution04 solution04=new Solution04();
    
    	System.out.println(solution04.isAnagram("acc","aca"));
    
    }
}

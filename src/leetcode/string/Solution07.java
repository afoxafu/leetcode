package leetcode.string;

public class Solution07 {
    public int strStr(String haystack, String needle) {
    	if (needle.length()==0||needle==""){
    		return 0;
    	}
    	char[] h=haystack.toCharArray();
    	char[] n=needle.toCharArray();
    	int len2=haystack.length();
    	int len1=needle.length();
    	int k=len1;
    	int j=0;
    	if(haystack.contains(needle)){
    		for(int i=0;i<len2;i++){
    			if(h[i]==n[0]){
    				int l=i;
    				while(k>0){
    					if(h[l]==n[j]){
    						l++;
    						j++;
    						k--;
    					}else{
    						break;
    					}
    				}
    				if(k!=0){
    					j=0;
    					k=len1;
    					continue;
    				}else{
    					return i;
    				}
    			}
    		}
    		
    	}
		return -1;
        
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    	
    	Solution07 solution07=new Solution07();
    
    	System.out.println(solution07.strStr("mississippi","sipp"));
    
    }
}

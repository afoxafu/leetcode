package leetcode.string;



public class Solution01 {
    public String reverseString(String s) {
    	char[] chararray=s.toCharArray();
    	int len=s.length();
    	for(int i=0;i<len/2;i++){
    		char tempvalue;
    		tempvalue=chararray[i];
    		chararray[i]=chararray[len-1-i];
    		chararray[len-1-i]=tempvalue;
    	}
    	
		return String.valueOf(chararray);  
    }
    public static void main(String[] args){
    	
    	Solution01 solution01=new Solution01();
    	
    	System.out.println(solution01.reverseString("A man, a plan, a canal: Panama"))	;
    
    }
}

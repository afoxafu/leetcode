package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class Solution06 {
    public int myAtoi(String str) {
    	String str1=str.trim();
    	if(str1.length()==0){
    		return 0;
    	}else if(str1.length()==1){
    		if(str.charAt(0)>='0'&&str.charAt(0)<='9')return Integer.parseInt(str);
    		else return 0;
    	}
    	str1=str1.replaceAll("\\+", "");
    	char[] chararray=str1.toCharArray();
    	int len=chararray.length;
    	if(chararray[0]!='-'&&(chararray[0]<'0'||chararray[0]>'9')){
    		return 0;
    	}
    	boolean flag=false;
    	String result = null;
    	if(chararray[0]=='-'&&chararray[1]>='0'&&chararray[1]<='9'){
    		flag=true;
    		int tempvalue=0;
    		for(int i=1;i<len;i++){
    			if(chararray[i]>='0'&&chararray[i]<='9'){
    				tempvalue++;
    			}else{
    				break;
    			}
    		}
    		result=str1.substring(0, tempvalue+1);
    	}else if(chararray[0]=='-'&&(chararray[1]<'0'||chararray[1]>'9')){
    		return 0;
    	}else if(chararray[0]>='0'&&chararray[0]<='9'){
    		int tempvalue=0;
    		for(int i=0;i<len;i++){
    			if(chararray[i]>='0'&&chararray[i]<='9'){
    				tempvalue++;
    			}else{
    				break;
    			}
    		}
    		result=str1.substring(0, tempvalue);
    	}
    	int num=0;
    	if(flag){
    		int len1=result.length();
    		for(int i=1;i<len1;i++){
    			if(i<len1-1&&-num<=Integer.MIN_VALUE/10&&-result.charAt(i+1)<=Integer.MIN_VALUE%10){
    				return Integer.MIN_VALUE;
    			}
    			num=num*10+(result.charAt(i)-48);
    		}
    		return -num;
    	}else{
    		int len1=result.length();
    		for(int i=0;i<len1;i++){
    			if(i<len1-1&&num>=Integer.MAX_VALUE/10&&result.charAt(i+1)>=Integer.MAX_VALUE%10){
    				return Integer.MAX_VALUE;
    			}
    			num=num*10+(result.charAt(i)-48);
    		}
    		return num;
    	}
    	
    }
    public static void main(String[] args){
    	
    	Solution06 solution06=new Solution06();
    
    	System.out.println(solution06.myAtoi("+-2"));
    
    }
}

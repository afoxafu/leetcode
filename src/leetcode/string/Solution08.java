package leetcode.string;

public class Solution08 {
    public String countAndSay(int n) {
    	StringBuffer sb=new StringBuffer();
    	sb.append("1");
    	
    	for(int i=1;i<n;i++){
    		char[] ch1=sb.toString().toCharArray();
    		sb.delete(0, ch1.length);
    		int len=ch1.length;
    		int count=0;
    		char value=ch1[0];
    		
    		for(int j=0;j<len;j++){
    			if(value==ch1[j]){
    				count++;
    				if(j!=len-1&&value!=ch1[j+1]){
    					sb.append(""+count+value);
    				}
    				if(j==len-1){
    					sb.append(""+count+value);
    				}
    			}else{
    				value=ch1[j];
    				count=1;
    				if(j!=len-1&&value!=ch1[j+1]){
    					sb.append(""+count+value);
    				}
    				if(j==len-1){
    					sb.append(""+count+value);
    				}
    			}
    		}
    	}
    	
    	
		return sb.toString();
    }
    
    public static void main(String[] args){
    	
    	Solution08 solution08=new Solution08();
    
    	System.out.println(solution08.countAndSay(30));
    
    }
}

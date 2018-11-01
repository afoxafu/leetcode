package leetcode.string;

public class Solution02 {
    public int reverse(int x) {
    	if(x==0){
    		return 0;
    	}
    
    	String s=String.valueOf(x);
    	char[] chararray=s.toCharArray();
    	int i=0;
    	int j=s.length()-1;
    	int zerocount=0;
    	char temp;
    	if(chararray[0]=='-'){
    		zerocount = zerocount(chararray, j, zerocount);
    		j=j-zerocount;
    		while(i+1<j){
    			temp=chararray[i+1];
    			chararray[i+1]=chararray[j];
    			chararray[j]=temp;
    			i++;
    			j--;
    		}
    		long  result=Long.parseLong(String.valueOf(chararray).substring(1, s.length()-zerocount));
    		if(result<Integer.MIN_VALUE||result>Integer.MAX_VALUE){
    			return 0;
    		}else{
    			return (int)-result;
    		}
    	}else{
    		zerocount = zerocount(chararray, j, zerocount);
    		j=j-zerocount;
    		while(i<j){
    			temp=chararray[i];
    			chararray[i]=chararray[j];
    			chararray[j]=temp;
    			i++;
    			j--;
    		}
    		
    	
    		long result=Long.parseLong(String.valueOf(chararray).substring(0, s.length()-zerocount));
    		if(result<Integer.MIN_VALUE||result>Integer.MAX_VALUE){
    			return 0;
    		}else{
    			return (int)result;
    		}
    		
    	}
		
        
    }

	private int zerocount(char[] chararray, int j, int zerocount) {
		for(int k=j;k>-1;k--){
			if(chararray[k]=='0'){
				zerocount++;
			}else{
				break;
			}
		}
		return zerocount;
	}
	public static void main(String[] args){
    	
    	Solution02 solution02=new Solution02();
    	
    	System.out.println(solution02.reverse(15369))	;
    
    }
}

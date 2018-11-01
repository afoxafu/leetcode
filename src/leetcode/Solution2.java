package leetcode;

public class Solution2 {
    public int maxProfit(int[] prices) {
    	int maxProfit=0;
    	for(int i=0;i<prices.length-1;i++){
    		if(prices[i]<prices[i+1]){
    			maxProfit+=(prices[i+1]-prices[i]);
    		}
    		
    	}
    	
    	
		return maxProfit;
    }
    public static void main(String[] args){
    	int[] nums = new int[]{7,6,4,3,1};
    	Solution2 solution2=new Solution2();
    	int maxProfit=solution2.maxProfit(nums);
    	
    	System.out.println(maxProfit)	;
    
    }
}

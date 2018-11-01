package leetcode.list;

import java.util.ArrayList;
import java.util.List;

public class Solution06 {
	List<ListNode> list=new ArrayList<ListNode>();
	int length=0;
	int index=0;
	boolean flag=true;
    public boolean isPalindrome(ListNode head) {
    	if(head==null){
    		return false;
    	}
		while(head!=null){
			list.add(head);
			head=head.next;
		}
		length=list.size()-1;
		while(index<length){
			if(list.get(index++)!=list.get(length--)){
				flag=false;
				break;
			}
		}
    	return flag; 
    }
 
    
    public static void main(String[] args){
    	long x = System.nanoTime();
    	Solution06 solution06=new Solution06();
    	ListNode l1=new ListNode(1);
    	ListNode l2=new ListNode(2);
    	ListNode l3=new ListNode(2);
    	ListNode l4=new ListNode(1);
    	l1.next=l2;
    	l2.next=l3;
    	l3.next=l4;
    	boolean result=solution06.isPalindrome(l1);

    	
    	System.out.println(result);
    	System.out.println((System.nanoTime() - x));
    	//System.out.println(solution03.removeNthFromEnd(l1, 2));
    	
    	
    }
}

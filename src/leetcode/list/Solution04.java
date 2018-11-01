package leetcode.list;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
	List<ListNode> list=new ArrayList<ListNode>();
	private int index=-1;
	ListNode start;
	ListNode result;
    public ListNode reverseList(ListNode head) {
    	if(head==null){
    		return null;	
    	}
    	
    	helper(head);
		return result;
    }
    private void helper(ListNode head){
    	list.add(head);
    	index++;
    	start=head;
    	result=head;
    	if(start.next!=null){
    		helper(head.next);
    	}
		if(index>0){
			start.next=list.get(--index);
			start=start.next;
			start.next=null;
		}
		
    
    	
    }
    public static void main(String[] args){
    	Solution04 solution04=new Solution04();
    	ListNode l1=new ListNode(1);
    	ListNode l2=new ListNode(2);
    	ListNode l3=new ListNode(3);
    	ListNode l4=new ListNode(4);
    	ListNode l5=new ListNode(5);
    	l1.next=l2;
    	l2.next=l3;
    	l3.next=l4;
    	l4.next=l5;
    	ListNode result=solution04.reverseList(l1);
    	while(result.next!=null){
    		System.out.println(result.val);
    		result=result.next;
    	}
    	System.out.println(result.val);
    	//System.out.println(solution03.removeNthFromEnd(l1, 2));
    	
    }
}

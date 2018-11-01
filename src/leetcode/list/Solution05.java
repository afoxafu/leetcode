package leetcode.list;

public class Solution05 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode node = new ListNode(0);
    	ListNode result=node;
    	if(l1==null&&l2==null){
    		return null;
    	}
    	if(l1==null&&l2!=null){
    		return l2;
    	}
    	if(l1!=null&&l2==null){
    		return l1;
    	}
    	while(l1!=null&&l2!=null){
    		if(l1.val<l2.val){
    			node.next=l1;
    			l1=l1.next;
    		}else{
    			node.next=l2;
    			l2=l2.next;
    		}
    		node=node.next;
    		
    	}
    	node.next=l1==null?l2:l1;
		return result.next;
        
    }
    public static void main(String[] args){
    	long x = System.nanoTime();
    	Solution05 solution05=new Solution05();
    	ListNode l1=new ListNode(1);
    	ListNode l2=new ListNode(2);
    	ListNode l3=new ListNode(4);
    	ListNode m1=new ListNode(1);
    	ListNode m2=new ListNode(3);
    	ListNode m3=new ListNode(4);
    	l1.next=l2;
    	l2.next=l3;
    	m1.next=m2;
    	m2.next=m3;
    	ListNode result=solution05.mergeTwoLists(l1,m1);
    	while(result.next!=null){
    		System.out.println(result.val);
    		result=result.next;
    	}
    	
    	System.out.println(result.val);
    	System.out.println((System.nanoTime() - x));
    	//System.out.println(solution03.removeNthFromEnd(l1, 2));
    	
    	
    }
}

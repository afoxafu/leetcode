package leetcode.list;

public class Solution03 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	int len=1;
    	ListNode start=head;
    	while(start.next!=null){
    		start=start.next;
    		len++;
    	}
    	if(len==n){
    		head=head.next;
    		return head;

    	}
    	int i=len-n-1;
    	start=head;
    	while(i-->0){
    		start=start.next;
    	}
    	start.next=start.next.next;
		return head;
    }
    public static void main(String[] args){
    	Solution03 solution03=new Solution03();
    	ListNode l1=new ListNode(1);
//    	ListNode l2=new ListNode(2);
//    	ListNode l3=new ListNode(3);
//    	ListNode l4=new ListNode(4);
//    	ListNode l5=new ListNode(5);
//    	l1.next=l2;
//    	l2.next=l3;
//    	l3.next=l4;
//    	l4.next=l5;
    	ListNode result=solution03.removeNthFromEnd(l1, 1);
    	while(result.next!=null){
    		System.out.println(result.val);
    		result=result.next;
    	}
    	System.out.println(result.val);
    	//System.out.println(solution03.removeNthFromEnd(l1, 2));
    	
    }
}

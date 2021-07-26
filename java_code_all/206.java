class Solution {
     public ListNode reverseList(ListNode head){
    	if(head==null||head.next==null)
    		return head;
    	ListNode preNode=head,curNode=head.next,tempNode=curNode;
    	preNode.next=null;
    	while(curNode!=null){
    		tempNode=curNode.next;
    		curNode.next=preNode;
    		preNode=curNode;
    		curNode=tempNode;
    		
    	}
    	return preNode;
    	
    	
    	
    }
}




class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1==null)return l2;
    	if(l2==null)return l1;
    	if(l1.val>l2.val){
    		ListNode temp=l1;
    		l1=l2;
    		l2=temp;
    	}
    	ListNode cur1=l1.next,cur2=l2,current=l1,returnHead = l1;
    	while(cur1!=null&&cur2!=null){
    		if(cur1.val<cur2.val){
    			current.next = cur1;
    			current=current.next;
    			cur1=cur1.next;
    		}
    		else{
    			current.next = cur2;
    			current=current.next;
    			cur2=cur2.next;
    		}
    	}
    	if(cur1!=null)
    		current.next=cur1;
    	else 
    	 current.next=cur2;
    	return returnHead;
    }
}


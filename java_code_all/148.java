/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        if(head.next.next==null){
            if(head.val<=head.next.val)
                return head;
            else{
                ListNode newHead=head.next;
                newHead.next=head;
                head.next=null;
                return newHead;
            }  
        }
        ListNode slow=head,fast=slow;

        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode leftHead=head,rightHead=slow.next;
        slow.next=null;
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);
        ListNode returnHead=leftHead;
        if(leftHead.val<rightHead.val){
            leftHead=leftHead.next;
        }
        else{
            returnHead=rightHead;
            rightHead=rightHead.next;
        }
        ListNode curNode=returnHead;
        while(rightHead!=null&&leftHead!=null){
            if(rightHead.val<leftHead.val){
                curNode.next=rightHead;
                rightHead=rightHead.next;
            }
            else{
                curNode.next=leftHead;
                leftHead=leftHead.next;
            }
            curNode=curNode.next;
        }
        if(rightHead==null){
            curNode.next=leftHead;
        }
        else{
            curNode.next=rightHead;
        }
        return returnHead;



    }
}



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	 if(l1==null&&l2==null) return null;
    	 
          ListNode curList = new ListNode();
          ListNode returnList = curList;
          int flag=0, nowNum=0;
          while(l1!=null&&l2!=null){
        	  curList.next = new ListNode();
        	  curList=curList.next;
        	  nowNum = l1.val+l2.val+flag;
        	  if(nowNum>9){
        		  curList.val = nowNum-10;
        		  flag=1;
        		  
        	  }
        	  else{
        		  curList.val = nowNum;
        		  flag=0;
        	  }
        	  
        	  l1=l1.next;
        	  l2=l2.next;
          }
          if(flag==0){
        	  if(l1!=null)
        		  curList.next=l1;
        	  else
        		  curList.next=l2;
          }
          else{
        	  if(l1==null)
        		  l1=l2;
        	  while(l1!=null){
        		  curList.next = new ListNode();
            	  curList=curList.next;
            	  nowNum = l1.val+flag;
            	  if(nowNum>9){
            		  curList.val = nowNum-10;
            		  flag=1;
            		  
            	  }
            	  else{
            		  curList.val = nowNum;
            		  flag=0;
            	  }
            	  
            	  l1=l1.next;
        		  
        	  }
          }
          if(flag>0){
        	  curList.next = new ListNode();
        	  curList.next.val=1;
          }
        	  
         return returnList.next;
        
          
          
    }
}



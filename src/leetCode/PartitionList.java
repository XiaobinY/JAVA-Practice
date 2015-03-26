package leetCode;




public class PartitionList {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	}
	
    public static ListNode partition(ListNode head, int x) {
        
        boolean smallCreated = false;
        boolean largeCreated = false;
        ListNode largeTail = null;
        ListNode smallTail = null;
        ListNode largeHead = null;
        ListNode smallHead = null;
        
        while(head != null){
            if(head.val >= x){
                if(largeCreated){
                    ListNode newTail = new ListNode(head.val);
 					largeTail.next = newTail;
                    largeTail = largeTail.next;
                } else {
                    largeHead = new ListNode(head.val);
                    largeTail = largeHead;
                    largeCreated = true;
                }
            } else {
                if(smallCreated){
                    ListNode newTail = new ListNode(head.val);
                    smallTail.next = newTail;
                    smallTail = smallTail.next;
                } else {
                    smallHead = new ListNode(head.val);
                    smallTail = smallHead;
                    smallCreated = true;
                }
            }
            head = head.next;
        }
        
        ListNode p = smallHead;
    	while(p != null){
    		System.out.print(p.val + " -> ");
    		p = p.next;
    	}
    	System.out.println();
    	
    	p = largeHead;
    	while(p != null){
    		System.out.print(p.val + " -> ");
    		p = p.next;
    	}
    	System.out.println();
        
        if(smallHead != null){
            smallTail.next = largeHead;
            return smallHead;
        } else {
            return largeHead;
        }
    }
    
    public static void main(String[] args){
//    	5 -> 4 -> 3 -> 4 -> 2 -> 1 -> 5
    	ListNode node = new ListNode(2);
    	ListNode n = node;
    	n.next = new ListNode(1);
  
    	ListNode p = node;
    	while(p.next != null){
    		System.out.print(p.val + " -> ");
    		p = p.next;
    	}
    	System.out.println(p.val);
    	
    	node = partition(node, 1);
    	
    	p = node;
    	while(p.next != null){
    		System.out.print(p.val + " -> ");
    		p = p.next;
    	}
    	System.out.println(p.val);
    	
    }
}

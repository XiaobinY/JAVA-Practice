package leetCode;



public class LinkedListsIntersection {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        int la = 0;
        while(A != null){
        	la++;
        	A = A.next;
        }
        	
        ListNode B = headB;
        int lb = 0;
        while(B != null){
        	lb++;
        	B = B.next;
        }
        
        int diff = la - lb;
        if(diff > 0){
        	while(diff > 0){
        		headA = headA.next;
        		diff --;
        	}
        } else if(diff < 0){
        	while(diff < 0){
        		headB = headB.next;
        		diff ++;
        	}
        }
        
        while(headA != null && headB != null){
        	if(headA == headB) return headA;
        	headA = headA.next;
        	headB = headB.next;
        }
        
        return null;
    }
	
	
}

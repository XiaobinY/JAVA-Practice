package cracking;

import datatype.MyNode;
import datatype.MySL;

public class Q2_5 {
	
	public static MyNode addList(MyNode a, MyNode b){
		int carry = 0; 
		int value = 0;

		if(a == null || b == null) return null;
		
		value = a.getData() + b.getData() + carry;
		MyNode result = new MyNode(value % 10);
		MyNode c = result;
		if(value >= 10){
			carry = 1;
		} else {
			carry = 0;
		}
		
		while(a.getNext() != null && b.getNext() != null){
			value = a.getNext().getData() + b.getNext().getData() + carry;
			c.setNext(new MyNode(value % 10));
			if(value >= 10){
				carry = 1;
			} else {
				carry = 0;
			}
			c = c.getNext();
			a = a.getNext();
			b = b.getNext();
		}
		
		if(a.getNext() != null){
			c.setNext(a.getNext());
		} 
		
		if(b.getNext() != null){
			c.setNext(b.getNext());
		}
		
		return result;
	}
	
	public static void main(String[] args){
		MyNode a = new MyNode(7);
		//a.setNext(new MyNode(1));
		//a.getNext().setNext(new MyNode(6));

		MyNode b = new MyNode(5);
		//b.setNext(new MyNode(9));
		//b.getNext().setNext(new MyNode(2));

		MySL A = new MySL(a);
		A.print();
		MySL B = new MySL(b);
		B.print();
		
		MyNode c = addList(a, b);
		MySL C = new MySL(c);
		C.print();
	}
}

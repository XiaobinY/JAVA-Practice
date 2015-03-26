package cracking;

import datatype.MySL;
import datatype.MyNode;

public class Q2_3 {
	public static void removeNode(MyNode n){
		if (n.getNext() == null){
			n = null;
		} else {
			n.setData(n.getNext().getData());
			n.setNext(n.getNext().getNext());
		}		
	}
	
	public static void main(String[] args){
		MySL sl = new MySL(5);
		sl.add(4);
		sl.add(3);
		sl.add(4);
		sl.add(2);
		sl.add(1);
		sl.add(5);
		
		sl.print();
	}
}

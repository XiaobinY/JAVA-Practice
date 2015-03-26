package cracking;

import datatype.MySL;
import datatype.MyNode;

public class Q2_4 {
	public static void partitionList(MySL n, int x){
		MyNode h = n.getHead();
		MySL m = new MySL();
		
		while(h.getNext() != null){
			if(h.getData() > x){
				m.add(h.getData());
				n.removeNode(h);
			} else {
				h = h.getNext();
			}
		}
		h.setNext(m.getHead());
	}
	
	public static void partitionList2(MySL l, int x){
		MyNode h = l.getHead();
		MySL small = new MySL();
		MySL large = new MySL();
		
		while(h.getNext() != null){
			if(h.getData() > x){
				large.add(h.getData());
			} else {
				small.add(h.getData());
			}
			h = h.getNext();
		}
		if(h.getData() > x){
			large.add(h.getData());
		} else {
			small.add(h.getData());
		}
		h = h.getNext();
		
		//small.print();
		//large.print();
		
		MyNode sEnd = small.getHead();
		while(sEnd.getNext() != null){
			sEnd = sEnd.getNext();
		}
		sEnd.setNext(large.getHead());
		
		l.setHead(small.getHead());
		
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
		
		partitionList2(sl, 3);
		sl.print();
	}
}

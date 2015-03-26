package cracking;

import datatype.MyNode;
import datatype.MySL;

public class Q2_2{
	
	public static int kLast(Integer k, MySL n){
		
		MyNode cur = n.getHead();
		MyNode runner = n.getHead();
		
		for(int i = 0; i < k; i++){
			runner = runner.getNext();
			if (runner == null) throw new IllegalArgumentException() ;
		}
		
		while(runner.getNext() != null){
			runner = runner.getNext();
			cur = cur.getNext();
		}
		
		return cur.getData();
	}
	
	public static void main(String[] args){
		MySL ls = new MySL(5);
		ls.add(4);
		ls.add(3);
		ls.add(4);
		ls.add(2);
		ls.add(1);
		ls.add(5);
		
		ls.print();
		
		System.out.println(kLast(1, ls));
		System.out.println(kLast(2, ls));
		System.out.println(kLast(3, ls));
		System.out.println(kLast(11, ls));
	}
}

package cracking;

import java.util.HashMap;

import datatype.MyNode;
import datatype.MySL;

public class Q2_1 {

// Remove duplicated from unsorted linked list
	public static void removeDup(MySL n){
		HashMap<Integer, Boolean> hm = new HashMap<>();
		MyNode cur = n.getHead();
		while(cur.getNext() != null){
			if(hm.containsKey(cur.getNext().getData())){
				cur.setNext(cur.getNext().getNext());
			} else{
				hm.put(cur.getData(), true);
			}
			
			cur = cur.getNext();
			if(cur == null) break;
		}
		
	}
	
	public static void removeDup2(MySL n){
		MyNode cur = n.getHead();
		while(cur.getNext() != null){
			MyNode runner = cur;
			while(runner.getNext() != null){
				if(runner.getNext().getData() == cur.getData()){
					runner.setNext(runner.getNext().getNext());
				}
				runner = runner.getNext();
				if(runner == null) break;
			}
			cur = cur.getNext();
			if(cur == null) break;
		}
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
		
		removeDup2(ls);
		ls.print();
		
	}
	
}

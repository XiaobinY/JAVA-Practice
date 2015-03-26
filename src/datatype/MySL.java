package datatype;

import datatype.MyNode;

public class MySL {
	
	
	private MyNode head = null;
	
	public MySL(){
		head = null;
	}
	
	public MySL(int input){
		head = new MyNode(input);
	}
	
	public MySL(MyNode n){
		head = n;
	}
	
	public MyNode getHead(){
		return head;
	}
	
	public void setHead(MyNode n){
		head = n;
	}
	
	public void add(int input){
		if(head == null){
			head = new MyNode(input);
		} else {
			head.appendToTail(input);
		}
	}
	
	public void add(MyNode n){
		if(head == null){
			head = n;
		} else {
			MyNode cur = head;
			while(cur.getNext() != null){
				cur = cur.getNext();
			}
			cur.setNext(n);
		}
	}
	
	public void remove(int input){
	
		if(head.getData() == input){
			head = head.getNext();
		}
	
		MyNode cur = head;
		
		while(cur.getNext() != null){
			if(cur.getNext().getData() == input){
				cur.setNext(cur.getNext().getNext());
				return;
			}
			cur = cur.getNext();
		}
		
	}
	
	public void removeNode(MyNode n){
		if(n.getNext() == null){
			n = null;
		} else {
			n.setData(n.getNext().getData());
			n.setNext(n.getNext().getNext());
		}
	}
	
	public void print(){
		MyNode n = head;
		
		while(n.getNext() != null){
			System.out.print(n.getData() + " -> ");
			n = n.getNext();
		}
		
		System.out.println(n.getData());
	}
	
	public static void main(String[] args){
		MySL sl = new MySL(5);
		sl.add(4);
		sl.add(3);
		sl.add(2);
		sl.add(1);
		sl.add(3);
		sl.print();
		
		sl.remove(5);
		sl.print();
	}
	
}

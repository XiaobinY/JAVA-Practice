package datatype;

public class MyNode {
	private MyNode next = null;
	private int data;
		
	public MyNode(int input){
		data = input;
	}
	
	public MyNode(){
		data = 0;
	}
	
	public MyNode getNext(){
		return next;
	}
	
	public void setNext(MyNode n){
		next = n;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public void appendToTail(int input){
		MyNode next = new MyNode(input);
		MyNode cur = this;
		
		while(cur.next != null){
			cur = cur.next;
		}
		
		cur.next = next;
	}
}

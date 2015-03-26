package datatype;

public class Stack {
	Node top;
	
	public void push(int item){
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	public Integer pop(){
		if(top != null){
			int value = top.data;
			top = top.next;
			return value;
		} else {
			return null;
		}
		
	}
	
	public Integer peek(){
		if(top != null){
			return top.data;
		}
		else {
			return null;
		}
	}
}

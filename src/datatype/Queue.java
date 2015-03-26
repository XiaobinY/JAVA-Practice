package datatype;

public class Queue {
	Node head, tail;
	
	public void enqueue(int i){
		if(head == null){
			tail = new Node(i);
			head = tail;
		} else {
			tail.next = new Node(i);
			tail = tail.next;
		}
	}
	
	public Integer dequeque(){
		if(head == null){
			return null;
		} else {
			Integer value = head.data;
			head = head.next;
			return value;
		}
	}
}

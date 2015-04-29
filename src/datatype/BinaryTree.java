package datatype;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	TreeNode root;
	
	public BinaryTree(TreeNode t){
		root = t;
	}
	
	public void preOrder(TreeNode t){
		System.out.print(t.data + " ");
		if (t.leftChild != null) preOrder(t.leftChild);
		if (t.rightChild != null) preOrder(t.rightChild);
	}

	public void inOrder(TreeNode t){
		if (t.leftChild != null) inOrder(t.leftChild);
		System.out.print(t.data + " ");
		if (t.rightChild != null) inOrder(t.rightChild);
	}

	public void postOrder(TreeNode t){
		if (t.leftChild != null) postOrder(t.leftChild);
		if (t.rightChild != null) postOrder(t.rightChild);
		System.out.print(t.data + " ");
	}

	public void layerView(){
		Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(root);
		
		while(q.peek() != null){
			if(q.peek().leftChild != null) q.offer(q.peek().leftChild);
			if(q.peek().rightChild != null ) q.offer(q.peek().rightChild);
			System.out.print(q.remove().data + " ");
		}
		
	}
	
	public void preOrder2(){
		Stack<TreeNode> s = new Stack<>();
		TreeNode n; 
				
		s.push(root);
		
		while(!s.isEmpty()){
			n = s.pop();
			System.out.print(n.data + " ");
			if(n.rightChild != null ) s.push(n.rightChild);
			if(n.leftChild != null ) s.push(n.leftChild);
		}
	}

	public void inOrder2(){
		Stack<TreeNode> s = new Stack<>();
		TreeNode n = root; 
				      
        while(!s.isEmpty() || n != null)  
        {  
            while(n!=null)  
            {  
                s.push(n);  
                n = n.leftChild;  
            }  
            n = s.pop();  
            System.out.print(n.data + " ");
            n = n.rightChild;     
        }  
	}

	
}

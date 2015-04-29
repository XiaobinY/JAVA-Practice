package datatype;

import datatype.TreeNode;
import datatype.BinaryTree;

public class TestTree {
	
	public static void main(String[] args){
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		TreeNode ten = new TreeNode(10);
		
		one.leftChild = two;
		one.rightChild = three;
		
		two.leftChild = four;
		two.rightChild = five;
		
		five.leftChild = six;
		five.rightChild = seven;
		
		three.rightChild = eight;
		
		eight.leftChild = nine;
		eight.rightChild = ten;
		
		BinaryTree tree = new BinaryTree(one);

		tree.preOrder(tree.root);
		System.out.println();
		tree.preOrder2();
		System.out.println();
		System.out.println();

		tree.inOrder(tree.root);
		System.out.println();
		tree.inOrder2();
		System.out.println();
		System.out.println();
		
		tree.postOrder(tree.root);
		System.out.println();
		System.out.println();

		tree.layerView();
		System.out.println();
		System.out.println();
		

	}
}

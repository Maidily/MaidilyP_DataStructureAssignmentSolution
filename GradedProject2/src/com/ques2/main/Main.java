package com.ques2.main;

import com.ques2.model.Node;
import com.ques2.service.BSTtoSkewedTree;

public class Main {

	static Node node = null;
	
	
	public static void main(String[] args) 
	{
		
		// hard coded tree node values
		Main tree = new Main();
		
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		
		BSTtoSkewedTree toSkew = new BSTtoSkewedTree();
		
		// convert BST to Right Skewed tree
		toSkew.ToSkewedTree(tree.node);
		
		// traverse Right Skewed tree
		toSkew.TraverseSkewedTree(BSTtoSkewedTree.headNode);

	}

}

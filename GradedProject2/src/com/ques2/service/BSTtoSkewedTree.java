package com.ques2.service;

import com.ques2.model.Node;

public class BSTtoSkewedTree {
	
	public static Node prevNode = null;
	public static Node headNode = null;

	public void ToSkewedTree(Node root)
	{
		if(root == null) {
			return;
		}
		
		// find the left-most node
		ToSkewedTree(root.left);
		
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(headNode == null) 
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		ToSkewedTree(rightNode);
		
	}

	public void TraverseSkewedTree(Node root) 
	{
		// traverse right skewed tree
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		TraverseSkewedTree(root.right);
	}

}

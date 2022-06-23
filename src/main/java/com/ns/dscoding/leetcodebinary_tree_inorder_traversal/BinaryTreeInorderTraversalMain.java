package com.ns.dscoding.leetcodebinary_tree_inorder_traversal;

import com.ns.dscoding.dsa.TreeNode;

public class BinaryTreeInorderTraversalMain {

	public static void main(String[] args) {
		
		BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
		
		System.out.println(binaryTreeInorderTraversal.inorderTraversal(TreeNode.newTree(1, 2, 3, 4, 5, null, null)));
		
	}
	
}
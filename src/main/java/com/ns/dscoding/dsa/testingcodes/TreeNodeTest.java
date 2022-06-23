package com.ns.dscoding.dsa.testingcodes;

import java.util.ArrayList;
import java.util.List;

import com.ns.dscoding.dsa.TreeNode;

public class TreeNodeTest {
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		System.out.println(root);
		
		List<Integer> res = new ArrayList<>();
		helper(root, res);
		return res;
	}

	public void helper(TreeNode root, List<Integer> res) {
		if (root != null) {
			helper(root.left, res);
			res.add(root.val);
			helper(root.right, res);
		}
	}

	public static void main(String[] args) {

		TreeNodeTest treeNodeTest = new TreeNodeTest();
		
		treeNodeTest.inorderTraversal(TreeNode.newTree(1, null, 2, null, null, 3, null));

	}

}
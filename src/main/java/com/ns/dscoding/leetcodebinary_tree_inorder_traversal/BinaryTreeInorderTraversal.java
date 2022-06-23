package com.ns.dscoding.leetcodebinary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

import com.ns.dscoding.dsa.TreeNode;

public class BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
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
}
package com.ns.dscoding.mytests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ns.dscoding.dsa.TreeNode;
import com.ns.dscoding.leetcode.maximum_depth_of_binary_tree.MaximumDepthOfBinaryTree;

public class MaximumDepthOfBinaryTreeTest {
	@Test
	public void comparison() {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		TreeNode root2 = TreeNode.newTree(3, 9, 20, null, null, 15, 7);
		assertEquals(root, root2);
	}

	/*
	@Test
	public void test1() {
		TreeNode root = TreeNode.newTree(3, 9, 20, null, null, 15, 7);
		assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
	}

	@Test
	public void test2() {
		TreeNode root = TreeNode.newTree(3, null, 20);
		assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
	}
	*/
}

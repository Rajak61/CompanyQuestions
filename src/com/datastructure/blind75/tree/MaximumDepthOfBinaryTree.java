package com.datastructure.blind75.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {
	// /Time:0(n),space 0(1)
	// Theory https://www.youtube.com/watch?v=hTM3phVI6YQ&ab_channel=NeetCode
	// Code -https://walkccc.me/LeetCode/problems/104/#__tabbed_1_2
	// // code and theory BFS-
	// https://www.youtube.com/watch?v=o2LEC2NEVuk&ab_channel=NikhilLohia

	// DFS -RECursion -
	// BFS -Queue
	// DFS Iterative- stack

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(maxDepth(root));
	}

	public static int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;

		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static int maxDepthBFS(TreeNode root) { // BFS -queue
		if (root == null) {
			return 0;
		}
		int level = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
			level++;
		}
		return level;
	}

	public static int maxDepthDFS(TreeNode root) { // DFS Iterative-stack
		if (root == null)
			return 0;

		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> depths = new Stack<>();

		stack.push(root);
		depths.push(1);

		int maxDepth = 0;

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			int depth = depths.pop();

			if (node != null) {
				maxDepth = Math.max(maxDepth, depth);

				stack.push(node.left);
				depths.push(depth + 1);

				stack.push(node.right);
				depths.push(depth + 1);
			}
		}

		return maxDepth;
	}
}

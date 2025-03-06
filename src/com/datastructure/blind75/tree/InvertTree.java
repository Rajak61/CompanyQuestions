package com.datastructure.blind75.tree;


//time 0(n), space 0(h)
//Theory- https://www.youtube.com/watch?v=OnSn2XEQ4MY&ab_channel=NeetCode
//code -https://walkccc.me/LeetCode/problems/226/#__tabbed_1_2
public class InvertTree {
public static void main(String[] args) {
	TreeNode root = new TreeNode(1);
	root.left = new TreeNode(2);
	root.right = new TreeNode(3);
	root.left.left = new TreeNode(4);
	root.left.right = new TreeNode(5);
	System.out.println(invertTree(root));
}

private static TreeNode invertTree(TreeNode root) {
	if(root==null){
		return root;
	}
	//swap
	TreeNode temp=root.left;
	root.left=root.right;
	root.right=temp;
	
	//recursion
	invertTree(root.left);
	invertTree(root.right);
	
	return root;
}
}

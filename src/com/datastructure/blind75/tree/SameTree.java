package com.datastructure.blind75.tree;

public class SameTree {

	//Theory -https://www.youtube.com/watch?v=vRbbcKXCxOw&ab_channel=NeetCode
	//Code- https://walkccc.me/LeetCode/problems/100/
	//Time 0(n)p+q ,space (h)
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println(sameTree(root,root1));
	}

	private static boolean sameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null){
			return true;
		}
		if(p==null || q==null || p.val!=q.val){
			return false;
		}
		
		return sameTree(p.left,q.left)&& sameTree(p.right,q.right) ;
	}
	
	
}

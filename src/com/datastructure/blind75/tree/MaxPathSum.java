package com.datastructure.blind75.tree;

//Time 0(n),space 0(h)
//theory -https:www.youtube.com/watch?v=Op6YFcs8R9M&ab_channel=codestorywithMIK
//https:www.youtube.com/watch?v=Hr5cWUld4vU&t=429s&ab_channel=NeetCode   
public class MaxPathSum {
	static int maxSum=Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(maxSum(root));

	}

	private static int maxSum(TreeNode root) {
			
		solve(root);
		return maxSum;
	}

	private static int solve(TreeNode root) {

		if(root==null){
			return 0;
		}
		
		int l=Math.max(0, solve(root.left));
		int r=Math.max(0, solve(root.right));
		
		maxSum=Math.max(maxSum, l+r+root.val);
		
		return root.val+Math.max(l,r);
		
	}
	


private static int solveWith(TreeNode root) {
//theory -https:www.youtube.com/watch?v=Op6YFcs8R9M&ab_channel=codestorywithMIK
 int leftSum = solve(root.left);
 int rightSum = solve(root.right);

 // (1) Calculate the sum including the current node and its children
 int curveCase = leftSum + rightSum + root.val;

  //(2) Calculate the maximum sum considering only one child and the current node
 int leftOrRightCase = Math.max(leftSum, rightSum) + root.val;

  //(3) Consider the current node only
 int onlyRoot = root.val;

  //Update the overall maximum path sum
 maxSum = Math.max(Math.max(maxSum,onlyRoot), Math.max(curveCase, leftOrRightCase));

  //(4) Important part: return the maximum path sum that can be continued from the current node
 return Math.max(leftOrRightCase, onlyRoot);
}

}


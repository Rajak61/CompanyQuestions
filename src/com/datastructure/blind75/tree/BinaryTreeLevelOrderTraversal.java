package com.datastructure.blind75.tree;

import java.util.*;



public class BinaryTreeLevelOrderTraversal {
	
	//Time Complexity -o(n), space complexity -0(n)
	//theory https://www.youtube.com/watch?v=6ZnyEApgFYg&ab_channel=NeetCode
//https://www.youtube.com/watch?v=9M3oCwPGamE&ab_channel=NikhilLohia
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(3);
		root.right=new TreeNode(5);
		root.left.left=new TreeNode(7);
		root.left.right=new TreeNode(10);
		root.right.left=new TreeNode(13);
		root.right.right=new TreeNode(17);
		root.left.left.left=new TreeNode(20);
		root.right.right.right=new TreeNode(41);
		System.out.println(traversalOrder(root));
	}
	
	
	public static List<List<Integer>> traversalOrder(TreeNode root){
		
		if(root==null){
			new ArrayList<>();
		}
		List<List<Integer>> level=new ArrayList<>();
		Queue<TreeNode>q=new ArrayDeque<>();
		
		q.offer(root);
		
		while (!q.isEmpty()){
			
			List<Integer>subevel=new ArrayList<>();
			int size=q.size();
			for(int i=0;i<size;i++){
				
				TreeNode node=q.poll();
				subevel.add(node.val);
				if(node.left!=null)
					q.offer(node.left);
				if(node.right!=null)
					q.offer(node.right);
					
			}
			
			level.add(subevel);
		}
		
		return level;
	}

}
//offer gives true or false after adding , add gives exception




/*
READ ME

The solution uses a Queue to traverse the tree in a level-by-level fashion. The outer list of the resulting list of lists is represented as an ArrayList in this solution, while the inner lists are also represented as ArrayLists.

Here is a step-by-step explanation of the code:

Declare a Queue named q that will be used for level-by-level traversal of the binary tree.
Declare a List of Lists of Integers named finalAns to store the final result.
Check if the root of the binary tree is null. If it is, return the empty list of lists.
Add the root node of the binary tree to the queue.
While the queue is not empty, perform the following steps for each level of the tree:
Get the size of the current level of the queue.
Create a new list to store the values of the current level.
For each node in the current level of the queue, add its left and right children (if they exist) to the end of the queue and add its value to the list of values for the current level.
Add the list of values for the current level to the final result list.
Return the final result list of lists of values for each level of the binary tree.
Complexity
Time complexity:
The time complexity of this solution is O(n), where n is the number of nodes in the binary tree. This is because we visit each node in the tree exactly once, and the time taken to process each node is constant time.

Space complexity:
The space complexity of this solution is O(n), where n is the number of nodes in the binary tree. This is because in the worst case, the queue can store all the nodes of the last level of the binary tree, which is approximately half of the total number of nodes in the tree. Additionally, the space required for the output list of lists is also proportional to the number of nodes in the tree.

Therefore, the overall time and space complexity of this solution are both O(n).

Note
The difference between using LinkedList and ArrayList for the outer list in this code is related to their internal data structures and their performance characteristics.

LinkedList is implemented as a doubly linked list, where each node has a reference to its previous and next nodes. This makes it efficient to add or remove elements from the beginning or end of the list, but less efficient to access elements at arbitrary positions in the list. Therefore, using LinkedList for the outer list would be more efficient if we frequently add or remove elements from the beginning or end of the list.

List<List<Integer>> finalAns = new LinkedList<List<Integer>>();

On the other hand, ArrayList is implemented as a dynamic array, where elements are stored in a contiguous block of memory. This makes it efficient to access elements at arbitrary positions in the list, but less efficient to add or remove elements from the beginning or end of the list. Therefore, using ArrayList for the outer list would be more efficient if we frequently access elements at arbitrary positions in the list.

List<List<Integer>> finalAns = new ArrayList<List<Integer>>();

In the case of the provided code, since we only add elements to the end of the outer list and do not access elements at arbitrary positions, using either LinkedList or ArrayList for the outer list should produce the same results in terms of correctness. However, using ArrayList may be more efficient in terms of memory usage and performance, especially for larger input trees, because it avoids the overhead of maintaining the linked list structure.
*/
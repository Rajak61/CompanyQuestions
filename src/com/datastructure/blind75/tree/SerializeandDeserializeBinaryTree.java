package com.datastructure.blind75.tree;


import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.Queue;

class SerializeandDeserializeBinaryTree{
//Theory -https://www.youtube.com/watch?v=u4JAi2JJhI8&ab_channel=NeetCode
//Time complexity and Space Complexity 0(n)
public static void main(String[] args) {


    //Create treeNode
    //Sample Tree: Root(1) with Left(2) and Right(3) having children 4 and 5
    TreeNode root = new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.right.left=new TreeNode(4);
    root.left.right=new TreeNode(5);

    //encode tree to String

    System.out.println(serialize(root));

    //Decode String to Tree

    System.out.println(deserialize().val);

}


public static String serialize(TreeNode root){
    StringBuilder sb = new StringBuilder();
    if(root == null){
    sb.append("N");

    }
    sb.append(root.val).append(" ");
    serialize(root.left);
    serialize(root.right);

    return sb.toString();
}
public static TreeNode deserialize(String data) {}

        String arr[]=data.split("");
        Queue<String> q= new ArrayDeque<>(List.of(arr));

        dfs(q);

}

public static dfs(Queue<String> q){
    String s=q.poll();
    if(s.equals("N")){
        return null;

    }
    TreeNode root=new TreeNode(Integer.parseInt(s));
    root.left=dfs(q);
    root.right=dfs(q);
    return root;
}
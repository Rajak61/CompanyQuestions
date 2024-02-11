package com.datastructure.greatlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchImplementaion {

	int noOfVertex;
	List<Integer> adj[];

	public DepthFirstSearchImplementaion(int noOfVertex) {
		this.noOfVertex = noOfVertex;
		adj = new ArrayList[noOfVertex];
		for (int i = 0; i < noOfVertex; i++) {
			adj[i] = new ArrayList<>();
		}

	}
	
	void vertexDirectLink(int x,int y){
		adj[x].add(y);
	}
	
	void dfs(int sourceVertex){
		
		boolean []visited=new boolean[noOfVertex];
		Stack<Integer>s1=new Stack<>();
		
		s1.push(sourceVertex);
		int node;
		while(!s1.empty()){
			sourceVertex=s1.peek();
			s1.pop();
			
		
		for (int i = 0; i < adj[sourceVertex].size(); i++) {
			node=adj[sourceVertex].get(i);
			if(!visited[node]){
				s1.push(node);
				
			}
			
		}
		if(visited[sourceVertex]==false){
			System.out.print(sourceVertex+" ");
			visited[sourceVertex]=true;
		}
	}}
	
	public static void main(String[] args) {
		DepthFirstSearchImplementaion bfs=new DepthFirstSearchImplementaion(6);
		bfs.vertexDirectLink(0, 1);
		bfs.vertexDirectLink(0, 2);
		bfs.vertexDirectLink(0, 5);
		bfs.vertexDirectLink(1, 0);
		bfs.vertexDirectLink(1, 2);
		bfs.vertexDirectLink(2, 0);
		bfs.vertexDirectLink(2, 1);
		bfs.vertexDirectLink(2, 3);
		bfs.vertexDirectLink(2, 4);
		bfs.vertexDirectLink(3, 2);
		bfs.vertexDirectLink(4, 2);
		bfs.vertexDirectLink(4, 5);
		bfs.vertexDirectLink(5, 0);
		bfs.vertexDirectLink(5, 4);
		bfs.dfs (0);
//		
//		
//		bfs.vertexDirectLink(0, 1);
//		bfs.vertexDirectLink(0, 2);
//		bfs.vertexDirectLink(1, 0);
//		bfs.vertexDirectLink(1, 3);
//		bfs.vertexDirectLink(2, 0);
//		bfs.vertexDirectLink(2, 3);
//		bfs.vertexDirectLink(3, 4);
//		bfs.vertexDirectLink(3, 5);
//		bfs.vertexDirectLink(4, 3);
//		bfs.vertexDirectLink(5, 3);
//		bfs.dfs(0);
	}

}

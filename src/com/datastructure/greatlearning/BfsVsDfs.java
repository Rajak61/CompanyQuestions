package com.datastructure.greatlearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class BfsVsDfs {

	int noOfVertex;
	List<Integer> ajList[];

	BfsVsDfs(int noOfVertex) {
		this.noOfVertex = noOfVertex;
		ajList = new ArrayList[noOfVertex];

		for (int i = 0; i < noOfVertex; i++) {
			ajList[i] = new ArrayList<>();
		}

	}

	void vertexDirectLink(int x, int y) {

		ajList[x].add(y);
	}

	void bfsSearch(int sourceVertex){
		
		boolean[] visited=new boolean[noOfVertex];
		Stack<Integer>finalList=new Stack<>();
		//visited[sourceVertex]=true;
		finalList.add(sourceVertex);
		while(!finalList.isEmpty()){
			sourceVertex=finalList.peek();
			//sourceVertex=finalList.remove(0);
			finalList.pop();
//			System.out.print(sourceVertex+" ");
			Iterator i=ajList[sourceVertex].iterator();
			while (i.hasNext()) {
				int vertexElement=(int)i.next();
				if(!visited[vertexElement]){
					//visited[vertextElement]=true;
					finalList.add(vertexElement);
				}
			}
			if(visited[sourceVertex]==false){
				System.out.print(sourceVertex+" ");
				visited[sourceVertex]=true;
			}
		}
	}
	
	public static void main(String[] args) {
		BfsVsDfs bfs=new BfsVsDfs(6);
		
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
		bfs.bfsSearch(0);
		
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
//		bfs.bfsSearch(0);
		

	}

}

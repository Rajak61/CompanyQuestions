package com.datastructure.greatlearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreadthFirstImplementation {


		int noOfVertex;
		List<Integer> ajList[];

		BreadthFirstImplementation(int noOfVertex) {//intialize ajlist array and its list

			this.noOfVertex = noOfVertex;
			ajList = new ArrayList[noOfVertex];
			for (int i = 0; i < noOfVertex; i++) {
				ajList[i] = new ArrayList<>();
			}
		}

		void vertexDirectLink(int x, int y) {  ///creating array of list ,means ajlist
			ajList[x].add(y);
		}
		
		
		void bfsSearch(int sourceVertex){
			
			boolean[]visited=new boolean[noOfVertex];
			List<Integer>finalList=new ArrayList<>();
			finalList.add(sourceVertex);
			visited[sourceVertex]=true;
			
			while(!finalList.isEmpty()){
				sourceVertex=finalList.remove(0);
				System.out.print(sourceVertex+" ");
				Iterator<Integer> it=ajList[sourceVertex].iterator();
				while (it.hasNext()) {
					int  vertextElement = (int ) it.next();
					if(!visited[vertextElement]){
						visited[vertextElement]=true;
						finalList.add(vertextElement);
						
					}
					
				}
			}
			
		}

	public static void main(String[] args) {
		BreadthFirstImplementation bfs=new BreadthFirstImplementation(6);
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
		
		
	}

}

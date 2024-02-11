package com.datastructure.blind75.graph;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

	enum State {KInit,KVisiting,KVisited};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfCourses=2;
		//int prerequisites[][]={{1,0},{0,1}};
		int prerequisites[][]={{1,0}};
		System.out.println(canFinish(numOfCourses, prerequisites));

	}

	
	//theory- https://www.youtube.com/watch?v=EgI5nU9etnU -neet
	//code-https://walkccc.me/LeetCode/problems/0207/
	//theory --https://www.youtube.com/watch?v=iaaObeAEgxI -knowledgecntre --time limit exceeded
	
	//Time-0(|V|+|E|),Where |V|=num of course and |E|=|Prerequisites|
	//Space -0(|V|+|E|),Where |V|=num of course and |E|=|Prerequisites|
	
	public static boolean canFinish(int numOfCourses,int [][] prerequisites){
		
		List<Integer>adj[]=new ArrayList[numOfCourses];
		
		State[] states=new State[numOfCourses];
		
		for(int i=0;i<numOfCourses;i++)
			adj[i]=new ArrayList<>();
		
		for(int[] pre:prerequisites){
			
			adj[pre[1]].add(pre[0]);
		}
			
		for(int i=0;i<numOfCourses;i++){
			if(hasCycle(adj,states,i))
				return false;
			
		}
		return true;	
		
		
		
	}
	
	public static boolean hasCycle(List<Integer>[] adj,State[] states,int i){
		if(states[i]==State.KVisiting)
			return true;
		if(states[i]==State.KVisited)
			return false;
		states[i]=State.KVisiting;
		for(int ad:adj[i])
			if(hasCycle(adj,states,ad))
				return true;
		states[i]=State.KVisited;
		
		
		return false;
	}
}

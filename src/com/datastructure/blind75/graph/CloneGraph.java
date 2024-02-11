package com.datastructure.blind75.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {
	public static void main(String[] args) {
		Node n = new Node();
		List<Node> ls = new ArrayList<>();
		ls.add(new Node(2));
		ls.add(new Node(3));

		solution(ls);

	}

}
	public class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
			val = 0;
			neighbors = new ArrayList<>();
		}

		public Node(int val) {
			this.val = val;
			neighbors = new ArrayList<>();
		}

		public Node(int val, ArrayList<Node> neighbors) {
			this.val = val;
			this.neighbors = neighbors;
		}
		// }

		

	// space-O(|V|+|E|) and Time(O|V|+|E|)
	// BFS theory -https://www.youtube.com/watch?v=xZ9st62u2Yk
	// code -https://walkccc.me/LeetCode/problems/0133/

	public Node solution(Node node) {
		if (node == null)
			return null;

		Map<Node, Node> map = new HashMap<>();
		Queue<Node> q = new ArrayDeque<>(Arrays.asList(node));
		map.put(node, new Node(node.val));

		while (!q.isEmpty()) {
			Node v = q.poll();
			for (Node n : v.neighbors) {
				if (!map.containsKey(n)) {
					map.put(v, new Node(v.val));
					q.offer(v);

				}
				map.get(node).neighbors.add(map.get(v));

			}
		}
		return map.get(node);
	}

	// space-O(|V|+|E|) and Time(O|V|+|E|)
	// Theoryy --https://www.youtube.com/watch?v=0m_eIw_XW9c -recommended
	// DFS-Theory-neetcode-https://www.youtube.com/watch?v=mQeF6bN8hMk
	// theory-alisha- https://www.youtube.com/watch?v=0QG3dxfqIy4
	// code- https://www.youtube.com/watch?v=0QG3dxfqIy4

	Map<Node, Node> map = new HashMap<>();

	public Node CloneGrapghDFS(Node node) {

		if (node == null)
			return null;

		if (map.containsKey(node)) {
			map.get(node);
		}
		Node newNode = new Node(node.val);
		map.put(node, newNode);

		for (Node neighbor : node.neighbors)
			newNode.neighbors.add(CloneGrapghDFS(neighbor));
		return newNode;
	}
}

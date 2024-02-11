package cm.amdocs;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String>pq=new PriorityQueue<>();
		pq.add("Banana");
		pq.add("pear");
		pq.add("apple");
		System.out.println(pq.poll()+"---"+pq.peek());
	}
}

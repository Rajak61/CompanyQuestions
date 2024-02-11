package com.datastructure.greatlearning;

class QueueUsingArray{
	
	//int front;
	int rear;
	int capacity;
	int[] array;
	QueueUsingArray(int size){
		capacity=size;
		array=new int[capacity];
	}
	
	public void enQueue(int value){
		
		if(rear!=capacity){
			
			array[rear]=value;
			rear++;
		}else{
			System.out.println("queue is full,no element can be added");
		}
		
	}
	public void deQueue(){
		
		if(rear!=0)
		{
			for (int i = 0; i < rear-1; i++) {
				array[i]=array[i+1];
			}
			rear--;
		}else{
			System.out.println("queue is empty");
		}
	}
	public void display(){
		
		if(rear!=0){
			
			for (int i = 0; i < rear; i++) {
				System.out.print(array[i]+" ");
			}
		}
	}
	
	
}

public class QueueUsingOneDArray {

	
	 public static void main(String[] args) {
		QueueUsingArray q=new QueueUsingArray(6);
		q.enQueue(3);
		q.enQueue(0);
		q.enQueue(2);
		q.enQueue(8);
		q.display();
		System.out.println();
		q.deQueue();
		q.display();
		
	}

}

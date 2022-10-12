package queue_datastructure;

import java.util.NoSuchElementException;


public class Queue {
	

	private nodeList front;
	private nodeList rear;
	private int length;
	
	private class nodeList {
		private int data; // Can be a generic type
		private nodeList next; // Reference to next ListNode in list
		
		public nodeList(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Queue() {
		front = null;
		rear = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enqueue(int data) {
		nodeList temp = new nodeList(data);
		if(isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		
		rear = temp;
		length++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is  empty");
		}
		
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length--;
		return result;
	}
	
	public void print() {
		
		//checking weather queue is empty or not
		if(isEmpty()) {
			return;
		}
		
		nodeList current = front;
		while(current != null) {
			System.out.print(current.data + ",");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		
		queue.print();
		
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(30);
		
		queue.print();

	}

}

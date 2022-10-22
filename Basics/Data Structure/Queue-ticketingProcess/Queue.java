package Task1;

public class Queue {
	
	private int maxSize; // size of queue array
	private int [] queArray;
	private int front; //front of the queue 
	private int rear; //rear of the queue
	private int nItems; //no of items of the queue
	private int tickets;//no of tickets per day


	// constructor
	public Queue(int s) {
		maxSize = s; // set array size
		queArray = new int [maxSize];
		front = 0;
		rear = -1;
		nItems = 0; // no items
		tickets = s*3;
	}
	
	//insert
	public void insert(int j) {
		// check whether queue is full
		if (rear == (maxSize-1)){
      System.out.println("Queue is full");
    }
			
		else {
			System.out.println("Inserting " + j);
			queArray[++rear] = j;
			nItems++;
		}
	}

	//remove
	public int remove(int n) {
		if (nItems == 0) {
			System.out.println("Queue is empty");
			return -99; 
		}
		else {
			if(tickets != 0){
				
				tickets = tickets - n;
				int x = queArray[front++];
				 
			     System.out.println("Removing " + x);
			     nItems--;
			     return x;
			}     
			else
		        System.out.println("There are no tickets available");
		        return -99;
					
				}
		}
		
	

	//peekFront
	public int peekFront() {
		if (nItems == 0) {
			System.out.println("Queue is empty");
			return -99; 
		}
		else {
			return queArray[front];
		}
	}
	
	public class main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Queue queue = new Queue(5);

		    queue.insert(1);
		    queue.insert(2);
		    queue.remove(1);
		    
		    System.out.println("No of tickets available: " + queue.tickets);
		}

	}


}

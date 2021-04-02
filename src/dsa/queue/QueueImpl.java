package dsa.queue;

import java.util.Arrays;

public class QueueImpl {

	int[] queueArray;

	int front, rear, maxSize, nItems;

	public QueueImpl(int size) {
		this.queueArray = new int[size];
		this.maxSize = size;
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	public void insert(int value) {
		if(rear == maxSize - 1) { // if reached end of array while inserting. Set rear to -1 so that insertion can began from First index.
			rear = -1;
		}
		queueArray[rear++] = value;
		nItems++;
	}

	public void retrieve() {
		System.out.println(Arrays.toString(queueArray));
	}

	public int remove() { // remove element from front of the queue.
		int firstElement = queueArray[front];
		front++;
		if(front == maxSize) { // here we reached at last index of array.
			front = 0;
		}
		nItems--;
		return firstElement;
	}

	public int peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}
}

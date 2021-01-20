package dsa.stack;

public class StackImpl {
	
	int[] stackArray;
	int top;
	
	public StackImpl(int size) {
		this.stackArray = new int[size];
		this.top = -1;
	}
	
	public void push(int value) {
		top++;
		stackArray[top] = value;
	}
	
	public int pop() {
		int topValue = top;
		top--;
		return stackArray[topValue];
	}
	
	public int peak() {
		if(isEmpty()) {
			return -1;
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

}

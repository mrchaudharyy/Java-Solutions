package dsa.stack;

public class ReverseStringUsingStack {
	
	char[] stackArray;
	int top;
	
	public ReverseStringUsingStack(int size) {
		this.stackArray = new char[size];
		this.top = -1;
	}
	
	public void push(char value) {
		top++;
		stackArray[top] = value;
	}
	
	public char pop() {
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

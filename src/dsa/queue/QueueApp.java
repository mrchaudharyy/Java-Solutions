package dsa.queue;

public class QueueApp {

	public static void main(String[] args) {
		QueueImpl impl = new QueueImpl(5);
		impl.insert(1);
		impl.insert(2);
		impl.insert(3);
		impl.insert(4);
		impl.insert(5);
		
		impl.retrieve();

	}

}


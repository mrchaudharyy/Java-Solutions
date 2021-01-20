package practise;

public class MyApp {
	public static void main(String[] args) {
		MyApp app = new MyApp();
}
}
class Customer {

	String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public final void setName(String name) {
		this.name = name;
	}
}

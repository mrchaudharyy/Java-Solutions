package practise;

class Animal {
	public static void main(String[] args) {

		hello: for (int j = 0; j < 2; j++) {
			for (int k = 0; k < 10; k++) {
				System.out.print(j + "" + k);
				if (j == 1) {
					break hello;// Takes out of loop using j
				}
			}
		}

		Animal a1 = new Animal();
		Animal a2 = new Animal();

		a1 = a2;

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("GC is going to run");
		System.gc();
	}
}

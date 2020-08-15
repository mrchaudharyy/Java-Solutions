package interview;

public class FibonacciSeries {

  public static void main(String[] args) {

    FibonacciSeries obj = new FibonacciSeries();
    obj.printFibonacciSeries(10);
    obj.printFibonacciSeriesUsingWhileLoop(10);
    obj.printFibonacciSeriesWithRecursion(10);

  }

  private void printFibonacciSeries(int n) {

    int firstNumber = 0;
    int secondNumber = 1;
    System.out.println("Using For Loop ");

    // print numbers up to "n"
    for (int i = 0; i < n; i++) {

      System.out.print(secondNumber + " ");
      int sum = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = sum;

    }

  }

  private void printFibonacciSeriesUsingWhileLoop(int n) {

    int firstNumber = 0;
    int secondNumber = 1;
    int i = 0;
    System.out.println("\nUsing While Loop ");
    // print numbers up to "n"
    while (i < n) {

      System.out.print(secondNumber + " ");
      int sum = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = sum;
      i++;
    }

  }

  private void printFibonacciSeriesWithRecursion(int n) {

    System.out.println("\nUsing Recursion ");
    for (int i = 1; i <= n; i++) {
      System.out.print(getNumber(i) + " ");
    }

  }

  private int getNumber(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return getNumber(n - 1) + getNumber(n - 2);
    }
  }

}

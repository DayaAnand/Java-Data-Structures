class RecrusionFibonacci {
  public static void main(String[] args) {
    RecrusionFibonacci recursion = new RecrusionFibonacci();
    var rec = recursion.fibonacci(4);
    System.out.println(rec);

  }

  public int fibonacci(int n) {
    if (n < 0) {
      return -1;
    }
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

}

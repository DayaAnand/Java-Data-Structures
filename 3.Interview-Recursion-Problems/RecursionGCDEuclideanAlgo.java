class RecursionGCDEuclideanAlgo {
  public static void main(String[] args) {
    RecursionGCDEuclideanAlgo main = new RecursionGCDEuclideanAlgo();
    var result = main.gcd(8, 4);
    System.out.println(result);

  }

  // Euclidean Algorithm
  public int gcd(int a, int b) {
    if (a < 0 || b < 0) {
      return -1;
    }
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

}

class RecursionPowerOfNumber {
  public static void main(String[] args) {
    RecursionPowerOfNumber main = new RecursionPowerOfNumber();
    var result = main.power(2, 3);
    System.out.println(result);

  }

  public int power(int base, int exp) {
    if (exp < 0) {
      return -1;
    }
    if (exp == 0 || exp == 1) {
      return base;
    }
    return base * power(base, exp - 1);
  }

}

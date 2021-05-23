class Main {
  public static void main(String[] args) {
   TenToAny test = new TenToAny(234,9);
    System.out.println(test);

    test.setNumber(100);
    test.setBase(2);
    System.out.println(test);

    test.setNumber(56);
    test.setBase(11);
    System.out.println(test);

    test.setNumber(250);
    test.setBase(16);
    System.out.println(test);
  }
}

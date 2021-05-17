class Main {
  public static void main(String[] args) {
   TenToAny tenToAny = new TenToAny();
        tenToAny.setBN(234, 9);
        tenToAny.getNewNum();
    
        tenToAny.setBN(100, 2);
        tenToAny.getNewNum();
    
      tenToAny.setBN(10, 2);
      tenToAny.getNewNum(); 
    
      tenToAny.setBN(15, 2);
      tenToAny.getNewNum();
    
      tenToAny.setBN(256, 2);
      tenToAny.getNewNum();
    
      tenToAny.setBN(100, 8);
      tenToAny.getNewNum();
        System.out.println(tenToAny.toString());
  }
}

public class ReuseDontRecreate {

  public static void stringThings() {
    String romeo = "What's in a String?"; // That's fine
    String juliet = "What's in a String?"; // Still fine, literals are stored separately

    System.out.println("Are romeo and juliet the same? " + (romeo == juliet));

    String lord_capulet = "What's in a String?";
    String tybalt = lord_capulet; // Assignment is fine
    System.out.println("Are capulets the same? " + (lord_capulet == tybalt));

    String mercutio = new String(tybalt); // Noooo
    System.out.println("Then, are not montagues and capulets the same? " + (tybalt == mercutio));
  }

  public static void autoboxing() {
    System.out.println("Here is the primitive version");
    long l = 0;
    for (long i = 0; i < 1000000000L; ++i) {
      l+=i;
      if (l % 10000000 == 0) {
        System.out.print(".");
      }
    }
    System.out.println("Done.");

    System.out.println("Here is the autoboxed version");
    Long autoL = 0L;
    for (long i = 0; i < 1000000000L; ++i) {
      autoL+=i;
      if (autoL % 10000000 == 0) {
        System.out.print(".");
      }
    }
    System.out.println("Done. Phew that took a while!");
  }

  public static void main(String args[]) {
    ReuseDontRecreate.stringThings();
    ReuseDontRecreate.autoboxing();
  }
}

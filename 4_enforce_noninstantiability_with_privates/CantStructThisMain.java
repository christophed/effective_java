public class CantStructThisMain {

  public static void main(String args[]) {
    String real_name = CantStructThis.HAMMER_SECRET_NAME;
    String fake_name = CantStructThis.HAMMER;

    // This is going to throw compiler errors!
    // CantStructThis cannot = new CantStructThis();
  }
}

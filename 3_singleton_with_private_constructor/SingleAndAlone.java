// Singletons can be done with the "singleton" operator, but that
// sucks for testing (apparently).

public class SingleAndAlone {
  private static final SingleAndAlone FOREVER_ALONE = new SingleAndAlone();

  private SingleAndAlone() { }

  // By using a static constructor instead of a public final,
  // we have the flexibility to change the singletonness of this class
  public static SingleAndAlone getInstance() {
    return FOREVER_ALONE;
  }

  public static void main(String args[]) {
    SingleAndAlone lueser = SingleAndAlone.getInstance();
    SingleAndAlone theGreatest = SingleAndAlone.getInstance();

    System.out.println("Are these two guys the same? " + (lueser == theGreatest));
  }
}

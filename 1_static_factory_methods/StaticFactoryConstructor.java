// Item 1: Prefer static factory methods instead of constructors
public class StaticFactoryConstructor {
  private int myInt;
  private double myDouble;
  private String myString;

  static final int DEFAULT_INT = 10;
  static final double DEFAULT_DOUBLE = 99.0;
  static final String DEFAULT_STRING = "k";

  static StaticFactoryConstructor ONLY_ONE;

  // This is the better naming convention
  public static StaticFactoryConstructor newInstance() {
    return new StaticFactoryConstructor(DEFAULT_INT, DEFAULT_DOUBLE, DEFAULT_STRING);
  }

  // Look, you do objective-c argument naming!
  public static StaticFactoryConstructor cstorWithInt(int i) {
    return new StaticFactoryConstructor(i, DEFAULT_DOUBLE, DEFAULT_STRING);
  }

  public static StaticFactoryConstructor cstorWithdouble(double f) {
    return new StaticFactoryConstructor(DEFAULT_INT, f, DEFAULT_STRING);
  }

  public static StaticFactoryConstructor cstorWithString(String s) {
    return new StaticFactoryConstructor(DEFAULT_INT, DEFAULT_DOUBLE, s);
  }

  public StaticFactoryConstructor(int myInt, double myDouble,
      String myString) {
    this.myInt = myInt;
    this.myDouble = myDouble;
    this.myString = myString;
  }

  // Instance-controlled singletons
  public static StaticFactoryConstructor getInstance() {
    if (ONLY_ONE == null) {
      ONLY_ONE = newInstance();
    }
    return ONLY_ONE;
  }

  public static void main(String args[]) {
    StaticFactoryConstructor myExample = StaticFactoryConstructor.cstorWithInt(3);

    StaticFactoryConstructor only_1 = StaticFactoryConstructor.getInstance();
    StaticFactoryConstructor only_2 = StaticFactoryConstructor.getInstance();

    System.out.println("" + myExample.myInt + myExample.myDouble + myExample.myString);

    System.out.println(only_1 == only_2 ? "True" : "False");
  }
}

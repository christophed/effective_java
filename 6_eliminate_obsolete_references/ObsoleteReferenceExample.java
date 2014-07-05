import java.util.HashMap;

public class ObsoleteReferenceExample {
  private class FakeConnection implements ConnectionInterface {
    String path;
    FakeConnection(String path) {
      this.path = path;
    }

    public String fetchResource(String url) {
      return "Hello";
    }

    public void destroyConnection() {}
  }

  // Instance variables
  private HashMap<String, FakeConnection> connections;
  private static final int DEFAULT_CONNECTION_LIMIT = 10;

  public ObsoleteReferenceExample() {
    connections = new HashMap<String, FakeConnection>();
  }

  public String getResource(String url, String path) {
    return "";
  }

  public static void main(String args[]) {
    ObsoleteReferenceExample ob = new ObsoleteReferenceExample();

  }
}


class CantStructThis {
  public static final String HAMMER = "MC";
  public static final String HAMMER_SECRET_NAME = "Stanley";

  // The 'private' is doing the heavy lifting here
  private CantStructThis() {
    // Throw assertion error in case we accidentally call it within
    // the class. Happened when I tried to add a main method here xD
    throw new AssertionError();
  }
}

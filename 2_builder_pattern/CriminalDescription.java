// Alternatives: 
// Telescoping pattern of multiple constructors with different #s of params
//  (Does not scale)
// JavaBeans pattern of a default constructor with default values,
//  augmented by setters
//  (Class cannot be immutable, class may be in an inconsistent state while setting the necessary attributes)
//

public class CriminalDescription {
  public static enum Gender { MALE, FEMALE;}

  private final int heightInInches;
  private Gender gender;
  private final String hairColor;
  private final String hairLength;
  private final String clothing;
  private final String build;
  private final String description;
  private final String tattoos;
  private final boolean piercings;

  // Static cuz, then we'd have a snake eating its tail
  public static class Builder {
    private int heightInInches; // Required
    /* Values with defaults */
    private Gender gender;
    private String hairColor = "";
    private String hairLength = "";
    private String clothing = "";
    private String build = "";
    private String description = "";
    private String tattoos = "none";
    private boolean piercings = false;

    public Builder(int heightInInches, Gender gender) {
      this.heightInInches = heightInInches;
      this.gender = gender;
    }

    public Builder hairColor(String h)
      { hairColor = h; return this; }
    public Builder hairLength(String h)
      { hairLength = h; return this; }
    public Builder clothing(String c)
      { clothing = c; return this; }
    public Builder build(String b)
      { build = b; return this; }
    public Builder description(String d)
      { description = d; return this; }
    public Builder tattoos(String t)
      { tattoos = t; return this; }
    public Builder piercings(boolean p)
      { piercings = p; return this; }

    public CriminalDescription build() {
      return new CriminalDescription(this);
    }
  }

  private CriminalDescription(Builder builder) {
    heightInInches = builder.heightInInches;
    gender = builder.gender;
    hairColor = builder.hairColor;
    hairLength = builder.hairLength;
    clothing = builder.clothing;
    build = builder.build;
    description = builder.description;
    tattoos = builder.tattoos;
    piercings = builder.piercings;
  }

  public String toString() {
    return "Suspect described as a " + gender +
        " approximately " + heightInInches / 12 + " feet and " +
        heightInInches % 12 + " inches tall. With " +
        (piercings ? "" : "no ") + "visible piercings.";
  }

  public static void main(String args[]) {
    CriminalDescription suspect = new CriminalDescription.Builder(72, CriminalDescription.Gender.MALE).hairColor("blonde").build("lean").clothing("tuxedo").tattoos("cross").build();

    System.out.println(suspect);
  }
}

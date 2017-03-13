public @interface Attribute {
  public String value();
  
  public enum GenericName {
    DAMAGE("damage"),
    SPEED("speed"),
    RANGE("range"),
    SELECT_RANGE("select_range"),
    COOLDOWN("cooldown"),
    DURATION("duration");
    
    private String name;
    
    public GenericName(String name) {
      this.name = name;
    }
  }
}

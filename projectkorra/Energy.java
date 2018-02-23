// imports
public class Energy {
  
  public double value;
  
  public Energy(double value) {
    this.value = value;
  }
  
  public double getValue() {
    return value;
  }
  
  public boolean useEnergy(double use) {
    if (value <= 0 || use <= 0) return false;
    if (value - use <= 0) return false;
    value -= use;
    return true;
  }
}
  

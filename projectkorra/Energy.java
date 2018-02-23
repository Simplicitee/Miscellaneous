// imports
public class Energy {
  
  public double value;
  public double rechargeAmount;
  public long rechargeInterval, lastRecharge;
  
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
  
  public void rechargeEnergy() {
    if (System.currentTimeMillis() >= lastRecharge + rechargeInterval) {
      lastRecharge = System.currentTimeMillis();
      value += rechargeAmount;
    }
  }
}
  

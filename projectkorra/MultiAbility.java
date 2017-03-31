public interface MultiAbility {
  
  public interface MultiSubAbility {
    public MultiAbility getMultiAbility();
  }
  
  public enum MultiAbilityEnder {
    SHIFT_CLICK, DOUBLE_CLICK, DOUBLE_SHIFT, CUSTOM;
  }
  
  public List<CoreAbility> getSubAbilities();
  public MultiAbilityEnder getEnder();
  public int getStartingSlot();
}
  

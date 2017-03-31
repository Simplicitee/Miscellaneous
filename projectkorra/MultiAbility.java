public abstract class MultiAbility extends CoreAbility{
  
  public List<CoreAbility> prevAbilities;
  
  public interface MultiSubAbility {
    public MultiAbility getMultiAbility();
  }
  
  public enum MultiAbilityEnder {
    SHIFT_CLICK, DOUBLE_CLICK, DOUBLE_SHIFT, CUSTOM;
  }
  
  public abstract List<CoreAbility> getSubAbilities();
  public abstract MultiAbilityEnder getEnder();
  public abstract int getStartingSlot();
  
  public MultiAbility(Player player) {
    super(player);
    prevAbilities = new ArrayList<>();
    prevAbilities.addAll(bPlayer.getAbilities().values());
    bind();
  }
  
  @Override
  public void remove() {
    super.remove();
    unbind();
  }
  
  public void bind() {
    bPlayer.getAbilities().clear();
    int i = 1;
    for (CoreAbility ability : getSubAbilities()) {
      bPlayer.getAbilities().put(i, ability.getName());
    }
    player.getInventory().setHeldItemSlot(getStartingSlot() - 1);
  }
  
  public void unbind() {
    bPlayer.getAbilities().clear();
    int i = 1;
    int slot = 1;
    for (CoreAbility ability : prevAbilities) {
      bPlayer.getAbilities().put(i, ability.getName());
      if (ability instanceof this) {
        slot = i;
      }
    }
    player.getInventory().setHeldItemSlot(slot - 1);
  }
}
  

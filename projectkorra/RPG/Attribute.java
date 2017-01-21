package com.projectkorra.projectkorra.util;

/*imports*/

public class Attribute {
  
  private static Map<String, TYPE> attributes = new HashMap<>();
  
  public List<AttributeModifier> modifiers;
  public CoreAbility ability;
  public String name;
  public TYPE value;
  
  public Attribute(CoreAbility ability, String name, TYPE value, AttributeModifier... modifiers) {
    this.ability = ability;
    this.name = name;
    this.value = value;
    attributes.put(ability.getName() + "." + name, value);
    this.modifiers = new ArrayList<>(modifiers);
  }
  
  /*Getter methods*/
  
  public TYPE modify(BendingPlayer bPlayer) {
    TYPE modified = value;
    for (AttributeModifier modifier : modifiers) {
      if (!modifier.canModify(bPlayer)) {
        continue;
      }
      value = modifier.newValue(value);
    }
    
    return modified;
  }
  
  public interface AttributeModifier {
    public boolean canModify(BendingPlayer bPlayer);
    public TYPE modify(TYPE value);
  }
}

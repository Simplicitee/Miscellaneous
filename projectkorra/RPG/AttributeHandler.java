public class AttributeHandler {
  
  public interface Attributed {};
  
  private HashMap<CoreAbility, List<Attribute>> abilities;
  private HashMap<Attribute, List<AttributeModifier<?>> attributes;
  
  public AttributeHandler() {
    abilities = new HashMap<>();
    attributes = new HashMap<>();
  }
}

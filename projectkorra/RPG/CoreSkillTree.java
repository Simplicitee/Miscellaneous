//imports
public abstract class CoreSkillTree implements SkillTree {
  
  private static Map<String, CoreSkillTree> nameMap = new HashMap<>();
  private static Map<Integer, CoreSkillTree> idMap = new HashMap<>();
  private static Map<Class<? extends CoreSkillTree>, CoreSkillTree> classMap = new HashMap<>();
  
  private String name;
  private int id, size;
  
  public CoreSkillTree(String name, int id, int size) {
    this.name = name;
    this.id = id;
    this.size = size;
    load();
  }
  
  private void load() {
    nameMap.put(name, this);
    idMap.put(id, this);
    classMap.put(this.getClass(), this);
  }
}

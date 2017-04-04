//imports
public interface SkillTree {
  
  public Player getOpener();
  public int getSize();
  public String getName();
  public int getID();
  public SkillTreeObject[] getObjects();
  public void clickObject(SkillTreeObject object);
  
}

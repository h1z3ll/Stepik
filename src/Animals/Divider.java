package Animals;

public class Divider extends WritingMaterials {

  protected String dividerType;
  protected boolean metal;

  {
    this.name = "No name";
    this.color = "Default";
  }

  public Divider() {
    isDraw = true;
    this.member = WritingMaterials.members;
  }

  public void setDividerType(String s) {
    this.dividerType = s;
  }

  public void setMetal(boolean b) {
    this.metal = b;
  }

  public String getDividerType() {
    return this.dividerType;
  }

  public boolean isMetal() {
    return this.metal;
  }

  public final void draw_circle() {
    System.out.println("drew a circle");
  }

  public void display() {
    System.out.println(
        "i'm " + this.getClass().getSimpleName() + " and " + this.member + " member, my name: "
            + this.name + ", i'm metal: " + ", my type is: " + this.dividerType);
  }
}

package Animals;

public class Pen extends WritingMaterials {

  protected int countColor;
  protected boolean auto;

  {
    this.name = "No name";
    this.color = "Default";
  }

  public Pen() {
    isDraw = true;
    this.member = WritingMaterials.members;

  }

  public void setCountColor(int n) {
    this.countColor = n;
  }

  public void setAuto(boolean auto) {
    this.auto = auto;
  }

  public int getCountColor() {
    return this.countColor;
  }

  public boolean isAuto() {
    return this.auto;
  }

  public void writeMyName() {
    System.out.println("my name is " + this.name);
  }

  public boolean isDraw() {
    return isDraw;
  }

  public void display() {
    System.out.println(
        "i'm " + this.getClass().getSimpleName() + " and " + this.member + " member, my name: "
            + this.name + ", color: " + this.color + ", price: " + this.price + ", length: "
            + this.length + ", i can draw: " + this.isDraw + ", i have " + this.countColor
            + " colors, i am auto:" + this.isDraw);
  }
}

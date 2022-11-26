package Animals;

public final class Ruler extends WritingMaterials {

  private boolean isDraw = false;
  protected boolean wood;

  {
    this.name = "No name";
    this.color = "Default";
  }

  public Ruler() {
    this.member = WritingMaterials.members;
  }

  public void setWood(boolean b) {
    this.wood = b;
  }

  public boolean isWood() {
    return this.wood;
  }

  public void measure() {
    System.out.println("Now we measure the length");
  }

  public void display() {
    System.out.println(
        "i'm " + this.getClass().getSimpleName() + " and " + this.member + " member, my name: "
            + this.name + ", color: " + this.color + ", price: " + this.price + ", length: "
            + this.length + ", i can draw: " + this.isDraw + ", i am wooden: " + this.wood);
  }
}

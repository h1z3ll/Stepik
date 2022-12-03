package Figures.Figure.Quadrilateral;

public class Rhombus {
  protected int a;
  public Rhombus(){};
  public void setA(int a){
    this.a = a;
  }

  public int getPerimeter() {
    return 4 * a;
  }
}

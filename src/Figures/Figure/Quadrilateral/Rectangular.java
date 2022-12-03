package Figures.Figure.Quadrilateral;

public class Rectangular {
  protected int a;
  protected int b;

  public void setSides(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int getPerimeter() {
    return (2 * (this.a + this.b));
  }
}

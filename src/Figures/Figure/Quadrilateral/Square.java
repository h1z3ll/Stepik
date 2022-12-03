package Figures.Figure.Quadrilateral;

public class Square {
  protected int a;
  public Square(){};

  public int getPerimeter() {
    return 4 * this.a;
  }

  public int getSquare(){
    return this.a * this.a;
  }

  public void setA(int a) {
    this.a = a;
  }
}

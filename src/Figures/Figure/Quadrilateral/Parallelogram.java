package Figures.Figure.Quadrilateral;

public class Parallelogram {
  protected int a;
  protected int b;

  public Parallelogram(){};

  public void setSide(int a, int b){
    this.a = a;
    this.b = b;
  }
  public int getPerimeter(){
    return ( 2 * (this.a + this.b) );
  }
}

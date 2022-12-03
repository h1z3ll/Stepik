package Figures.Figure.Triangles;

public class RectangularTriangle {
  protected int a;
  protected int b;
  protected int c;
  protected int cornerA;
  protected int cornerB;
  protected int cornerC;

  public RectangularTriangle(){};

  public void setSides(int a, int b, int c){
    if( ( a < b + c ) && ( b < a + c ) && ( c < a + b ) ){
      this.a = a;
      this.b = b;
      this.c = c;
    } else {
      System.out.println("Wrong side lengths");
    }
  }
  public void setCorners(int a, int b, int c){
    if (a != 90 && b != 90 && c != 90){
      System.out.println("It's not rectangular triangle");
    } else if ( (a + b + c) != 180) {
      System.out.println("Wrong corners");
    } else {
      this.cornerA = a;
      this.cornerB = b;
      this.cornerC = c;
    }
  }

  public int getPerimeter(){
    return (this.a + this.b + this.c);
  }

}

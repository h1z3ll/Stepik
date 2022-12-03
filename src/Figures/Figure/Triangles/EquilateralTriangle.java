package Figures.Figure.Triangles;

public class EquilateralTriangle {
  protected int a;
  protected int b;
  protected int c;
  protected String name;
  public EquilateralTriangle(){};
  public void setSides(int a, int b, int c){
    if (a != b && a!= b || b != a && b != c || c != a && c != b ){
      System.out.println("It's not equilateral triangle");
    } else if( ( a < b + c ) && ( b < a + c ) && ( c < a + b ) ){
      this.a = a;
      this.b = b;
      this.c = c;
    } else {
      System.out.println("Wrong side lengths");
    }
  }
  public int getPerimeter(){
    return (this.a + this.b + this.c);
  }
}
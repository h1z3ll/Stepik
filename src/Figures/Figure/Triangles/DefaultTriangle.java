package Figures.Figure.Triangles;

public class DefaultTriangle {
  protected int a;
  protected int b;
  protected int c;
  protected String name;
  protected int cornerA;
  protected int cornerB;
  protected int cornerC;

  public DefaultTriangle(){};
  public void setSides(int a, int b, int c){
    if( ( a < b + c ) && ( b < a + c ) && ( c < a + b ) ){
      this.a = a;
      this.b = b;
      this.c = c;
    } else {
      System.out.println("Wrong side lengths");
    }
  }
  public void setCorners(int cornerA, int  cornerB, int cornerC){
    if ( ( cornerA + cornerB + cornerC) != 180){
      System.out.println("Wrong corners");
    } else {
      this.cornerA = cornerA;
      this.cornerB = cornerB;
      this.cornerC = cornerC;
    }
  }
  public int getPerimeter(){
    return (this.a + this.b + this.c);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

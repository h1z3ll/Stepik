package Figures.Figure.Triangles;

public class IsosceleTtriangle {
  protected int a;
  protected int b;
  protected int c;
  public IsosceleTtriangle(){};

  public void setSides(int a, int b, int c){
    if ( a == b && b == c && a == c ){
      this.a = a;
      this.b = b;
      this.c = c;
    } else {
      System.out.println("Wrong sides");
    }
  }
  public int getPerimeter(){
    return (this.a + this.b + this.c);
  }

}

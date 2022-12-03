package Figures.Figure.Quadrilateral;

public class Trapezoid {
  protected int a;
  protected int b;
  protected int c;
  protected int d;
   public Trapezoid(){};

   public void setSides(int a, int b, int c, int d){
     this.a = a;
     this.b = b;
     this.c = c;
     this.d = d;
   }

   public int getPerimeter(){
     return this.a + this.b + this.c + this.d ;
   }

}

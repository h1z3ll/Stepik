package Figures.Figure;

public class Circle {
  protected int radius;
 public Circle(){ };
 public void setRadius(int i){
   this.radius = i;
 }

  public double getPerimeter() {
    return 2 * 3.14 * this.radius;
  }
  public double getSquare(){
    return 3.14 * this.radius * this.radius;
  }

}

package Figures;

import Figures.Figure.Circle;
import Figures.Figure.Hexagon;
import Figures.Figure.Oval;
import Figures.Figure.Pentagon;
import Figures.Figure.Quadrilateral.Convex;
import Figures.Figure.Quadrilateral.Parallelogram;
import Figures.Figure.Quadrilateral.Rectangular;
import Figures.Figure.Quadrilateral.Rhombus;
import Figures.Figure.Quadrilateral.Square;
import Figures.Figure.Quadrilateral.Trapezoid;
import Figures.Figure.Triangles.DefaultTriangle;
import Figures.Figure.Triangles.EquilateralTriangle;
import Figures.Figure.Triangles.IsosceleTtriangle;
import Figures.Figure.Triangles.RectangularTriangle;

public class Figuresmain {

  public static void main(String[] args) {
    Convex c1 = new Convex();
    c1.setA(4);
    c1.setB(5);
    c1.setC(7);
    c1.setD(10);
    System.out.println( c1.getA() + c1.getB() + c1.getC() + c1.getD());

    Parallelogram p1 = new Parallelogram();
    p1.setSide(10, 8);
    System.out.println(p1.getPerimeter());

    Rectangular r1 = new Rectangular();
    r1.setSides(10, 6);
    System.out.println(r1.getPerimeter());

    Rhombus rh1 = new Rhombus();
    rh1.setA(1000);
    System.out.println(rh1.getPerimeter());

    Square sq1 = new Square();
    sq1.setA(5);
    System.out.println(sq1.getSquare());
    System.out.println(sq1.getPerimeter());

    Trapezoid tr1 = new Trapezoid();
    tr1.setSides(10, 40, 20, 12);

    Circle circle = new Circle();
    circle.setRadius(5);
    System.out.println(circle.getPerimeter());
    System.out.println(circle.getSquare());

    Hexagon h1 = new Hexagon();
    h1.setName("ABCDEF");
    h1.setA(1);
    h1.setB(2);
    h1.setC(3);
    h1.setD(4);
    h1.setE(5);
    h1.setG(6);
    System.out.println(h1.getA() + h1.getB() + h1.getC() + h1.getD() + h1.getE() + h1.getG());

    Oval o1 = new Oval();
    o1.setRadiusOx(5000);
    o1.setRadiusOy(10000);
    System.out.println(3.14 * o1.getRadiusOx() * o1.getRadiusOy());

    Pentagon penta1 = new Pentagon();
    penta1.setA(2);
    penta1.setB(2);
    penta1.setC(2);
    penta1.setD(2);
    penta1.setE(2);
    penta1.setName("ABCDE");
    System.out.println(penta1.getA() + penta1.getB() + penta1.getC() + penta1.getE() + penta1.getD());

    DefaultTriangle dt1 = new DefaultTriangle();
    dt1.setName("NET");
    dt1.setSides(3, 4 , 5);
    dt1.setCorners(56, 44, 80);
    System.out.println(dt1.getName());
    System.out.println(dt1.getPerimeter());

    EquilateralTriangle et1 = new EquilateralTriangle();
    et1.setSides(5, 5, 5);
    System.out.println(et1.getPerimeter());
    IsosceleTtriangle it1 = new IsosceleTtriangle();
    it1.setSides(10, 10, 5);
    System.out.println(it1.getPerimeter());

    RectangularTriangle rt1 = new RectangularTriangle();
    rt1.setSides(5, 12 , 13);
    rt1.setCorners(34, 90, 46);
    System.out.println(rt1.getPerimeter());
  }
}

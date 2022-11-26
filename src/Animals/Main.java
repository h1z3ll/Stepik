package Animals;

class Extends{
  public static void main(String[] args) {

    WritingMaterials wm = new WritingMaterials("pen", "red", 145, 15.6, true);
    wm.display();

    Pen p = new Pen();
    p.setName("Parker");
    p.display();
    p.setCountColor(2);
    p.setAuto(false);
    System.out.println("i have " + p.getCountColor() + " colors");
    System.out.println("i'm auto: " + p.isAuto());
    p.writeMyName();

    Ruler r = new Ruler();
    r.setName("ruler");
    r.display();
    r.setLength(25);
    r.setWood(true);
    System.out.println("my length is " + r.getLength());
    System.out.println("i'm wooden: " + r.isWood());
    r.measure();

    Divider d = new Divider();
    d.setName("divider");
    d.display();
    d.setDividerType("with pencil");
    d.setMetal(true);
    System.out.println("i'm divider " + d.getDividerType());
    System.out.println(d.isMetal());
    d.draw_circle();
    WritingMaterials.getDescription();
    r.getDescription();
  }
}




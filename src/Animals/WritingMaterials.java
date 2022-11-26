package Animals;

class WritingMaterials {
  protected int member;
  public static int members;
  protected String name;
  protected String color;
  protected double length;
  protected int price;
  protected boolean isDraw;



  public WritingMaterials(String name, String color, int price, double length, boolean isDraw){
    this.name = name;
    this.color = color;
    this.price = price;
    this.length = length;
    this.isDraw = isDraw;

  }

  public WritingMaterials(){}

  {
    this.name = "No name";
    this.color = "Default";
    members++;
    this.member = members;
  }

  public static void getDescription(){
    System.out.println("We are " +  members + " of writing things. " );
  }

  public void display(){
    System.out.println("I'm " + this.member + " member, Name: " + this.name + ", color: " + this.color + ", price: " + this.price + ", length: " + this.length + ", i can draw: " + this.isDraw );
  }
  public void setName(String name){
    this.name = name;
  }
  public void setLength(double length){
    this.length = length;
  }
  public double getLength(){
    return this.length;
  }
}
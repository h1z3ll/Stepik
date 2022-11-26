package Buildings;


public class Flat extends Building implements LivingHouse, SocialHouse {

  protected int whichFloor;
  protected int numberOfFlat;
  protected int inhabitants;
  protected boolean isAnyNeighbours;
  protected int howManyRooms;

  public Flat() {
  }

  public void setWhichFloor(int i) {
    this.whichFloor = i;
  }

  public void getWhichFloor() {
    System.out.println("I am on the" + this.whichFloor + " floor");
  }

  public void setNumberOfFlat(int i) {
    this.numberOfFlat = i;
  }

  public void getNumberOfFlat() {
    System.out.println("My number is" + this.numberOfFlat);
  }

  public void setInhabitants(int i) {
    this.inhabitants = i;
  }

  public void inhabitants() {
    if (this.inhabitants == 0) {
      System.out.println("Nobody lives here");
    } else if (this.inhabitants == 1) {
      System.out.println("One human lives here");
    } else {
      System.out.println(this.inhabitants + " people live here");
    }
  }

  public void setAnyNeighbours(boolean neighbours) {
    this.isAnyNeighbours = neighbours;
  }

  public void getAnyNeighbours() {
    if (this.isAnyNeighbours) {
      System.out.println("I have neighbours");
    } else {
      System.out.println("I haven't got any neighbours");
    }
  }

  public void setHowManyRooms(int i) {
    this.howManyRooms = i;
  }

  public void getHowManyRooms() {
    System.out.println("I have" + this.howManyRooms + " rooms");
  }

  @Override
  public void print() {
    System.out.println(
        "My name is " + this.name + ", address: " + this.address + ", i was built in " + this.whenBuilt +
            ", I am a sight seeing " + this.isItSightSeeing + ", I am on the " + this.whichFloor
            + " floor, I am the " + this.numberOfFlat + " floor, " + this.inhabitants + " live here, I have neighbours: " +
            this.isAnyNeighbours + ", there are " + this.howManyRooms + " rooms");
  }

  public void setVisitors(int i){
    this.visitors = i;
  }

  @Override
  public void howManyVisitors(){
    System.out.println("Buildings.Flat is visited by " + this.visitors + " members of family");
  }
}

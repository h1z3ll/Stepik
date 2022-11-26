package Buildings;

import Buildings.Building;
import Buildings.SocialHouse;

public class ShoppingCentre extends Building implements SocialHouse {
  protected int howManyShops;
  protected boolean undergroundParking;
  protected int amountOfParkingPlacesForCars;

  public ShoppingCentre(){}

  public void setHowManyShops(int i){
    this.howManyShops = i;
  }

  public void getHowManyShopsp(){
    System.out.println("There are" + this.howManyShops + " shops");
  }

  public void setUndergroundParking(boolean b){
    this.undergroundParking = b;
  }

  public void setUnderGroundParking(){
    if (this.undergroundParking){
      System.out.println("There is underground parking");
    } else {
      System.out.println("There isn't underground parking");
    }
  }

  public void setAmountOfParkingPlacesForCars(int i){
    this.amountOfParkingPlacesForCars = i;
  }

  public void getAmountOfParkingPlacesForCars(){
    System.out.println("There are " + this.amountOfParkingPlacesForCars + " parking places");
  }
  @Override
  public void print() {
    System.out.println(
        "My name is " + this.name + ", address: " + this.address + ", i was built in " + this.whenBuilt +
            ", I am a sight seeing " + this.isItSightSeeing + ",  working time: " + this.workingTime + ", there are " +
        this.howManyShops + " shops, there is a underground parking: " + this.undergroundParking  );
  }
  public void setvisitors(int i){
    this.visitors = i;
  }
  @Override
  public void howManyVisitors(){
    System.out.println("Shopping centre is visited by " + this.visitors + " shoppers");
  }
}

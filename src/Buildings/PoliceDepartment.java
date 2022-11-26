package Buildings;

import Buildings.Building;
import Buildings.SocialHouse;

public class PoliceDepartment extends Building implements SocialHouse {
  protected int employees;
  protected boolean isPrison;

  public PoliceDepartment(){}

  public void setEmployees(int i){
    this.employees = i;
  }
  public void getEmployees(){
    System.out.println(this.employees + " people work here");
  }
  public void setPrison(boolean b){
    this.isPrison = b;
  }
  public void getPrison(){
    if (this.isPrison){
      System.out.println("There is a prison");
    } else {
      System.out.println("There isn't a prison");
    }
  }
  @Override
  public void print() {
    System.out.println(
        "My name is " + this.name + ", address: " + this.address + ", i was built in " + this.whenBuilt +
            ", I am a sight seeing " + this.isItSightSeeing + ", " + this.employees + " employees work there, There is a prison: "
            + this.isPrison + ", working time: " + this.workingTime);
  }
  public void setvisitors(int i){
    this.visitors = i;
  }
  @Override
  public void howManyVisitors(){
    System.out.println("Police department is vivsited by " + this.visitors + " people");
  }
}

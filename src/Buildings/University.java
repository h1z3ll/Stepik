package Buildings;

import Buildings.Building;
import Buildings.SocialHouse;

public class University extends Building implements SocialHouse {
  protected String job;
  protected int amountOfStudents;

  public University(){}

  public void setJob(String str){
    this.job = str;
  }
  public void getJob(){
    System.out.println("My students will work in " + this.job + " sphere ");
  }
  public void setAmountOfStudents(int i){
    this.amountOfStudents = i;
  }

  public void getAmountOfStudents(int i){
    System.out.println(this.amountOfStudents + " students are studying.");
  }
  @Override
  public void print(){
    System.out.println("My name is " + this.name + ", address: " + this.address + ", i was built in " + this.whenBuilt +
        ", i am a sight seeing: " + this.isItSightSeeing + ", working time: " + this.workingTime + ", My stydents will work in " +
        this.job + " sphere, there are " + this.amountOfStudents + " students");
  }
  public void setvisitors(int i){
    this.visitors = i;
  }
  @Override
  public void howManyVisitors(){
    System.out.println("Buildings.University is vivsited by " + this.visitors + " students");
  }
}

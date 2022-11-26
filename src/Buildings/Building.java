package Buildings;

public abstract class Building {
  protected String name;
  protected String address;
  protected int whenBuilt;
  protected String whoDesigned;
  protected boolean isItSightSeeing;
  protected String workingTime;
  protected int visitors;

  public Building(){}

  public void setName(String name){
    if(!name.isEmpty()){
      this.name = name;
    }else{
      System.out.println("Вы ввели пустое название");
    }
  }

  public void getName(){
    System.out.println("I'm " + this.name);
  }

  public void setAddress(String place){
    if(!place.isEmpty()){
      this.address = place;
    }else{
      System.out.println("Вы ввели пустой адрес");
    }
  }

  public void setWhenBuilt(int i){
    this.whenBuilt = i;
  }

  public void getWhenBuilt(){
    System.out.println("I was built in " + this.whenBuilt);
  }

  public void setWhoDesigned(String designer){
    this.whoDesigned = designer;
  }

  public void getWhoDesigned(){
    System.out.println("I'm designed by " + this.whoDesigned );
  }

  public void setItSightSeeing(boolean b){
    this.isItSightSeeing = b;
  }

  public void getItSightSeeing(){
    if(this.isItSightSeeing){
      System.out.println("I'm sight seeing");
    }else{
      System.out.println("I'm not sight seeing");
    }
  }
  public void setWorkingTime(String time){
    this.workingTime = time;
  }
  public void getWorkingTime(){
    System.out.println("I work " + this.workingTime);
  }
  abstract void print();
}


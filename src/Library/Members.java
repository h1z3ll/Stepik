package Library;

public class Members extends People implements Hz{
  protected int takenBooks;
  protected String whenRegistration;

  public void setTakenBooks(int i){
    this.takenBooks = i;
  }

  public int getTakenBooks(){
     return this.takenBooks;
  }

  public void setWhenRegistration(String str){
    this.whenRegistration = str;
  }

  public String getWhenRegistration(){
    return this.whenRegistration;
  }

  public void display(){
    System.out.println("Name: " + this.name + ", Surname: " +  this.surname + ", age: " + this.age + ", phone number: " + this.phoneNumber +
        ", residence: " + this.residence + ", books were taken: " + this.takenBooks + " member since " + this.whenRegistration);
  }
}

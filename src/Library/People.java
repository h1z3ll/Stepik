package Library;

public abstract class People {
  protected String name;
  protected String surname;
  protected int age;
  protected String phoneNumber;
  protected String residence;

  public void setName(String str){
    this.name = str;
  }

  public String getName(){
    return this.name;
  }

  public void setSurname(String str){
    this.surname = str;
  }

  public String getSurname(){
    return this.surname;
  }

  public void setAge(int i){
    this.age = i;
  }

  public int getAge(){
    return this.age;
  }

  public void setResidence(String str){
    this.residence = str;
  }

  public String getResidence() {
    return residence;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


}

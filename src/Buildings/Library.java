package Buildings;


public class Library extends Building implements SocialHouse {
  protected int amountOfBooks;
  protected int maxAmountOfBooks;
   protected int amountOfMembers;

  public Library(){}
  public void setAmountOfBooks(int i){
    this.amountOfBooks = i;
  }
  public void getAmountOfBooks(){
    System.out.println("I have " + this.amountOfBooks + " books");
  }
  public void setMaxAmountOfBooks(int i){
    this.maxAmountOfBooks = i;
  }
  public void getMaxAmountOfBooks(){
    System.out.println("I can have maximum " + this.maxAmountOfBooks + " books");
  }
  public void setAmountOfMembers(int i){
    this.amountOfMembers = i;
  }
  public void getAmountOfMembers(){
    System.out.println("I have " + this.amountOfMembers + " readers");
  }
  @Override
  public void print(){
    System.out.println("My name is " + this.name + ", address: " + this.address + ", i was built in " + this.whenBuilt +
        ", I was designed by" + this.whoDesigned + ", I am a sight seeing: " + this.isItSightSeeing + ", working time: " + this.workingTime + ", I have" +
        this.amountOfBooks + " books, I can have " + this.maxAmountOfBooks + " books, I have " + " readers");
  }
  public void  setvisitors(int i){
    this.visitors = i;
  }
  @Override
  public void howManyVisitors(){
    System.out.println("Buildings.Library is vivsited by " + this.visitors + " readers ");
  }
}
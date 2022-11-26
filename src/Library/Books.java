package Library;

public class Books implements Hz{
   protected String type;
   protected String content;
   protected String whereWritten;
   protected int howManyTimesTaken;
   protected String name;
   protected String author;

   public void setType(String str){
     this.type = str;
   }

   public String getType(){
     return this.type;
   }

   public void setContent(String str){
     this.content = str;
   }

   public String getContent(){
     return this.content;
   }

   public void setWhereWritten(String str){
     this.whereWritten = str;
   }

   public String getWhereWritten(){
     return this.whereWritten;
   }

   public void setHowManyTimesTaken(int i){
     this.howManyTimesTaken = i;
   }

   public int getHowManyTimesTaken(){
     return this.howManyTimesTaken;
   }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  public void display(){
     System.out.println("Name: " + this.name + ", type: " + this.type + ", author: " + this.author + ", content: " + this.content + ", book was written in " + this.whereWritten +
         ", book was taken " + this.howManyTimesTaken + " times");
   }
}

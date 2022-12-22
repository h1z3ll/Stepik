package StepikExercises.Generics;

public class Dog extends Animal {
  String name;
  public Dog(String name){
    super(name);
    this.name = name;
  }
  public void bark(){
    System.out.println("гав-гав");
  }
}

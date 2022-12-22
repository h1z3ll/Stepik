package StepikExercises.Generics;

import Buildings.Abstract;
import java.util.ArrayList;
import java.util.List;

public class Generic {

  public static void main(String[] args) {
    List<Animal> listOfAnimals = new ArrayList<>();
    List<Dog> listOfDog = new ArrayList<>();
    listOfAnimals.add(new Animal("Rikki"));
    listOfAnimals.add(new Animal("Chakky"));
    listOfDog.add(new Dog("Chip"));
    listOfDog.add(new Dog("Chack"));

    soutDog((ArrayList<Dog>) listOfDog);
    soutList((ArrayList<Animal>) listOfAnimals);
  }
  public static void soutList(ArrayList<Animal> list){
    for (Animal animal : list){
      System.out.println(animal.name);
      animal.eat();
    }
  }
  public static void soutDog(ArrayList<Dog> list){
    for (Dog dog : list){
      System.out.println(dog.name);
      dog.bark();
    }
  }
}

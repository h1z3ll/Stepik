package StepikExercises;

import java.awt.ItemSelectable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TryCatch {

  public static void main(String[] args) {
    File file = new File("test4");
    File f2 = new File("test1");
    try {
    Scanner sc = new Scanner(file);
    sc.close();
      System.out.println("Block try");
  } catch (FileNotFoundException e){
      System.out.println("File wasn't found");
    }
    System.out.println("After tryCatch");
    System.out.println("");
    scan(file);
    scan(f2);
  }

  public static void scan(File file){
    try {
      Scanner sc = new Scanner(file);
      sc.close();
      System.out.println("BLock try 'scan' ");
    } catch (FileNotFoundException e ){
      System.out.println("File wasn't found");
    }
    System.out.println("After 'scan' ");
    System.out.println("");
  }
}

package StepikExercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class FileReadingAndPrintingIn {

  public static void main(String[] args) throws FileNotFoundException {
//    String separator = File.separator;
//    String path = separator + "C:" + separator + "Users" + separator + "aliaksandr.hramyka" + separator + "Desktop" + separator + "New Text Document.txt";
    File file = new File("test4");
    Scanner scanner = new Scanner(file);
    String str = scanner.nextLine();
    scanner.close();
    System.out.println(str.replaceAll("Я люблю", "Саша любит"));
    System.out.println(str.replaceAll("Я люблю", "Мама любит"));
    System.out.println(str.replaceAll("Я люблю", "Папа любит"));
    System.out.println(str.replaceAll("Я люблю", "Бабушка любит"));
    PrintWriter pw = new PrintWriter(file);
    //pw.println("Я люблю булочку с маком");
    pw.println("Я хочу мармелад");
    pw.println("Привет, я Java!");
    pw.close();
  }
}


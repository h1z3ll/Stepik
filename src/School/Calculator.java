package School;
import java.util.*;
public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str0 = sc.nextLine();
    char[] ch = str0.toCharArray();
    boolean letter = false;
    String[] str = str0.split(" ");
    for (int i = 0; i < ch.length; i++){
      if (Character.isLetter(ch[i])){
        letter = true;
        break;
      }
    }
    boolean zero = false;
    Double a;
    Double b;
    boolean znak = true;
    if (letter == false){
      a = Double.parseDouble(str[0]);
      b = Double.parseDouble(str[2]);
      if (str[1].equals("+")){
        System.out.println(a + b);
      } else if (str[1].equals("-")){
        System.out.println(a - b);
      } else if (str[1].equals("*")){
        System.out.println(a * b);
      } else if (str[1].equals("/") && b != 0.0){
        System.out.println(a / b);
      } else if (str[1].equals("/") && b == 0.0){
        zero = true;
      }else if (str[1].equals("%") && b != 0.0) {
        System.out.println(a % b);
      } else if (str[1].equals("%") && b == 0) {
        zero = true;
      } else {
        znak = false;
      }
    }
    if (letter){
      System.out.println( "Error! Not number");
    }else if (znak == false){
      System.out.println("Operation Error!");
    } else if (zero){
      System.out.println("Error! Division by zero");
    }
  }
}

package School;

import java.util.Scanner;

public class Lessons {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    char[] str1 = sc.nextLine().toLowerCase().replaceAll(" ", "").toCharArray();
    char[] str2 = new char[str1.length];
    boolean palidrom = true;
    for (int i = 0; i < str1.length; i++){
      str2[str1.length - (i + 1)] = str1[i];
    }
    for (int i = 0; i < str1.length; i++){
      if ( str1[i] != str2[i]){
        palidrom = false;
        break;
      }
    }
    if (palidrom){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}

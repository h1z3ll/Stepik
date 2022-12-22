package School;
import java.util.*;

public class Exercise24 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] str = sc.nextLine().toCharArray();
    boolean Letter = false;
    if (str.length > 0) {
      for (int i = 0; i < str.length; i++) {
        if (Character.isLetter(str[i])) {
          Letter = true;
          break;
        }
      }
    } else {
      System.out.println("Error");
    }
    if (Letter) {
      System.out.println("There are letters");
    } else if (str.length == 1) {
      StringBuilder strX = new StringBuilder();
      int i = Integer.parseInt(strX.append(str[0]).toString());
      if (i % 4 == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    } else {
      StringBuilder strX = new StringBuilder();
      int i = Integer.parseInt(
          strX.append(str[str.length - 2]).append(str[str.length - 1]).toString());
      if (i % 4 == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}


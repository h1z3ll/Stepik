package School;
import java.util.*;

public class perevorot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char change;
    char[] str = sc.nextLine().toLowerCase().toCharArray();
    for (int i = 0; i < str.length / 2; i++){
      change = str[i];
      str[i] = str[str.length - i - 1];
      str[str.length - i - 1] = change;
    }
    for (int i = 0; i < str.length; i++){
      System.out.print(str[i]);
    }
  }
}

package School;
import java.util.*;

public class Digit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] str = sc.nextLine().toCharArray();
    StringBuilder str0 = new StringBuilder();
    int amount = 0;
    for (int i = 0; i < str.length; i++){
      if(Character.isDigit(str[i])){
        str0.append(str[i]);
      }else if (!str0.isEmpty()){
        amount += Integer.parseInt(str0.toString());
        str0 = new StringBuilder();
      }
      if (i == str.length - 1 && Character.isDigit(str[i])){
        amount += Integer.parseInt(str0.toString());
      }
    }
    if (amount % 4 == 0){
      System.out.println("YES, " + amount +" / 4 = " + amount / 4 );
    } else {
      System.out.println("NO");
    }
  }
}

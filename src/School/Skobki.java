package School;
import java.util.*;

public class Skobki {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char str[] = sc.nextLine().toCharArray();
    char lastBrace = ')';
    int openBraces = 0;
    int closeBraces = 0;
    for (int i = 0; i < str.length; i++){

      if (str[i] == ')' && openBraces != 0){
        closeBraces++;
      } else       if (str[i] == '('){
        openBraces++;
      }else      if (str[i] == lastBrace && str[i] == ')' ){
        System.out.println("Закрывающиеся скобки раньше открывающихся скобок");
        break;
      }
    }
    if(openBraces == closeBraces && openBraces != 0){
      System.out.println("Все хорошо" );
    } else if (openBraces > closeBraces) {
      System.out.println("Открытых скобок больше, чем закрытых");
    }else if(closeBraces > openBraces ){
      System.out.println("Закрытых скобок больше");
    }
    }
  }


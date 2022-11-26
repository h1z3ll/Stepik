package School;
import java.util.*;

public class Kirill {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число");
    int family = sc.nextInt();
    sc.nextLine();
    System.out.println("Введите имя");
    String name = sc.nextLine();
    System.out.println(name + " сменил " + family + " семей.");

  }
}

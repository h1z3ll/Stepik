package Library;
public class Project {
  public static void main(String[] args) {

    Employee e1 = new Employee();
    e1.setName("Vasya");
    e1.setSurname("Lypkin");
    e1.setJob("librarian");
    e1.setWorkTime("5 years");
    e1.setSalary(945);
    e1.setPhoneNumber("+375 29 123-97-00");
    e1.setAge(45);
    e1.setResidence("Непокоренных 2в");
    displayAll(e1);

    Members m1 = new Members();
    m1.setName("Petr");
    m1.setSurname("Pupkin");
    m1.setWhenRegistration("01.12.2015");
    m1.setPhoneNumber("+375 29 121-34-58");
    m1.setResidence("Мир 23");
    m1.setTakenBooks(93);
    m1.setAge(34);
    displayAll(m1);

    Books b1 = new Books();
    b1.setName("Сборник сказок");
    b1.setAuthor("Ханс Андерсен");
    b1.setContent("Оловянный солдатик и другие");
    b1.setType("fairy tail");
    b1.setWhereWritten("France");
    b1.setHowManyTimesTaken(345);
    displayAll(b1);
  }
  public static void displayAll(Hz i){
    i.display();
  }
}

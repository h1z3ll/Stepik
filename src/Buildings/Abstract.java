package Buildings;

public class Abstract {
  public static void main(String[] args) {

    Library l1 = new Library();
    l1.setName("");
    l1.setName("The National library of Belarus");
    l1.setAddress("Проспект Независимости 116");
    l1.setWhenBuilt(2006);
    l1.setWhoDesigned("М.К. Виноградов и В.В. Крамаренко");
    l1.setItSightSeeing(true);
    l1.setWorkingTime("Monday - Friday: 10:00 - 21:00 ; Saturday: 10:00 - 18:00 ; Sunday is a holiday");
    l1.setAmountOfBooks(8900000);
    l1.setMaxAmountOfBooks(14000000);
    l1.setAmountOfMembers(1000000);
    l1.getAmountOfBooks();
    l1.getMaxAmountOfBooks();
    l1.getAmountOfMembers();
    l1.print();
    l1.howManyVisitors();
    l1.setvisitors(321);
    allVisitors(l1);

    Flat f1 = new Flat();
    f1.setName("Laguna");
    f1.setAddress("Nemiga");
    f1.setWhenBuilt(2008);
    f1.setItSightSeeing(false);
    f1.setWhichFloor(30);
    f1.setNumberOfFlat(210);
    f1.setInhabitants(4);
    f1.setAnyNeighbours(false);
    f1.setHowManyRooms(10);
    f1.print();
    f1.setVisitors(7);
    allVisitors(f1);
    allInhabitants(f1);

    PoliceDepartment p1 = new PoliceDepartment();
    p1.setName("РОВД");
    p1.setAddress("hz");
    p1.setWhenBuilt(2010);
    p1.setItSightSeeing(false);
    p1.setEmployees(300);
    p1.setPrison(false);
    p1.setWorkingTime("Mon - Sat: 9:00 - 18:00 ; Sunday is a holiday");
    p1.print();
    p1.setvisitors((int) Math.round(Math.random() * Math.random() * 1000));
    allVisitors(p1);

    University u1 = new University();
    u1.setName("BSUIR");
    u1.setAddress("Minsk");
    u1.setWhenBuilt(1999);
    u1.setItSightSeeing(false);
    u1.setWorkingTime("Monday - Saturday: 8:30 - 20:00");
    u1.setJob("IT");
    u1.setAmountOfStudents(2000);
    u1.print();
    u1.setvisitors((int) Math.round(Math.random() * Math.random() * 1000));
    allVisitors(u1);

    ShoppingCentre s1 = new ShoppingCentre();
    s1.setName("Gallery");
    s1.setAddress("Nemiga");
    s1.setWhenBuilt(2009);
    s1.setItSightSeeing(false);
    s1.setWorkingTime("every day");
    s1.setHowManyShops(76);
    s1.setUndergroundParking(false);
    s1.print();
    s1.setvisitors((int) Math.round(Math.random() * Math.random() * 1000));
    allVisitors(s1);

    HighRiseBuilding h1 = new HighRiseBuilding();
    h1.setName("No name");
    h1.setAddress("Nemiga");
    h1.setWhenBuilt(2010);
    h1.setItSightSeeing(false);
    h1.setFloors(87);
    h1.setMaterial("glass");
    h1.setUndergroundParking(false);
    h1.print();
    h1.setVisitors((int) Math.round(Math.random() * Math.random() * 1000));
    allVisitors(h1);
  }

  public static void allVisitors(SocialHouse a){
    a.howManyVisitors();
  }

  public static void allInhabitants(LivingHouse a){
    a.inhabitants();
  }

}

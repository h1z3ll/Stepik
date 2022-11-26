package Library;

public class Employee extends People implements Hz {
  protected String job;
  protected String workTime;
  protected int salary;

  public void setJob(String str){
    if (str.equalsIgnoreCase("fired") || str.equalsIgnoreCase("dismissed")
    || str.equalsIgnoreCase("sacked")){
      this.job = "fired";
      this.salary = 0;
    } else {
      this.job = str;
    }
  }

  public String getJob(){
    return this.job;
  }

  public void setWorkTime(String str){
    this.workTime = str;
  }

  public String getWorkTime(){
    return this.workTime;
  }

  public void setSalary(int i) {
    this.salary = i;
  }

  public int getSalary(){
    return this.salary;
  }
  public void display(){
    if (this.job.equalsIgnoreCase("fired") || this.job.equalsIgnoreCase("dismissed")
        || this.job.equalsIgnoreCase("sacked")){
      System.out.println("Name: " + this.name + ", Surname: " +  this.surname + ", age: " + this.age + "job post: " + this.job + ", work experience: "
          + this.workTime + ", residence: " + this.residence + ", phone number: " + this.phoneNumber);
    }
    System.out.println("Name: " + this.name + ", Surname: " +  this.surname + ", age: " + this.age + "job post: " + this.job + ", work experience: "
        + this.workTime + ", salary: " + this.salary +  ", residence: " + this.residence + ", phone number: " + this.phoneNumber);
  }
}

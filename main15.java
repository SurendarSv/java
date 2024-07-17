import java.util.*;
class Employee{
String firstname;
String lastname;
double salary;

public void Employee(String firstname, String lastname, double salary){
this.firstname = firstname;
this.lastname = lastname;
this.salary = salary;
}

public void setfirstname(String firstname){
this.firstname = firstname;
}
public String getfirstname(){
return firstname;
}

public void setlastname(String lastname){
this.lastname = lastname;
}
public String getlastname(){
return lastname;
}

public void setsalary(double salary){
if(salary > 0){
this.salary = salary;
}
else{
this.salary = 0;
}
}
public double getsalary(){
return salary;
}
}

public class main15{
public static void main(String[] args){
Employee obj1 = new Employee();
Employee obj2 = new Employee();
obj1.setfirstname("Suren");
obj1.setlastname("Kissan");
obj2.setfirstname("Rajesh");
obj2.setlastname("Tej");
obj1.setsalary(67500);
obj2.setsalary(55000);
System.out.println(obj1.getfirstname()+obj1.getlastname()+" 's salary is: "+obj1.getsalary());
System.out.println(obj2.getfirstname()+obj2.getlastname()+" 's salary is: "+obj2.getsalary());
System.out.println("Salary after 10% hike is: ");
obj1.setsalary(67500*1.1);
obj2.setsalary(55000*1.1);
System.out.println(obj1.getfirstname()+obj1.getlastname()+" 's salary is: "+obj1.getsalary());
System.out.println(obj2.getfirstname()+obj2.getlastname()+" 's salary is: "+obj2.getsalary());
}
}
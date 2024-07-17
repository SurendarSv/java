import java.util.*;
class Date{
int month;
int day;
int year;

public void Date(int month, int day, int year){
this.month = month;
this.day = day;
this.year = year;
}

public void setmonth(int month){
this.month = month;
}
public int getmonth(){
return month;
}

public void setday(int day){
this.day = day;
}

public int getday(){
return day;
}

public void setyear(int year){
this.year = year;
}

public int getyear(){
return year;
}

public void displayDate(){
System.out.printf("%d/%d/%d", month,day,year);
}
}

public class main16{
public static void main(String[] args){
Date obj1 = new Date();
obj1.setmonth(7);
obj1.setday(15);
obj1.setyear(2024);
obj1.displayDate();
}
}

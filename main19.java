import java.util.*;
class Car{
int speed;
double regularPrice;
String colour;

public Car(int speed, double regularPrice, String colour){
this.speed = speed;
this.regularPrice = regularPrice;
this.colour = colour;
}

public double getSalesPrice(){
return regularPrice;
}
}

class Truck extends Car{
int weight;
public Truck(int speed, double regularPrice, String colour, int weight){
super(speed, regularPrice, colour);
this.weight = weight;
}
public double getSalesPrice(){
return super.getSalesPrice() * (weight >2000 ? 0.10 : 0.20);
}
}

class Audi extends Car{
int year;
int manufacturerDiscount;
public Audi(int speed, double regularPrice, String colour, int year, int manufacturerDiscount){
super(speed, regularPrice, colour);
this.year=year;
this.manufacturerDiscount=manufacturerDiscount;
}

public double getSalesPrice(){
return super.getSalesPrice() - manufacturerDiscount;
}
}

class Hasbug extends Car{
int length;
public Hasbug(int speed, double regularPrice, String colour, int length){
super(speed, regularPrice, colour);
this.length=length;
}
public double getSalesPrice(){
return super.getSalesPrice() * (length >20 ? 0.5 : 0.10);
}
}

public class main19{
public static void main(String[] args){
Hasbug obj1 = new Hasbug(400,150001,"red",40);
Audi obj2 = new Audi(150,100000,"red",2023,12);
Audi obj3 = new Audi(200,150000,"white",2022,18);
Car obj4 = new Car(200,50000,"Yellow");
System.out.println("Sedan: "+obj1.getSalesPrice());
System.out.println("Ford: "+obj2.getSalesPrice());
System.out.println("Ford: "+obj3.getSalesPrice());
System.out.println("Car: "+obj4.getSalesPrice());
}
}

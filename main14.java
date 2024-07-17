import java.io.*;
class Invoice{
String partnumber;
String partdescription;
int quantity;
double priceperitem;

public void Invoice(String partnumber, String partdescription, int quantity, double priceperitem){
this.partnumber = partnumber;
this.partdescription = partdescription;
this.quantity = quantity;
this.priceperitem = priceperitem;
}

public void setpartnumber(String partnumber){
this.partnumber = partnumber;
}
public String getpartnumber(){
return partnumber;
}

public void setpartdescription(String partdescription){
this.partdescription = partdescription;
}
public String getpartdescription(){
return partdescription;
}

public void setquantity(int quantity){
if(quantity > 0){
this.quantity = quantity;
}
else{
this.quantity = 0;
}
}
public int getquantity(){
return quantity;
}

public void setpriceperitem(double priceperitem){
if(priceperitem > 0){
this.priceperitem = priceperitem;
}
else{
this.priceperitem = 0.0;
}
}
public double getpriceperitem(){
return priceperitem;
}

public double getInvoiceAmount(){
return priceperitem*quantity;
}
}

public class main14{
public static void main(String[] args){
Invoice obj1 = new Invoice();
obj1.setpartnumber("249");
System.out.println("Part number is: "+obj1.getpartnumber());
obj1.setpartdescription("suren");
System.out.println("Part description is: "+obj1.getpartdescription());
obj1.setquantity(30);
System.out.println("The quantity is: "+obj1.getquantity());
obj1.setpriceperitem(19000.00);
System.out.println("The priceper item is: "+obj1.getpriceperitem());
System.out.println("The amount is: "+obj1.getInvoiceAmount());
}
}

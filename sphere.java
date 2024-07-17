import java.util.Scanner;
class sphere{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
double num1=s.nextDouble();
System.out.println(volume(num1));
}
static double volume(double v){
return (4*Math.PI*v*v*v)/3;
}
}



	
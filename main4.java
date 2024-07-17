import java.util.Scanner;
class main4{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int num1=s.nextInt();
int num2=s.nextInt();
int sum= num1+num2;
int diff= num1-num2;
int prod= num1*num2;
int quot= num1/num2;
System.out.println("sum "+sum);
System.out.println("diff "+diff);
System.out.println("prod "+prod);
System.out.println("quot "+quot);
}
}
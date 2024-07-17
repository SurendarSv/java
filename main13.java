import java.util.*;
public class main13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Account user1 = new Account();
user1.balance=15000;
user1.debit(6500);
}
}
class Account{
int balance;
public void debit(int amount){
if(amount>balance){
System.out.println("Debit amount exceeded your account balance.. your available balance is: "+balance);
}
else{
balance=balance-amount;
System.out.println("Your available balance is: "+balance);
}
}
}
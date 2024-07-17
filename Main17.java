import java.util.*;
class SavingsAccount{
static double annual_interest;
private double savings_balance;

public SavingsAccount(){
annual_interest=0.0;
savings_balance=0.0;
}

public void SavingsAccount(double annual_interest, double savings_balance){
this.annual_interest = annual_interest;
this.savings_balance = savings_balance;
}

public double calculateMonthlyInterest(){
double monInt = (savings_balance * annual_interest)/12;
savings_balance = savings_balance + monInt;
return monInt;
}

public static void modifyInterestRate(double newInterestRate){
annual_interest = newInterestRate;
}

public void setsavings_balance(double savings_balance){
this.savings_balance = savings_balance;
}

public double getsavings_balance(){
return savings_balance;
}

public double getannual_interest(){
return annual_interest;
}
}

public class Main17{
public static void main(String[] args){
SavingsAccount obj1 = new SavingsAccount();
SavingsAccount obj2 = new SavingsAccount();
obj1.setsavings_balance(2000);
obj2.setsavings_balance(3000);
SavingsAccount.modifyInterestRate(0.05);
obj1.calculateMonthlyInterest();
obj2.calculateMonthlyInterest();
System.out.println("New balance for user1 at 5% interest: "+obj1.getsavings_balance());
System.out.println("New balance for user2 at 5% interest: "+obj2.getsavings_balance());

obj1.setsavings_balance(2000);
obj2.setsavings_balance(3000);
SavingsAccount.modifyInterestRate(0.04);
obj1.calculateMonthlyInterest();
obj2.calculateMonthlyInterest();
System.out.println("New balance for user1 at 4% interest: "+obj1.getsavings_balance());
System.out.println("New balance for user2 at 4% interest: "+obj2.getsavings_balance());
}
}



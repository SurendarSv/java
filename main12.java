import java.text.DecimalFormat;
import java.util.*;
public class main12{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double[] average_grades = new double[20];
int count = 0;
for (int i = 0; i < 20; i++) {
            double input = sc.nextDouble();
            if (input == -1) {
                break;
            }
            average_grades[count] = input;
            count++;
        }
System.out.print("Entered grades are: ");
for(int i=0;i<count;i++){
System.out.print(average_grades[i]+" ");
}
double average = Average(average_grades,count);
DecimalFormat df = new DecimalFormat("#.##");
String formattedAverage = df.format(average);
System.out.println("\n Average: " + formattedAverage);
}

public static double Average(double[] average_grades, int count){
double average=0;
double sum=0;
for(int i=0;i<average_grades.length;i++){
sum+=average_grades[i];
}
average+=sum/count;
return average;
}
}



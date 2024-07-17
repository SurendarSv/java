import java.util.Scanner;
class sales{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int num1=s.nextInt();
int[] a=new int[num1];
a[0]=s.nextInt();
int max=a[0];
for(int counter=1;counter<num1;counter++){
a[counter]=s.nextInt();
if(a[counter]>max)
max=a[counter];
}
System.out.println(max);

}
}
	
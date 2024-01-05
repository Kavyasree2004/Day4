import java.io.*;
import java.util.Scanner;
class Addition{
public static void main(String args[]){
int sum=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("num1 = "+x);
System.out.println("num2 = "+y);
sum=x+y;
System.out.println("The sum = "+sum);
System.out.println(x+" + "+y+" = "+sum);
}
}
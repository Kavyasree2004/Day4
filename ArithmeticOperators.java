import java.io.*;
import java.util.Scanner;
public class ArithmeticOperators{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
double x=sc.nextDouble();
System.out.println("Enter the second number");
double y=sc.nextDouble();
double sum=x+y;
double diff=x-y;
double mul=x*y;
double div=x/y;
double mod=x%y;
System.out.println(x+" + "+y+" = "+sum);
System.out.println(x+" - "+y+" = "+diff);
System.out.println(x+" * "+y+" = "+mul);
System.out.println(x+" / "+y+" = "+div);
System.out.println(x+" % "+y+" = "+mod);
}

}
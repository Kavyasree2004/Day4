import java.io.*;
import java.util.Scanner;
class Multiplication{
public static void main(String args[]){
int mul=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("num1 = "+x);
System.out.println("num2 = "+y);
mul=x*y;
System.out.println("The mul = "+mul);
System.out.println(x+" * "+y+" = "+mul);
}
}
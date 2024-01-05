import java.io.*;
import java.util.Scanner;
class Subtraction{
public static void main(String args[]){
int sub=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("num1 = "+x);
System.out.println("num2 = "+y);
sub=x-y;
System.out.println("The sub = "+sub);
System.out.println(x+" - "+y+" = "+sub);
}
}
import java.io.*;
import java.util.Scanner;
class Division{
public static void main(String args[]){
int div=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("num1 = "+x);
System.out.println("num2 = "+y);
div=x/y;
System.out.println("The div = "+div);
System.out.println(x+" / "+y+" = "+div);
}
}
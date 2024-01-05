import java.io.*;
import java.util.Scanner;
class Modulo{
public static void main(String args[]){
int mod=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("num1 = "+x);
System.out.println("num2 = "+y);
mod=x%y;
System.out.println("The Modulo = "+mod);
System.out.println(x+" % "+y+" = "+mod);
}
}
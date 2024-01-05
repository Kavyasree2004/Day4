/* Differences

INPUT
2
3
OUTPUT
1

INPUT
2
4
OUTPUT
2

INPUT
5
3
OUTPUT
2

INPUT
5
0
OUTPUT
5
*/


import java.io.*;
import java.util.Scanner;
public class Difference{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int diff=0;
if(x>y)
diff=x-y;
else
diff=y-x;
System.out.println(diff);
}
}

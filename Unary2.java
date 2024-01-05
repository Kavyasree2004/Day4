//Unary Increment ++

class Unary2{
public static void main(String args[]){
int i=10;
int a=i++;
System.out.println("a="+a);  //prints 10
System.out.println(i);  //prints 11
++i;
System.out.println(i); //prints 12
System.out.println(++i); //prints 13
System.out.println(i++); //prints 13
System.out.println(i); //prints 14
int j=10;
int b=++j;
System.out.println("b="+b);  //prints 11
}
}


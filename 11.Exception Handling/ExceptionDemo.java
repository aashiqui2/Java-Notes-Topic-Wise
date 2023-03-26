import java.util.*;
class ExceptionDemo
{
public static void main(String[] args)
{
ExceptionDemo ed=new ExceptionDemo();
ed.divide();
//ed.add();
}

private void add()
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();//5
int b=sc.nextInt();//0
int c=a+b;
System.out.println("Addition Results "+c);
}
private void divide()
{
Scanner sc=new Scanner(System.in);

try
{
int a=sc.nextInt();//5
int b=sc.nextInt();//0
int c=a/b;
System.out.println("Divition Result "+c);
}
catch(ArithmeticException ae){
System.out.println("no2 is zero.Please check the no2 value");
divide();
}
catch(InputMismatchException ime)
{
System.out.println("Please enter only numbers");
divide();
}
catch(Exception e)
{
System.out.println("Unknown reasons");
}
finally{
System.out.println("Finally Block");
}
add();

}
}
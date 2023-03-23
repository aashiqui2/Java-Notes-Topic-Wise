class School
{
static String name="aashiqui"; 
private int salary=20000;

void admit()//Method
{
System.out.println("admitted");
}
 
private void salary()//Method
{
private int pf=2.5f;
System.out.println("salary is "+salary);
}

public static void main(String args[])
{
School schoolObj=new School();
schoolObj.salary();
}
}
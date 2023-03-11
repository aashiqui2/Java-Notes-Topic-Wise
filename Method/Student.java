class Student
{
void display()//Method
{
System.out.println(School.name);//Calling static variable from another class(School.java)
}
public static void main(String[] args)
{

School schoolObj=new School();//Object is created for School class 
schoolObj.admit();
schoolObj.salary();
//System.out.println(schoolObj.salary);//Calling non-static variable using object of the class

//Object is created for Student class 
Student studentobj=new Student();
studentobj.display();

}

}
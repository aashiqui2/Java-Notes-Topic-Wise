public class SoftwareEngineer extends Parent3 implements OfficeRules,TrafficRules
{
public static void main(String[] args)
{
SoftwareEngineer se=new SoftwareEngineer();
TrafficRules police=new SoftwareEngineer();
OfficeRules office=new SoftwareEngineer();
office.get_salary();
//office.chat();//cannot error
police.go_slow();
police.keep_left();
se.apply_leave();
se.chat();
System.out.println(se.min_salary);
System.out.println(se.no_of_leave);
//se.no_of_leave=20;
System.out.println(SoftwareEngineer.no_of_leave);
}
public void apply_leave()
{
System.out.println("Apply leave");
}
public void work_8_hours(){
System.out.println("work 8 hours");
}
public void wear_formals()
{
System.out.println("Wear Forlmals");
}
public void get_salary()
{
System.out.println("Get Salary");
}
public void take_break()
{
System.out.println("leisure time");
}
public void chat()
{
System.out.println("chatting with peoples");
}
public void go_slow()
{
System.out.println("Over Speed");
}
public void keep_left()
{
System.out.println("wrong side");
}
public void study()
{
}

}
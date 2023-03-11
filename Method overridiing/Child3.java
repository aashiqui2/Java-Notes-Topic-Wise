public class Child3 extends Parent3
{
public static void main(String[] args)
{
Child3 child=new Child3();//object
/*child.play();
child.study();
child.work();
child.do_java_program();*/

Parent3 parent=new Child3();//Dynmaic binding:
parent.play();
parent.study();
parent.work();
parent.do_java_program();
}
public void play()
{
System.out.println("Playing");
}
public void study()
{
System.out.println("Studying");
}
void do_java_program()
{
System.out.println("doing java program");
}
}
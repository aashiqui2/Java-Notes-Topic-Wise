interface OfficeRules{
int no_of_leave=10;
int min_salary=20000;
void work_8_hours();
void wear_formals();
void get_salary();
void apply_leave();//abstarct
//by default methods in interface are abstract
//by default methods in interface are public
//by default all variables are final
//private access modifier is not alowed in interface
//a methods cannot be both abstract and final 
//we can access any variable with classname 
//by default variables in interface are final and static
}
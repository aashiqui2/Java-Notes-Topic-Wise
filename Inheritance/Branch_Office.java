package tamilnadu.erode;
import tamilnadu.chennai.Office;

public class Branch_Office extends Office {
int salary=20000;
    public static void main(String[] args) {
       Branch_Office objBranch_Office=new Branch_Office();
       objBranch_Office.celebrate_local_function(); 
       //objBranch_Office.get_travel_allowance();
       objBranch_Office.do_business_plans();
       objBranch_Office.work();
       objBranch_Office.recruit();
       objBranch_Office.wtf();
       System.out.println(objBranch_Office.salary);
      // Office objBranch_Office2=new Office();
       //System.out.println(objBranch_Office2.salary);
    }
    public void celebrate_local_function(){
      System.out.println(super.salary);
        System.out.println("Celebrating");
    }
    
}

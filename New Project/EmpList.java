import java.io.*;
public class EmpList{
public static void main(String args[]){
Emp empOne=new Emp("Saranya");
Emp empTwo=new Emp("Suganya");
Emp empThree=new Emp("Saravanan");
System.out.println("First Employee:");
empOne.no(111);
empOne.age(26);
empOne.sal(54000);
empOne.employee();
System.out.println("Second Employee:");
empTwo.no(112);
empTwo.age(23);
empTwo.sal(25000);
empTwo.employee();
System.out.println("Third Employee:");
empThree.no(113);
empThree.age(20);
empThree.sal(15000);
empThree.employee();}
}
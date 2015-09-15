import java.io.*;
public class Emp{
int eid;
String ename;
int eage;
float esal;
public Emp(String name){
this.ename=name;
}
public void no(int no){
eid=no;
}
public void age(int age){
eage=age;
}
public void sal(float sal){
esal=sal;
}
public void employee(){
System.out.println("EmpId: "+eid);
System.out.println("EmpName: "+ename);
System.out.println("EmpAge: "+eage);
System.out.println("EmpSal: "+esal+"\n");
}
}

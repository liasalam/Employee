/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;
public class EmployeeTest {
 public static void main (String[] args){
 
Employee employee1= new employee ("naz", "john",2000.00);
Employee employee2 = new employee ("lyn","john",400000);

 }
 System.out.println(employee1.getfirstname() +""+employee1.getlastname()+"\t\t"+employee1.getyearlysalaey());
 
 System.out.println(employee2.getfirstname() +""+employee2.getlastname()+"\t\t"+employee2.getyearlysalaey());
 
 employee1.applyRasie(10);
  employee2.applyRasie(10);
 
  system.outprintln("\n10 percent salary rised!!");
  system.out.println("name\t\t\tyearlysalary");
  system.our.print("**********************");
 

         
}

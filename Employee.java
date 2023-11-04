/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;
public class Employee {

private String firstname;
private String lastname;
private double monthlysalary;

    public Employee(String firstname, String lastname, double monthlysalary) {
        this.firstname = firstname;
        this.lastname = lastname;
       if (monthlysalary > 0){
           monthlysalary = monthlysalary;
       } else {
           this.monthlysalary=0;
       }
    }
     public void setEmployeeinfo ( String firstname, String lastname, double monthlysalary ){
    this.firstname = firstname;
    this.lastname = lastname; 
    if(monthlysalary > 0){
         monthlysalary = monthlysalary;
    } else { 
        this.monthlysalary=0;
        // defalut to 0 if salary is note positive 
    }
                
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getMonthlysalary() {
        return monthlysalary;
    }
    
     public double getyearlysalary(){
         return monthlysalary * 12;
     }
     
     }
















}

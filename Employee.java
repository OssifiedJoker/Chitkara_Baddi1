import java.io.*;
public class Employee
{
   String name,designation;
   int age;
   double salary;
   public Employee(String name)
   {
     this.name=name;
     }
   public void empAge(int empA)
   {
     age=empA;
   }
   public void empDesignation(String empDesig)
   {
     designation=empDesig;
   }
   public void empSalary(double empSal)
   {
     salary=empSal;
   }
   public void print()
   {
     System.out.println("Name: "+name);
     System.out.println("Age: "+age);
     System.out.println("Designation :"+designation);
     System.out.println("Salary: "+salary);
   }
}
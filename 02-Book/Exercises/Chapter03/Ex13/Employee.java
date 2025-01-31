/*
 * File name: Employee.java
 *
 * Subject: A class that presents an employee.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [10:55 AM]
 *
 * */


public class Employee // class declaration.
{
    // instance variables.
    private String fName;
    private String lName;
    private double salary;
    
    // 3-arguments constructor.
    public Employee(String fName, String lName, double salary)
    {
        this.fName = fName;
        this.lName = lName;

        if(salary > 0.0)
	       	this.salary = salary;
    }
    
    // setters, mutators: which edit the values of instance variables.
    public void setFirstName(String fName) { this.fName = fName; } 
    public void setLastName(String lName)  { this.lName = lName; }
    public void setSalary(double salary)   { if(salary > 0.0) this.salary = salary; }
    
    // getters, accessor: which access the instance variables and take copies of their values.
    public String getFirstName(){ return fName; }
    public String getLastName() { return lName; }
    public double getSalary()   { return salary; } 

    // give the emplyee a raise.
    public void giveARaise(double percentage)
    {
	if(percentage <= 0)
		System.out.println("Invalid percent.");

	if(percentage > 100)
		System.out.println("Invalid percent.");

	if(percentage < 100)
		if(percentage > 0)
       		     salary += salary * (percentage / 100.0);
    }
}


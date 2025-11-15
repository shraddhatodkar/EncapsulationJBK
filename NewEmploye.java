package com.sjt.Encapsulation;

import java.util.Scanner;

public class NewEmploye {
    Scanner sc=new Scanner(System.in);
    
    private String first_name;
	private String last_name;
	private int id;
	private String position;
	private int basic_salary;
	int DA,TRA,HRA,PF,PT;
	float gross_salary,net_salary;
	
	
	//setter method
	public void setfirst_name(String f) {
		first_name=f;
	}
	public void setlast_name(String l) {
		last_name=l;
	}
	public void setid(int i) {
		id=i;
	}
	public void setposition(String p) {
		position=p;
	}
	public void setsalary(int s) {
		basic_salary=s;
	}
	
	//getter method
	public String getfirst_name() {
		return first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public int getid() {
		return id;
	}
	public String getposition() {
		return position;
	}
	public int getbasic_salary() {
		return basic_salary;
	}
	
	
	public void acceptDetails()
	  {
		  System.out.println("Enter the first_name:");
		  first_name=sc.nextLine();
		  
		  System.out.println("Enter the last_name:");
		  last_name=sc.nextLine();
		  
		  System.out.println("Enter the id:");
		  id=sc.nextInt();
		  sc.nextLine(); 
		  
		  System.out.println("Enter the position:");
		  position=sc.nextLine();
		  
		  System.out.println("Enter the salary:");
		  basic_salary=sc.nextInt();
	  }
	
	public void calculateSalary() 
	{
        DA = (basic_salary * 10) / 100;
        TRA = (basic_salary * 5) / 100;
        HRA = (basic_salary * 15) / 100;
        PF = (basic_salary * 12) / 100;
        PT = (basic_salary * 10) / 100;
        gross_salary = basic_salary + DA + TRA + HRA;
        net_salary = gross_salary - (PF + PT);
    }
	
	public void showDetails() {
		System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
        System.out.println("ID: " + id);
        System.out.println("Position: " + position);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("DA: " + DA);
        System.out.println("TRA: " + TRA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("PT: " + PT);

        System.out.println("Gross Salary: " + gross_salary);
        System.out.println("Net Salary: " + net_salary);
	}
}

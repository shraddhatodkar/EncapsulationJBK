package com.sjt.Encapsulation;

import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);

		private String first_name;
		private String last_name;
		private int id;
		private String position;
		private Double salary;
		
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
		public void setsalary(Double s) {
			salary=s;
		}
		
		
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
		public Double getsalary() {
			return salary;
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
	  salary=sc.nextDouble();
  }
  
  
  public void showDetails()
{
	    System.out.println("\n---------Show Details of Employee---------");
		System.out.println("Employee first_name:"   +getfirst_name());
		System.out.println("Employee last_name:"    +getlast_name());
		System.out.println("Employee id:"           +getid());
		System.out.println("Employee position:"     +getposition());
		System.out.println("Employee salary:"       +getsalary());
		
   }
	
}

package com.sjt.Encapsulation;

import java.util.Scanner;

public class Student {

	Scanner sc=new Scanner(System.in);
	private String first_name;
	private String last_name;
	private String course;
	int id;
	int total_marks;
	
	public void setfirst_name(String f) {
		first_name=f;
	}
	public void setlast_name(String l) {
		last_name=l;
	}
	public void setcourse(String c) {
		course=c;
	}
	public void setid(int i) {
		id=i;
	}
	public void settotal_marks(int tm) {
		total_marks=tm;
	}
	
	
	public String getfirst_name() {
		return first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public String getcourse() {
		return course;
	}
	public int getid() {
		return id;
	}
	public int gettotal_marks() {
		return total_marks;
	}
	
	
	public void acceptDetails() {
		System.out.println("Enter the first_name of student:");
		first_name=sc.nextLine();
		
		System.out.println("Enter the last_name of student:");
		last_name=sc.nextLine();
		
		System.out.println("Enter the name of the course:");
		course=sc.nextLine();
		
	    System.out.println("Enter the id of student:");
	    id=sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println("Enter the total marks of current semester:");
	    total_marks=sc.nextInt();
	}
	public void showDetails() 
	{
		System.out.println("\n---------Show Details of Student----------");
		System.out.println("Student first_name:"         +getfirst_name());
		System.out.println("Student last_name:"          +getlast_name());
		System.out.println("Course of student:"          +getcourse());
		System.out.println("Id of student:"              +getid());
		System.out.println("total_marks of student:"     +gettotal_marks());
	}
	
}

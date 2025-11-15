package com.sjt.Encapsulation;

import java.util.Scanner;

public class Laptop {
   Scanner sc=new Scanner(System.in);
   
   private String laptop_name;
   private String storage;
   private String intel;
   private String operating_system;
   
   public void setlaptop_name(String l) {
	   laptop_name=l;
   }
   public void setstorage(String s) {
	   storage=s;
   }
   public void setintel(String i) {
	   intel=i;
   }
   public void setoperating_system(String os) {
	   operating_system=os;
   }
  
   
   public String getlaptop_name() {
	   return laptop_name;
   }
   public String getstorage() {
	   return storage;
   }
   public String getintel() {
	   return intel;
   }
   public String getoperating_system() {
	   return operating_system;
   }
   
   
   public void acceptDetails() {
	System.out.println("Enter the name of laptop model:");
	laptop_name=sc.nextLine();
	
	System.out.println("Enter the storage space of laptop:");
	storage=sc.nextLine();
	
	System.out.println("Enter the intel:");
	intel=sc.nextLine();
	
	System.out.println("Enter the opearting_system name:");
	operating_system=sc.nextLine();
   }
   
   public void showDetails() {
	   System.out.println("\n---------Show Details of Laptop---------");
	   System.out.println("Laptop_name :"        +getlaptop_name());
	   System.out.println("Storage :"            +getstorage());
	   System.out.println("Intel :"              +getintel());
	   System.out.println("Opearting system :"   +getoperating_system());
   }
}

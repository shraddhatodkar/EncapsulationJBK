package com.sjt.Encapsulation;

import java.util.Scanner;

public class CellPhone {
     Scanner sc=new Scanner(System.in);
     
     private String display;
     private String opearting_system;
     private String camera_system;
     private String storage;
     private String connectivity;
     
     public void setdisplay(String d) {
    	 display=d;
     }
     public void setopearting_system(String os) {
    	 opearting_system=os;
     }
     public void setcamera_system(String cs) {
    	 camera_system=cs;
     }
     public void setstorage(String st) {
    	 storage=st;
     }
     public void setconnectivity(String cn) {
    	 connectivity=cn;
     }
     
     
     public String getdisplay() {
    	 return display;
     }
     public String getopearting_system() {
    	 return opearting_system;
     }
     public String getcamera_system() {
    	 return camera_system;
     }
     public String getstorage() {
    	 return storage;
     }
     public String getconnectivity() {
    	 return connectivity;
     }
     
     
     public void acceptDetials() {
    	 System.out.println("Enter the display of cellphone:");
    	 display=sc.nextLine();
    	 
    	 System.out.println("Enter the operating_system:");
    	 opearting_system=sc.nextLine();
    	 
    	 System.out.println("Enter the camera_system:");
    	 camera_system=sc.nextLine();
    	 
    	 System.out.println("Enter the storage:");
    	 storage=sc.nextLine();
    	 
    	 System.out.println("Enter the connectivity of cellphone:");
    	 connectivity=sc.nextLine();
     }
     
     
     public void showDetails() {
    	 System.out.println("\n---------Show Details of the cell phone--------");
    	 System.out.println("Display:"           +getdisplay());
    	 System.out.println("Opearting_System:"  +getopearting_system());
    	 System.out.println("Camera_system:"     +getcamera_system());
    	 System.out.println("Storage:"           +getstorage());
    	 System.out.println("Connectivity:"      +getconnectivity());
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}

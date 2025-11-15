package com.sjt.Encapsulation;

import java.util.Scanner;

public class Chair {
   Scanner sc=new Scanner(System.in);
   
   private String size;
   private String color;
   private int prize;
   private int weight;
   
   public void setsize(String s) {
	   size=s;
   }
   public void setcolor(String c) {
	   color=c;
   }
   public void setprize(int p) {
	   prize=p;
   }
   public void setweight(int w) {
	   weight=w;
   }
   
   
   public String getsize() {
	   return size;
   }
   public String getcolor() {
	   return color;
   }
   public int getprize() {
	   return prize;
   }
   public int getweight() {
	   return weight;
   }
   
   
   public void acceptDetails() {
	   System.out.println("Enter the size of chair:");
	   size=sc.nextLine();
	   
	   System.out.println("Enter the color of chair:");
	   color=sc.nextLine();
	   
	   System.out.println("Enter the prize of chair:");
	   prize=sc.nextInt();
	   sc.nextLine();
	   
	   System.out.println("Enter the weight of chair:");
	   weight=sc.nextInt();
   }
   
   
   public void showDetails() {
	   System.out.println("\n--------Show the details of the chiar---------");
	   System.out.println("Size:"        +getsize());
	   System.out.println("Color:"       +getcolor());
	   System.out.println("Prize:"       +getprize());
	   System.out.println("Weight:"      +getweight());
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}

package com.java.Day6;

 class Employee {
	protected float salary=40000;  
	protected int id=23;
	protected String address="bangalore";
 }  
 class Programmer extends Employee{  
  int bonus=10000;  
  
  
  public static void main(String args[]){  
    Programmer p=new Programmer();  
    System.out.println("Programmer salary is:"+p.salary);  
    System.out.println("bonus of Programmer is:"+p.bonus);  
    System.out.println("id of Programmer is:"+p.id);  
    System.out.println("address of Programmer is:"+p.address);  
 }  
 }  



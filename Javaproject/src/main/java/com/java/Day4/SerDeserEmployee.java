package com.java.Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;


class Employee implements Serializable{
	int id;
	String firstName;
	String lastName;
	double salary;
	public Employee(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
}
public class SerDeserEmployee {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	Employee e1=new Employee(1, "abhisek", "sarangi", 12220);
	Employee e2=new Employee(2, "Gulabi", "chacha", 122320);
	Employee e3=new Employee(3, "haseena", "dilruba", 125620);
	Employee e4=new Employee(4, "champa", "miller", 127820);
	Employee e5=new Employee(5, "david", "sarangi", 1224420);
	Employee e6=new Employee(6, "david", "warner", 1278920);
	Employee e7=new Employee(7, "sunil", "sheikh", 156920);
	Employee e8=new Employee(8, "babu", "atrangi", 1893220);
	Employee e9=new Employee(9, "millind", "Gaba", 189830);
	Employee e10=new Employee(10, "diamond", "square", 123430);
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e1);
	oos.writeObject(e2);
	oos.writeObject(e3);
	oos.writeObject(e4);
	oos.writeObject(e5);
	oos.writeObject(e6);
	oos.writeObject(e7);
	oos.writeObject(e8);
	oos.writeObject(e9);
	oos.writeObject(e10);
	System.out.println("success");
	oos.close();
	fos.close();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt");
	 ObjectInputStream ois = new ObjectInputStream(fis);
	 Employee E1=(Employee)ois.readObject();
	 	int id = E1.id;
		String firstName = E1.firstName;
		String lastName = E1.lastName;
		double salary = E1.salary;
		System.out.println("id  " + id);
		System.out.println("Name is "+ firstName);
		System.out.println("Name is "+ lastName);
		System.out.println("Salary is"+ salary);
		
		Employee E2=(Employee)ois.readObject();
		int id1 = E2.id;
		String firstName1 = E2.firstName;
		String lastName1 = E2.lastName;
		double salary1 = E2.salary;
		System.out.println("id  " + id1);
		System.out.println("Name is "+ firstName1);
		System.out.println("Name is "+ lastName1);
		System.out.println("Salary is"+ salary1);
		
		Employee E3=(Employee)ois.readObject();
		int id2 = E3.id;
		String firstName2 = E3.firstName;
		String lastName2 = E3.lastName;
		double salary2 = E3.salary;
		System.out.println("id  " + id2);
		System.out.println("Name is "+ firstName2);
		System.out.println("Name is "+ lastName2);
		System.out.println("Salary is"+ salary2);
		
		Employee E4=(Employee)ois.readObject();
		int id3 = E4.id;
		String firstName3 = E4.firstName;
		String lastName3 = E4.lastName;
		double salary3 = E4.salary;
		System.out.println("id  " + id3);
		System.out.println("Name is "+ firstName3);
		System.out.println("Name is "+ lastName3);
		System.out.println("Salary is"+ salary3);
		
		Employee E5=(Employee)ois.readObject();
		int id4 = E5.id;
		String firstName4 = E5.firstName;
		String lastName4 = E5.lastName;
		double salary4 = E1.salary;
		System.out.println("id  " + id4);
		System.out.println("Name is "+ firstName4);
		System.out.println("Name is "+ lastName4);
		System.out.println("Salary is"+ salary4);
		
		Employee E6=(Employee)ois.readObject();
		int id5 = E6.id;
		String firstName5 = E6.firstName;
		String lastName5 = E6.lastName;
		double salary5 = E6.salary;
		System.out.println("id  " + id5);
		System.out.println("Name is "+ firstName5);
		System.out.println("Name is "+ lastName5);
		System.out.println("Salary is"+ salary5);
		
		Employee E7=(Employee)ois.readObject();
		int id6 = E7.id;
		String firstName6 = E7.firstName;
		String lastName6 = E7.lastName;
		double salary6 = E7.salary;
		System.out.println("id  " + id6);
		System.out.println("Name is "+ firstName6);
		System.out.println("Name is "+ lastName6);
		System.out.println("Salary is"+ salary6);
		
		Employee E8=(Employee)ois.readObject();
		int id7 = E8.id;
		String firstName7 = E8.firstName;
		String lastName7 = E8.lastName;
		double salary7 = E8.salary;
		System.out.println("id  " + id7);
		System.out.println("Name is "+ firstName7);
		System.out.println("Name is "+ lastName7);
		System.out.println("Salary is"+ salary7);
		
		Employee E9=(Employee)ois.readObject();
		int id8 = E9.id;
		String firstName8 = E9.firstName;
		String lastName8= E9.lastName;
		double salary8 = E9.salary;
		System.out.println("id  " + id8);
		System.out.println("Name is "+ firstName8);
		System.out.println("Name is "+ lastName8);
		System.out.println("Salary is"+ salary8);
		
		Employee E10=(Employee)ois.readObject();
		int id9 = E10.id;
		String firstName9 = E10.firstName;
		String lastName9 = E10.lastName;
		double salary9 = E10.salary;
		System.out.println("id  " + id9);
		System.out.println("Name is "+ firstName9);
		System.out.println("Name is "+ lastName9);
		System.out.println("Salary is"+ salary9);
		
	
	
	FileOutputStream file2 = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\output.txt");
	String str = "";
	
	String text = id + " " + firstName + " " + lastName + " " + salary; 
	Path fileName = Path.of("C:\\Users\\abhiseks\\Desktop\\Sample\\Output.txt");
	Files.writeString(fileName,text); 
	String file_reader = Files.readString(fileName);
	System.out.println(file_reader);
	System.out.println("Data write SuccessFully");
	
}

}


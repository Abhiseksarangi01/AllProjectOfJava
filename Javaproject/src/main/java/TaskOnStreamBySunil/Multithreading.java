package TaskOnStreamBySunil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class  Student{
		String name;
		int rollNo;
		public Student(String name, int rollNo) {
			super();
			this.name = name;
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNo=" + rollNo + "]";
		}
		
	
}

class Threading extends Thread{
	
	Synchronized public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println(" first list");
		}
	}
	
}

class Threading2 extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println(" second list");
		}
	}
	
}

public class Multithreading {
		public static void main(String[] args) {
			List<Student> studentList = new ArrayList<>();
			studentList.add(new Student("avhisek", 23));
			studentList.add(new Student("sunil", 34));
			studentList.add(new Student("susumanthnil", 34));
			studentList.add(new Student("sai", 42));
			studentList.add(new Student("kamesh", 64));
			studentList.add(new Student("harish", 39));
			
			//System.out.println(studentList);
			
			Iterator<Student> itr = studentList.iterator();
			while(itr.hasNext()) {
			System.out.println(itr.next());
			}
			
			Threading t1 = new Threading();
			t1.start();
			
			List<Student> studentList2 = new ArrayList<>();
			studentList2.add(new Student("prophet", 2));
			studentList2.add(new Student("mamata", 22));
			studentList2.add(new Student("manoranjan", 24));
			studentList2.add(new Student("shruti", 31));
			studentList2.add(new Student("isha", 32));
			studentList2.add(new Student("kavita", 52));
			
			//System.out.println(studentList2);
			Iterator<Student> itr2 = studentList2.iterator();
			while(itr2.hasNext()) {
			System.out.println(itr2.next());
			}
			
			Threading2 t2= new Threading2();
			t2.start();

		}
}

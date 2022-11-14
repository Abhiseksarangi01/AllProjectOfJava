package Employ;

import java.util.ArrayList;
import java.util.List;

public class Employ {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private City city;
	private int pinCode;
	private double salary;
	private String gender;
	private String maritalStatus;
	public Employ(int i, String string, String string2, int j, String string3, int k, String string4, String string5,
			String string6) {
		//TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city="
				+ city + ", pinCode=" + pinCode + ", salary=" + salary + ", gender=" + gender + ", maritalStatus="
				+ maritalStatus + ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getAge()=" + getAge() + ", getCity()=" + getCity() + ", getPinCode()="
				+ getPinCode() + ", getSalary()=" + getSalary() + ", getGender()=" + getGender()
				+ ", getMaritalStatus()=" + getMaritalStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public static List<Employ> getAllSaveEmployData(){
		List<Employ> listOfEmployData = new ArrayList<>();
		 listOfEmployData.add(new Employ(1,"abhisek","sarangi",21,"rourkela",769005,"45000","male","single"));
		 listOfEmployData.add(new Employ(2,"sunil","gupta",21,"lucknow",769075,"45090","male","single"));
		 listOfEmployData.add(new Employ(3,"piyush","jaiswal",51,"rourkela",769005,"45400","male","single"));
		 listOfEmployData.add(new Employ(4,"sumanth","talada",21,"bangalore",769505,"45600","male","married"));
		 listOfEmployData.add(new Employ(5,"ganpat","guzzar",25,"rourkela",789005,"45070","male","single"));
		 listOfEmployData.add(new Employ(6,"babu","bhaiya",29,"delhi",769005,"65050","male","married"));
		 listOfEmployData.add(new Employ(7,"guddu","bhaiya",31,"rourkela",969005,"45000","male","married"));
		 listOfEmployData.add(new Employ(8,"choti","chachi",51,"mumbai",789005,"75000","male","single"));
		 listOfEmployData.add(new Employ(9,"katarina","khauff",23,"mysore",769005,"95000","male","married"));
		 listOfEmployData.add(new Employ(10,"priyanka","chawla",28,"kolkata",569005,"46000","male","single"));
		 listOfEmployData.add(new Employ(11,"ghatuthkach","natkhat",31,"assam",769805,"49000","male","married"));
		 listOfEmployData.add(new Employ(12,"balam","pichkari",28,"gangtok",769095,"44000","male","single"));
		 listOfEmployData.add(new Employ(13,"saiyan","jyothi",31,"kerela",739005,"49000","male","bisexual"));
		 listOfEmployData.add(new Employ(14,"khatarnak","nayak",71,"ranchi",769805,"45000","male","married"));
	       return listOfEmployData;
		
	}
	

}

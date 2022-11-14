package Employ;

public class City {

private String name ;
private double temp;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getTemp() {
	return temp;
}
public void setTemp(double temp) {
	this.temp = temp;
}
@Override
public String toString() {
	return "City [name=" + name + ", temp=" + temp + "]";
}



}

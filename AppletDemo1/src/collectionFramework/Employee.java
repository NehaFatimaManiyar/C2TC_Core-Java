package collectionFramework;

public class Employee {
int id;
String n;
double salary;
public Employee() {
	
}
public Employee(int id,String n,double salary) {
	this.id=id;
	this.n=n;
	this.salary=salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getN() {
	return n;
}
public void setN(String n) {
	this.n = n;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public boolean equals(Object o) {
	return true;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", n=" + n + ", salary=" + salary + "]";
}
}

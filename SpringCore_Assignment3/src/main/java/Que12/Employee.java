package Que12;

public class Employee {
private int id;
private String name;
private int Salary;
private String dep;
public Employee(int id, String name, int salary, String dep) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
	this.dep = dep;
}
public Employee() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}	
}

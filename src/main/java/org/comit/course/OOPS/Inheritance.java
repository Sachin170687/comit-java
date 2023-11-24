package org.comit.course.OOPS;

class Person {
	
	String name;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
}

class Employee extends Person{
	
	String position;
	int id;
	double salary;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [position=%s, id=%s, salary=%s, name=%s, age=%s]", position, id, salary, name,
				age);
	}
	
	
}
class Customer extends Person{}
class Accountant extends Employee{}
public class Inheritance {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Customer cus1=new Customer();
		Accountant acc1=new Accountant();
		emp1.setName("Sachin");
		emp1.setAge(30);
		emp1.setId(1);
		emp1.setPosition("Manager");
		emp1.setSalary(3000);
		cus1.setName("Oshin");
		cus1.setAge(25);
		acc1.setName("Mike");
		acc1.setAge(32);
		acc1.setId(1);
		acc1.setPosition("Manager");
		acc1.setSalary(3000);
		System.out.println(emp1);
		System.out.println(cus1);
		System.out.println(acc1);
	}

}

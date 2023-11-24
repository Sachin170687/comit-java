package org.comit.course.OOPS;

class Parent1{
	
	String name;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Parent1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Parent1 [name=%s, age=%s]", name, age);
	}
	
	

}



 class Child1 extends Parent1{

	Child1(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		return String.format("Child1 [name=%s, age=%s]", name, age);
	}
	
	
 }



public class Constructor {

	public static void main(String[] args) {
		
		
		Child1 obj1= new Child1("Sachin",30);
		System.out.println(obj1);
	}

}

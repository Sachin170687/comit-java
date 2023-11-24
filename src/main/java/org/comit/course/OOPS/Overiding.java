package org.comit.course.OOPS;


class Parent{
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Parent [name=%s, age=%s]", name, age);
	}
	
}

class Child extends Parent{}


public class Overiding {

	public static void main(String[] args) {
		
		Child obj1 = new Child();
		obj1.setName("Sachin");
		obj1.setAge(30);
		
		System.out.println(obj1);

	}

}

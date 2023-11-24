package org.comit.course.OOPS;


class Myclass{
	
	String name;
	int age;
	
	// overloading on constructor.
	
	
	
	Myclass() {
	
	}
	
	Myclass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	Myclass(int age) {
		
		this.age = age;
	}
	
	Myclass(String name) {
		this.name = name;
		
	}
	
	Myclass(int age,String name) {
		this.name = name;
		this.age = age;
	}
	
	
	// Method Overloading
	
	String concat(String name,int age) {
		return name+" "+age;
	}
	
	String concat(String name) {
		return "Hello"+" "+name;
	}
	String concat(int age,String name) {
		return name+" "+age;
	}
	
	int add(int a , int b) {
		return a+b;
	}
	int add(int a , int b,int c) {
		return a+b+c;
	}

	@Override
	public String toString() {
		return String.format("Myclass [name=%s, age=%s]", name, age);
	}
	

}



public class Overloading {

	public static void main(String[] args) {
		
		
		Myclass obj1 = new Myclass();
		Myclass obj2 = new Myclass("Sachin");
		Myclass obj3 = new Myclass("Sachin",30);
		Myclass obj4 = new Myclass(30,"Sachin");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		
		System.out.println(obj1.concat("Sachin"));
		System.out.println(obj1.concat("Sachin",30));
		System.out.println(obj1.concat(30,"Sachin"));
		System.out.println(obj1.add(10,20));
		System.out.println(obj1.add(10,20,30));
		System.out.println(obj3.concat("Sach"));
	}

}

package org.comit.course.Finalkeyword;

/*
 final class Parent1 {}

class Child1 extends Parent1{} 

*/

/*
class Parent2{
	
	final void display() {
		System.out.println("Sachin");
	}
}

class Child2 extends Parent2{
	
	@Override
	void display() {
		System.out.println("Sachin");
	}
}

*/

class Parent3 {
	
	final String name1 ="Parent Class";
	static final String name2 ="Parent Class without object";
	
	void display() {
		String name1 ="Sub Class";
		
		System.out.println(name1);
	}
}
	
	
	


class Child3 extends Parent3 {
	String name ="Sub Class";
	
	
}


public class Finalkeyword {

	public static void main(String[] args) {
		
		Parent3 obj1=new Parent3();
		Child3 obj2=new Child3();
		
		System.out.println(obj1.name1);
		System.out.println(Parent3.name2);
		obj1.display();
		
	}

}

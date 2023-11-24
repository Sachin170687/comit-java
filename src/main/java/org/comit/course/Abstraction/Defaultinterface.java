package org.comit.course.Abstraction;


interface features{
	
	void feature1();
	
	default void feature2() {
		System.out.println("Additional Features 1");
	}
	
	static void feature3() {	
		System.out.println("Additional Features 2");
	}
}



class Featuredetails implements features{

	@Override
	public void feature1() {
		System.out.println("Existing Features");	
	}
	
	
}



public class Defaultinterface {

	public static void main(String[] args) {
		
		features product1=new Featuredetails();
		product1.feature1();
		product1.feature2();
		features.feature3();
		

	}

}

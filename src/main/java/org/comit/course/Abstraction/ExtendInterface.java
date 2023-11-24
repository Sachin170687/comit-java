package org.comit.course.Abstraction;


interface Canadatime{
	
	void canadatimedisplay();
}


interface UStime{
	
	void UStimedisplay();
}

interface Worldtime extends Canadatime , UStime{
	
	void Worldtimedisplay();
}


class Time implements Worldtime {

	@Override
	public void canadatimedisplay() {
		System.out.println("Canada Timings");
		
	}

	@Override
	public void UStimedisplay() {
		System.out.println("USA Timings");
		
	}

	@Override
	public void Worldtimedisplay() {
		
		System.out.println("Worldwide Timings");
		
	}
	
	
}




public class ExtendInterface {

	public static void main(String[] args) {
		
		Time obj1= new Time();
		
		obj1.Worldtimedisplay();
		obj1.canadatimedisplay();
		obj1.UStimedisplay();

	}

}

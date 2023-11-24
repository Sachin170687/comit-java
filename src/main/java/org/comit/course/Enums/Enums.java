package org.comit.course.Enums;


enum Size{
	SMALL,MEDIUM,LARGE
}

class Glass {
	
	Size size;
	
	static final int SMALL=1;
	static final int MEDIUM=2;
	static final int LARGE=3;
	
	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return String.format("Glass [size=%s]", size);
	}
	
	
}



public class Enums {

	public static void main(String[] args) {
		
			
			Glass obj1=new Glass();
			/*
			obj1.setSize(1);
			System.out.println(obj1);
			
			System.out.println(Glass.LARGE);
			
			obj1.setSize(5);
			System.out.println(obj1);
			*/
		
			obj1.setSize(Size.SMALL);
			System.out.println(obj1);
	}

}

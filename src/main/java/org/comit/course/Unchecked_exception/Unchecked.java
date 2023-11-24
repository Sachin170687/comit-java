package org.comit.course.Unchecked_exception;

import java.util.Scanner;

public class Unchecked {

	public static void main(String[] args) {
		
	
		try (Scanner scan =new Scanner(System.in))
		{
		
		while(true) {
				try {
					int res;
					System.out.println("Enter the Number");
					String str=scan.nextLine();
					
					int num=Integer.valueOf(str);
					res=5/num;
					System.out.println("Result "+ res);
					break;
					
				   //String hello=null;
				   //hello.length();
			    	}
		
				catch(NumberFormatException|ArithmeticException|NullPointerException ex)
					{
					//ex.printStackTrace();
					System.out.println("Dear User ,Invalid Input.Please try again");
					}
		}
		}
		
	}
}

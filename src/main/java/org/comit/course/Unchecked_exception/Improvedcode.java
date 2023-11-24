package org.comit.course.Unchecked_exception;

import java.util.Scanner;

public class Improvedcode {

	public static void main(String[] args) {
		
		Scanner scan=null;
		try {
		int res;
		scan =new Scanner(System.in);
		System.out.println("Enter the Number");
		String str=scan.nextLine();
		
		int num=Integer.valueOf(str);
		res=5/num;
		System.out.println("Result "+ res);
		
		String hello=null;
		hello.length();
		
		} 
		catch(NumberFormatException ex)
		{
			//ex.printStackTrace();
			System.out.println("Dear User ,Invalid Number.Please try again");
		}
		catch(ArithmeticException ex)
		{
			//ex.printStackTrace();
			System.out.println("Dear User ,Number can not be divide by zero");
		}
		catch(NullPointerException ex)
		{
			System.out.println("Dear User ,Please try again");
		}
		
		finally {
			System.out.println("The Finally Block is always executed");
			scan.close();
		}
	}
}

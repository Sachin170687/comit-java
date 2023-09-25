package org.comit.course._01_variables;

public class Variable {

/*
 Executable classes have a main() method
 */
	public static void main(String[] args) {
		
		// Ways to comment

		// one line comment
		/* Multi-line
		 comment
		 */
		
		// (1) Integers
		/* Declare the variable -> int num1
		 * the initialization -> 4
		 */
		int num1 = 4;  // By default we use int
		int num2 = 2147483647;
		long num3 = 2147483648l;
		long num4 = 2147483648L;
		byte num5 = 100;
		short num6 = 3000;
		int num7 = 2_147_483_647;
		long num8 = 2_147_483_648L;
		
		
		// (2) To store decimal values
		// will throw error -> int num9 = 5.10;
		
		double num10=5.10; // 99.99% used
		// will throw error -> float num11=5.10 ;
		float num12=5.10F;
		
		
		// (3) To store boolean values
		
		boolean bool1=true;
		boolean bool2=false;
		
		// (4) Text Variable
		
		char n1='S';
		String str1="I love Java";
		
		
		// We print out the data in the console with 
		        System.out.println("The Integer number is:" + num5);
				System.out.println("The Number is:" + num12);
                System.out.println("The boolean is:"+ bool1);	
                System.out.println("The character is:"+ n1);
                System.out.println("The string is:"+ str1);
                
        /* Except String all the above data types are primitive but string is Non-primitive as
         it is reference data type. 
         */
		
		 // To Prove
                
         String str2=new String("Coffee");
         String str3=new String("Coffee");
		
         System.out.println("str2:" + str2);
         System.out.println("str3:" + str3);
         
         int num13=200;
         int num14=200;
         
         
         if (num13==num14) {
        	 System.out.println("Equals");
         }
        	 else {
        		 System.out.println("Different");
	}
        
         if (str2==str3) {
        	 System.out.println("Equals");
         }
        	 else {
        		 System.out.println("Different");
	}
         
        /*
         1) The way primitives are implemented that when we compare  primitives
         data type  ,we compare values.
         2) 1) The way non - primitives are implemented that when we compare  non primitives
         data type  ,we compare memory address.
         3) Primitives are faster but can't reuse memory.
        
         */
         
         // All Reference Type should use equal method to compare instead of ==
         
         
         if (str2.equals(str3)) {
        	 System.out.println("Equals");
         }
        	 else {
        		 System.out.println("Different");
	} 
         
         
         
         
         
         
         
	}

}

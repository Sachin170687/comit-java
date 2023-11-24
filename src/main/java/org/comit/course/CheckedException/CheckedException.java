package org.comit.course.CheckedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	void process() {	
		BufferedReader file=null;
		
		try {
			file=File.open("testfile.txt");
			String line=null;
			while((line=File.read(file))!=null) {
				System.out.println(line);
			}
		
			} 
		
		catch (FileNotFoundException e) {
			System.out.println("Dear User , File does not exist!");
		} catch (IOException e) {
			System.out.println("Dear User , error while reading the file!");
		}
		finally {
			System.out.println("Finally block is always executed");
			File.close(file);}
		}
		void process2() throws FileNotFoundException,IOException {	
			BufferedReader file=null;
			
			try {
				file=File.open("testfile.txt");
				String line=null;
				while((line=File.read(file))!=null) {
					System.out.println(line);
					}
				} 
			finally {
				System.out.println("Finally block is always executed");
				File.close(file);
			}		

	}

	public static void main(String[] args) {
		
		CheckedException obj = new CheckedException();
		//obj.process();
		try {
			obj.process2();
		} catch (FileNotFoundException e) {
			System.out.println("Dear User , File does not exist!");
		} catch (IOException e) {
			System.out.println("Dear User , error while reading the file!");
		}
		
	}

}

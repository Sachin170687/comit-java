package org.comit.course.Connection_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import org.comit.course.Connection_Mysql.Users;

import com.google.protobuf.TextFormat.ParseException;
public class Mysqlconnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
        String dbUsername = "root";
        String dbPassword = "pass@123";

        Users users=new Users();
        
        try(Scanner scan = new Scanner(System.in)){

            System.out.println("Enter the first name: ");
            
            
            users.setIdUser(scan.nextLine());

            System.out.println("Enter the last name: ");
            users.setNameUser(scan.nextLine());
            
            
            
        }
	}}


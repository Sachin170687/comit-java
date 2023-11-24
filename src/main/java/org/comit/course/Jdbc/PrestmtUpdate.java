package org.comit.course.Jdbc;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.comit.course.Jdbc.bean.User;




public class PrestmtUpdate {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myusersdb";
		String dbUsername="root";
		String dbPassword="pass@123";
		
		User user=new User();
		
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		
		try(Scanner scan=new Scanner(System.in);) {
			
			
			System.out.println("Enter the id user: ");
            user.setIdUser(scan.nextInt());
            scan.nextLine();

			
			System.out.println("Enter the First Name: ");
			user.setFirstName(scan.nextLine());
			
			System.out.println("Enter the Last Name: ");
			user.setLastName(scan.nextLine());
			
			System.out.println("Enter the User Name: ");
			user.setUsername(scan.nextLine());
			
			System.out.println("Enter the Password: ");
			user.setPassword(scan.nextLine());
			
			
			System.out.println("Enter the Date of Birth (yyyy-MM-dd): ");
			user.setBirth(formatter.parse(scan.nextLine()));
			
			
			
			System.out.println("Enter the Status: ");
			user.setStatus(scan.nextLine());
			
			} 
		        catch (ParseException ex) {
				System.err.format("Error while parsing date: %s%n",ex.getMessage());
			}
			
			
		String sql= "UPDATE USER SET FIRST_NAME=?,LAST_NAME=?,USER_NAME=?,PASSWORD=?"
				    + ",BIRTH=?,STATUS=? WHERE ID_USER=?";
				
		
				
		System.out.println("Insert Statement:"+sql);
	
		try(Connection con=DriverManager.getConnection(url, dbUsername, dbPassword);
			PreparedStatement prSt=con.prepareStatement(sql)) {
			
			prSt.setString(1, user.getFirstName());
			prSt.setString(2, user.getLastName());
			prSt.setString(3, user.getUsername());
			prSt.setString(4, user.getPassword());
			prSt.setDate(5,new Date(user.getBirth().getTime()));
			prSt.setString(6, user.getStatus());
			prSt.setInt(7, user.getIdUser());
			
			int row=prSt.executeUpdate();
			
			System.out.println("Number of rows affected:"+  row);
			
			if(row<1) {
				System.out.println("User not found, idUser: "+user);
			}
		} catch (SQLException ex) {
			System.err.format("SQL state: %s%n%s",ex.getSQLState(),ex.getMessage());
			
		}
		
		System.out.println(user);
		
			}

	}

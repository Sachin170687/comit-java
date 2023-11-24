package org.comit.course.Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.comit.course.Jdbc.bean.User;




public class StmtInsert {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myusersdb";
		String dbUsername="root";
		String dbPassword="pass@123";
		
		User user=new User();
		
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		
		try(Scanner scan=new Scanner(System.in);) {
			
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
			
			
		String sql= "INSERT INTO USER (FIRST_NAME,LAST_NAME,USER_NAME,PASSWORD,BIRTH,STATUS) VALUES";
				
		
				sql=sql+"('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getUsername()+"','"
						+user.getPassword()+"','"+formatter.format(user.getBirth())+"','"+user.getStatus()+"')";
		
		System.out.println("Insert Statement:"+sql);
	
		try(Connection con=DriverManager.getConnection(url, dbUsername, dbPassword);
			Statement st=con.createStatement()) {
			
			int row=st.executeUpdate(sql);
			
			System.out.println("Number of rows affected:"+  row);
			
		} catch (SQLException ex) {
			System.err.format("SQL state: %s%n%s",ex.getSQLState(),ex.getMessage());
			
		}
		
		System.out.println(user);
		
		/*
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, dbUsername, dbPassword);
			System.out.println("The connection was successful!");
		} catch (SQLException ex) {
			System.err.format("SQL state: %s%n%s",ex.getSQLState(),ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {
				con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		*/
	}

	}

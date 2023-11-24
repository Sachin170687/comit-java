package org.comit.course.Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.comit.course.Jdbc.bean.User;




public class StmtselectbyID {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myusersdb";
		String dbUsername="root";
		String dbPassword="pass@123";
		
		List<User> users= new ArrayList<>();
		
		String sql="SELECT * FROM USER WHERE ID_USER=";
		
		String input=null;
		try(Scanner scan=new Scanner(System.in);) {
			
			System.out.println("Enter the idUser: ");
			input = scan.nextLine();	
			} 
		    
		sql+=input;
		// sql=sql+input;
		
		System.out.println("Select Statement:"+sql);
	
		try(Connection con=DriverManager.getConnection(url, dbUsername, dbPassword);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql)) {
			
			while(rs.next()) {
				int idUser=rs.getInt("ID_USER");
				String firstName=rs.getString("FIRST_NAME");
				String lastName=rs.getString("LAST_NAME");
				String userName=rs.getString("USER_NAME");
				String password=rs.getString("PASSWORD");
				Date birth =rs.getDate("BIRTH");
				String status =rs.getString("STATUS");
				
				User user = new User();
				
				user.setIdUser(idUser);
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setUsername(userName);
				user.setPassword(password);
				user.setBirth(birth);
				user.setStatus(status);
				
				users.add(user);
				
			}
		} catch (SQLException ex) {
			System.err.format("SQL state: %s%n%s",ex.getSQLState(),ex.getMessage());
		}
		
		users.forEach(System.out::println);
		
			}

	}

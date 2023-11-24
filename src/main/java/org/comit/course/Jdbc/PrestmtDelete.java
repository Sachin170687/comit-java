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




public class PrestmtDelete {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myusersdb";
		String dbUsername="root";
		String dbPassword="pass@123";
		
		int idUser=0;
		
		try(Scanner scan=new Scanner(System.in);) {	
			System.out.println("Enter the id user: ");
            idUser = scan.nextInt();
			} 
		        
			
		String sql= "DELETE FROM USER WHERE ID_USER=?";
				
		
				
		System.out.println("Delete Statement:"+sql);
	
		try(Connection con=DriverManager.getConnection(url, dbUsername, dbPassword);
			PreparedStatement prSt=con.prepareStatement(sql)) {
			
			prSt.setInt(1, idUser);
			
			int row=prSt.executeUpdate();
			
			System.out.println("Number of rows affected:"+  row);
			
			if(row<1) {
				System.out.println("User not found, idUser: "+idUser);
			}
		} catch (SQLException ex) {
			System.err.format("SQL state: %s%n%s",ex.getSQLState(),ex.getMessage());
			
		}
		
		System.out.println("idUser"+idUser);
		
			}

	}

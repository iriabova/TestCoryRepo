package TestSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDUtilities {

	// Creating private static object of Connection class
		// it is used to create connection with database
		private static Connection conn;
		
		// Creating private static object of Statement class
		// it is used to create a Statemen to execute the query
		private static Statement stmt;
		
		// Creating private static object of ResultSet class
		// it is used to create a resultset to store query results
		private static ResultSet resultSet;
		
		//create database url
		//syntax for db url connection or url string
		//jdbc:typeofdatabase://host:port/databasename
		private static String dbURL= "jdbc:postgresql://localhost:5432/dvdrental";
		
		//database username
		private static String dbUserName="postgres";
		
		//database user password
		private static String dbPassword="root";
		
		//sql query
		private static String dbQuery="select * from public.actor where actor_id =88";
		
		/*
		 * This method creates connection with database
		 */
		
		
		public static void setupConnection() {
			try {
				conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		}
		
		/*
		 * This method will execute the query from DB
		 */
		public static void runQuery() {
			try {
				stmt = conn.createStatement(); //here we create statement
				resultSet= stmt.executeQuery(dbQuery); //pass query to the statement to execute the query
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.printf("%-10s %-10s %-10s %-10s\n", "Name", "Last Name","update","id");
			
			try {
				while (resultSet.next()) {
					System.out.printf("%-10s %-10s %-10s %-10s\n",resultSet.getString("first_name"),
							resultSet.getString("last_name"), resultSet.getString("last_update"),resultSet.getString("actor_id"));
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
		public static void closeConnection() {
			
			if(conn !=null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
	}


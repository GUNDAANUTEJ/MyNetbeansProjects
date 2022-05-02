/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC01
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
		String username = "hr";
		String password = "hr";
		Statement dbStatement = null;
		ResultSet dbResultSet = null;
		Connection conn = null;

		try
		{
			conn =
				DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful.");
		} catch (SQLException ex)
		{
			System.out.println("Problems with connection" + ex);
		}

		String query =
			"select isbn, title, authFirstName, authLastName from tblBooks";
		System.out.println("Query: " + query);
		try
		{
			dbStatement =
				conn.createStatement();
			System.out.println("Statement created successfully.");
		} catch (SQLException ex)
		{
			System.out.println("Problems creating statement" + ex);
		}
		try
		{
			dbResultSet = dbStatement.executeQuery(query);
			System.out.println("Query executed correctly.");
		} catch (SQLException ex)
		{
			System.out.println("Problems executing statement" + ex);
		}
		System.out.println();
		displayResults(dbResultSet);
		System.out.println();
		try
		{
			dbStatement.close();
			System.out.println("Statement closed.");
		} catch (SQLException ex)
		{
			System.out.println("Problem closing statement.");
		}
		try
		{
			conn.close();
			System.out.println("Connection closed.");
		} catch (SQLException ex)
		{
			System.out.println("Problem closing connection.");
		}
	} // end main

	public static void displayResults(ResultSet dbrs)
	{
		int count = 0;
		try
		{
			while (dbrs.next())
			{
				System.out.printf("%-15s %-40s %1s %1s\n",
					dbrs.getString("isbn"), dbrs.getString("title"),
					dbrs.getString("authFirstName"),
					dbrs.getString("authLastName"));
				count++;
			}
		} catch (SQLException ex)
		{
			System.out.println(
				"SQLException occurred while displaying results.\n" +
				ex);
		}
		System.out.println();
		System.out.println(count + " records in result set");
	}
}

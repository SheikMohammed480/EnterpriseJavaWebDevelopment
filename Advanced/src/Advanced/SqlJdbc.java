package Advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharmi","root","Sheik@3122");
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("create database sharmi");
		//we can store it in string and pass it in executeUpdate
		String createTable="create table data1(name varchar(255),age int)";
		stmt.executeUpdate(createTable);
		//System.out.println("database sharmi is created successfully");
		System.out.println("created data table");
	}

}

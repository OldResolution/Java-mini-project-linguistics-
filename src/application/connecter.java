package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class connecter {
	
	public static void main(String[]args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/language_learning","root","oracle");
	}catch(Exception e){
		System.out.println(e);
	}
}
}
package application;
import java.sql.*;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class  alertscontroller {

	public static String tfTransid="";
	public static String tfTranscateg="";
	public static String tfTranstype="";
	public static String tfTransdate="";
	public static int user;
	static Alert a = new Alert(AlertType.ERROR);
	// alert function for invalid login
	public static void Handle1()
	{
		// set alert type
		a = new Alert(AlertType.ERROR, "Invalid password", ButtonType.CANCEL);

		// show the dialog
		a.show();
	}public static void Handle3()
	{
		// set alert type
		a = new Alert(AlertType.ERROR,
				"No such user found", ButtonType.CANCEL);

		// show the dialog
		a.show();
	}
	public static void wrongPass()
	{
		// set alert type
		a.setAlertType(AlertType.ERROR);
		// content to show
		a.setContentText("Confirm with same password ?");
		// show the dialog
		a.show();
	}
	public static void Handle2()
	{
		// set alert type
		a.setAlertType(AlertType.ERROR);
		// content to show
		a.setContentText("Invalid Username or Password Length !");
		// show the dialog
		a.show();
	}
	public static boolean checkLogin1(String name, String pass) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{//to throw basic exceptions
		// connecting database
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exp_Tracker", "root", "oracle");
		Statement stmt = con.createStatement();

		// SELECT query
		String q1 = "select user_id, password from user WHERE username = '" + name + "';";
		ResultSet rs = stmt.executeQuery(q1);
		if (rs.next())
		{
			if(pass.compareTo(rs.getString("password"))==0){
				System.out.println("Valid login");
				user= rs.getInt("user_id");
				return true;
			}
			else{
				System.out.println("Invalid login");
				Handle1();
				con.close();
				return false;
			}
		}
		else {
			System.out.println("No such Valid User");
			Handle3();
			con.close();
			return false;
		}
	}
}
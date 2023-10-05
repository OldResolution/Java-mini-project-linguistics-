package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class DBUtils {

	public static void changeScene(ActionEvent event, String fxmlFile, String title, String username) {
		Parent root = null;
		
		if(username != null){
			try {
				FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
				root = loader.load();
				dashboardcontroller Dashboardcontroller = loader.getController();
				Dashboardcontroller.setUserInformation(username);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				root=FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setTitle(title);
		stage.setScene(new Scene(root,520,400));
		stage.show();
		
	}
	public static void closeScene(ActionEvent event) {
		Parent root = null;
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.close();	
		}
	//Transition from signup page to login page
	public static void SignupUser(ActionEvent event, String username, String password) {
		Connection connection= null;
		PreparedStatement psInsert= null;
		PreparedStatement preparedStatement= null;
		ResultSet resultSet = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linguistics","root","oracle");
			preparedStatement = connection.prepareStatement("SELECT *FROM users WHERE username = ?");
			preparedStatement.setString(1, username);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.isBeforeFirst()) {
				System.out.println("User already exists");
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("You cannot use this Username");
				alert.show();
			}else {
				psInsert = connection.prepareStatement("INSERT INTO users VALUES (?,?)");
				psInsert.setString(1, username);
				psInsert.setString(2, password);
				psInsert.executeUpdate();
				
				changeScene(event,"login.fxml","Login",username);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (resultSet !=null) {
				try {
					resultSet.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}if(psInsert != null) {
			try {
				psInsert.close();
			}catch (SQLException e) {
				e.printStackTrace();
				}
		}if(connection !=null) {
		try {
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
	//Transition from login page to dashboard
	public static void LoginUser(ActionEvent event, String username, String password) {
		Connection connection = null;
		PreparedStatement preparedStatements = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linguistics","root","oracle");
			preparedStatements= connection.prepareStatement("SELECT password FROM users WHERE username=?");
			preparedStatements.setString(1,username);
			resultSet= preparedStatements.executeQuery();
			
			if(resultSet.isBeforeFirst()) {
				System.out.println("User not found in the database");
				Alert alert = new Alert (Alert.AlertType.ERROR);
				alert.setContentText("Provided Credentials are incorrect");
				alert.show();
			}else {
				while (resultSet.next()) {
					String retrievedPassword = resultSet.getString("password");
					if(retrievedPassword.equals(password)) {
						changeScene(event,"dashboard.fxml","Dashboard",username);
					}else {
						System.out.println("Passwords did not match");
						Alert alert=new Alert(Alert.AlertType.ERROR);
						alert.setContentText("The provided Credentials are incorrect");
						alert.show();
					}
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
				if (resultSet !=null) {
						try {
							resultSet.close();
						}catch (SQLException e) {
					e.printStackTrace();
					}
				}
				if(preparedStatements != null) {
					try {
						preparedStatements.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
		}if(connection !=null) {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

package Language;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ReportController implements Initializable{
	 private Stage stage;
	 private Scene scene;
	
	 @FXML
	 TextArea comment;
	 @FXML
	 TextField username;
	 @FXML
	 Button goback,submit,signout;
	 
	 @Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	@FXML
    void OpenProfile(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
    @FXML
    void OpenCourses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("courses.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    void OpenLessons(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("lesson.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
    @FXML
    void LogoutAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
    @FXML
    void OpenQuiz(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("QuizPage.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
 }
	public void Feedback(ActionEvent event) {
		String feedback = comment.getText();
		String user= username.getText();
	    
		String Url = "jdbc:mysql://localhost:3306/languages";
	    String DBUser = "root";
	    String DBPassword = "oracle";

	    try (Connection connection = DriverManager.getConnection(Url, DBUser, DBPassword)) {
	        String query = "INSERT INTO feedback (comment,username) VALUES (?,?)";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	        	preparedStatement.setString(1, feedback);
	        	preparedStatement.setString(2,user);
	            int rowsAffected = preparedStatement.executeUpdate(); // Use executeUpdate() for INSERT
 
	            if (rowsAffected > 0) {
	               System.out.println("FEEDBACK entered sucessfully");
	            } else {
	            	showError("FEEDBACK failed entry","Failed to insert data into the database.");
	            }
	        }
	    } catch (SQLException e) {
	        // Handle database connection or query errors
	        e.printStackTrace();
	        showError("Database Error", "An error occurred while accessing the database.");
	    }
	}
	        private void showError(String title, String message) {
	        Alert alert = new Alert(Alert.AlertType.ERROR);
	        alert.setTitle(title);
	        alert.setHeaderText(null);
	        alert.setContentText(message);
	        alert.showAndWait();
	        }
	}


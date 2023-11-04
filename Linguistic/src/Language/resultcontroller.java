package Language;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class resultcontroller {
		
		private Stage stage;
		private Scene scene;

	    @FXML
	    public Label remarklabel, marks, markstext, correcttext, wrongtext;
	    
	    @FXML
	    public Button Back;
	    @FXML
	    public ProgressIndicator correct_progress, wrong_progress;
	    @FXML
	    public TextField username;
	    
	    int correct;
	    int wrong;
	    
	    
	    static double progress1,progress2;
	    
	    @FXML
	    void QLpage(ActionEvent event) throws IOException{
	    	Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
	        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        progress1 += 0.5;
	        progress2 += 1.0;
	    }
	    @FXML
	    private void initialize() {
	        correct = quizcontroller.correct;
	        wrong = quizcontroller.wrong;

	        correcttext.setText("Correct Answers : " + correct);
	        wrongtext.setText("Incorrect Answers : " + String.valueOf(quizcontroller.wrong));

	        marks.setText(correct + "/10");
	        float correctf = (float) correct/10;
	        correct_progress.setProgress(correctf);

	        float wrongf = (float) wrong/10;
	        wrong_progress.setProgress(wrongf);


	        markstext.setText(correct + " Marks Scored");

	        if (correct<2) {
	            remarklabel.setText("Oh no..! You have failed the quiz. Failure is a stepping stone to success. Use this experience as a valuable lesson to improve and do better next time.. Practice daily!.");
	        } else if (correct>=2 && correct<5) {
	            remarklabel.setText("Oops..! You have scored less marks. You are capable of great things, and this setback is just a small part of your journey. Keep pushing forward.");
	        } else if (correct>=5 && correct<=7) {
	            remarklabel.setText("Good. Perseverance is key. Use this as an opportunity to learn, grow, and come back even stronger. Practice is the key to success.");
	        } else if (correct==8 || correct==9) {
	            remarklabel.setText("Congratulations! Its your hardwork and determination which helped you to score good marks. Check you results here.");
	        } else if (correct==10) {
	            remarklabel.setText("Congratulations! You have passed the quiz with full marks because of your hardwork and dedication towards studies. Keep it up! Check your results here.");
	        }
	    }
	public void Marks(ActionEvent event) {
		String ob_marks= marks.getText();
		String user=username.getText();
		
	    String Url = "jdbc:mysql://localhost:3306/languages";
	    String DBUser = "root";
	    String DBPassword = "oracle";

	    try (Connection connection = DriverManager.getConnection(Url, DBUser, DBPassword)) {
	        String query = "INSERT INTO quiz (ob_marks,username) VALUES (?,?)";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, ob_marks);
	            preparedStatement.setString(2, user);
	            int rowsAffected = preparedStatement.executeUpdate(); // Use executeUpdate() for INSERT

	            if (rowsAffected > 0) {
	               System.out.println("MARKS entered sucessfully");
	            } else {
	            	showError("Marks failed entry","Failed to insert data into the database.");
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
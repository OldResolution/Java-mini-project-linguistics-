package Language;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;
import java.io.IOException;

	public class resultcontroller {
		
		private Stage stage;
		private Scene scene;

	    @FXML
	    public Label remark, marks, markstext, correcttext, wrongtext;
	    
	    @FXML
	    public Button Back;
	    @FXML
	    public ProgressIndicator correct_progress, wrong_progress;

	    int correct;
	    int wrong;
	    
	    @FXML
	    void QLpage(ActionEvent event) throws IOException{
	    	Parent root = FXMLLoader.load(getClass().getResource("QLpage.fxml"));
	        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
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
	            remark.setText("Oh no..! You have failed the quiz. Failure is a stepping stone to success. Use this experience as a valuable lesson to improve and do better next time.. Practice daily!.");
	        } else if (correct>=2 && correct<5) {
	            remark.setText("Oops..! You have scored less marks. You are capable of great things, and this setback is just a small part of your journey. Keep pushing forward.");
	        } else if (correct>=5 && correct<=7) {
	            remark.setText("Good. Perseverance is key. Use this as an opportunity to learn, grow, and come back even stronger. Practice is the key to success.");
	        } else if (correct==8 || correct==9) {
	            remark.setText("Congratulations! Its your hardwork and determination which helped you to score good marks. Check you results here.");
	        } else if (correct==10) {
	            remark.setText("Congratulations! You have passed the quiz with full marks because of your hardwork and dedication towards studies. Keep it up! Check your results here.");
	        }
	    }
	}
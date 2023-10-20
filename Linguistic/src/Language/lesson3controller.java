package Language;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class lesson3controller implements Initializable {

	@FXML
	public TextField pronounce,info;
	
	@FXML
	public ImageView audiocontrol,example;
	
	@FXML
	public Button menu,last,next,english,hindi;
	
	static int counter = 0;
	
	private Stage stage;
	private Scene scene;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		start();
	}
	
	 public void start(){
		 switch (counter) {
		 case 1:
			 pronounce.setText("L - एल (el)");
			 break;
		 case 2:
			 pronounce.setText("M - एम (em)");
			 break;
		 case 3:
			 pronounce.setText("N - एन (en)");
			 break;
		 case 4:
			 pronounce.setText("O - ओ (oh)");
			 break;
		 case 5:
			 pronounce.setText("P - पी (pee)");
			 break;
		 case 6:
			 pronounce.setText("Q - क्यू (kyoo)");
			 break;
		 case 7:
			 pronounce.setText("R - आर (aar)");
			 break;
		 }
	 }
		 public void next(ActionEvent event) {
			 if (counter==7) {
			 	try {
			 		 Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
			            thisstage.close();
			            FXMLLoader lesson1 = new FXMLLoader(getClass().getResource("lesson.fxml"));
			            Scene quizscene = new Scene(lesson1.load());
			            quizscene.setFill(Color.TRANSPARENT);
			            Stage quizstage = new Stage();
			            quizstage.setScene(quizscene);
			            quizstage.initStyle(StageStyle.TRANSPARENT);
			            quizstage.show();
			 		}catch(IOException e) {
			            e.printStackTrace();
			 	}
			 }else {
			 	counter++;
			 	start();
			 }
			 }
			 public void last(ActionEvent event) {
			 if (counter==1) {
			 	try {
			 		 Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
			            thisstage.close();
			            FXMLLoader lesson1 = new FXMLLoader(getClass().getResource("lesson.fxml"));
			            Scene quizscene = new Scene(lesson1.load());
			            quizscene.setFill(Color.TRANSPARENT);
			            Stage quizstage = new Stage();
			            quizstage.setScene(quizscene);
			            quizstage.initStyle(StageStyle.TRANSPARENT);
			            quizstage.show();
			 		}catch(IOException e) {
			            e.printStackTrace();
			 	}
			 }else {
			 	counter--;
			 	start();
			 	}
			 }
			 	@FXML
			 	void getback(ActionEvent event) throws IOException{
			 	Parent root = FXMLLoader.load(getClass().getResource("lesson.fxml"));
			 	stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 	scene = new Scene(root);
			 	stage.setScene(scene);
			 	stage.show();
			 	}
}
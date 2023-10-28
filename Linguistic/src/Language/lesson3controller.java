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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class lesson3controller implements Initializable {

	@FXML
	public TextField pronounce;
	
	@FXML
	public Label info;
	
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
		english();
		hindi();
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
			 	english();
			 	hindi();
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
			 	english();
			 	hindi();
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
			 	public void english() {
			 		switch (counter) {
			 		 case 1:
			 			 info.setText("Position in Alphabet: 12th. \n Phonetic Pronunciation: /ɛl/");
			 			 break;
			 		 case 2:
			 			 info.setText("Position in Alphabet: 13th. \t Phonetic Pronunciation: /ɛm/");
			 			 break;
			 		 case 3:
			 			 info.setText("Position in Alphabet: 14th. \t Phonetic Pronunciation: /ɛn/ ");
			 			 break;
			 		 case 4:
			 			 info.setText("Position in Alphabet: 15th. \t Phonetic Pronunciation: /oʊ/");
			 			 break;
			 		 case 5:
			 			 info.setText("Position in Alphabet: 16th. \t Phonetic Pronunciation: /pi/");
			 			 break;
			 		case 6:
			 			 info.setText("Position in Alphabet: 17th. \t Phonetic Pronunciation: /kju/");
			 			 break;
			 		case 7:
			 			 info.setText("Position in Alphabet: 18th. \t Phonetic Pronunciation: /ɑr/");
			 			 break;
			 		 }
			 	}
			 	public void hindi() {
			 		switch (counter) {
			 		 case 1:
			 			 info.setText("वर्णमाला में स्थान: बारहवाँ | \t ध्वनिक उच्चारण: /एल/");
			 			 break;
			 		 case 2:
			 			 info.setText("वर्णमाला में स्थान: तेरहवाँ | \t ध्वनिक उच्चारण: /एम/");
			 			 break;
			 		 case 3:
			 			 info.setText("वर्णमाला में स्थान: चौदहवाँ | \t ध्वनिक उच्चारण: /एन/");
			 			 break;
			 		 case 4:
			 			 info.setText("वर्णमाला में स्थान: पंद्रहवाँ | \t ध्वनिक उच्चारण: /ओ/");
			 			 break;
			 		 case 5:
			 			 info.setText("वर्णमाला में स्थान: सोलहवाँ | \t ध्वनिक उच्चारण: /पी/");
			 			 break;
			 		case 6:
			 			 info.setText("वर्णमाला में स्थान: सत्रहवाँ | \t ध्वनिक उच्चारण: /क्यू/");
			 			 break;
			 		case 7:
			 			 info.setText("वर्णमाला में स्थान: अठारहवाँ | \t ध्वनिक उच्चारण: /आर/");
			 			 break;
			 		 }
			 	}
}
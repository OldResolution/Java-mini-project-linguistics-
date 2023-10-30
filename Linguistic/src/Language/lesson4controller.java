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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class lesson4controller implements Initializable{

	@FXML
	public TextField pronounce;
	
	@FXML
	public Label info;
	
	@FXML
	public ImageView audiocontrol,example;
	
	@FXML
	public Button menu,last,next,english,hindi;
	
	@FXML
	Image image19 = new Image(getClass().getResourceAsStream("/contents/Ship.jpg"));
	Image image20 = new Image(getClass().getResourceAsStream("/contents/Tiger.jpg"));
	Image image21 = new Image(getClass().getResourceAsStream("/contents/Umbrella.jpg"));
	Image image22 = new Image(getClass().getResourceAsStream("/contents/Van.jpg"));
	Image image23 = new Image(getClass().getResourceAsStream("/contents/Watch.jpg"));
	Image image24 = new Image(getClass().getResourceAsStream("/contents/Xylophone.jpg"));
	Image image25 = new Image(getClass().getResourceAsStream("/contents/Yak.jpg"));
	Image image26 = new Image(getClass().getResourceAsStream("/contents/Zebra.jpg"));

	static int counter = 0;
	
	private Stage stage;
	private Scene scene;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		start();
		english();
		hindi();
	}
	 public void start(){
		 switch (counter) {
		 case 1:
			 pronounce.setText("S - एस (es)");
			 example.setImage(image19);
			 break;
		 case 2:
			 pronounce.setText("T - टी (tee)");
			 example.setImage(image20);
			 break;
		 case 3:
			 pronounce.setText("U - यू (yoo))");
			 example.setImage(image21);
			 break;
		 case 4:
			 pronounce.setText("V - वी (vee)");
			 example.setImage(image22);
			 break;
		 case 5:
			 pronounce.setText("W - डब्ल्यू (double you)");
			 example.setImage(image23);
			 break;
		 case 6:
			 pronounce.setText("X - एक्स (eks)");
			 example.setImage(image24);
			 break;
		 case 7:
			 pronounce.setText("Y - वाई (wai)");
			 example.setImage(image25);
			 break;
		 case 8:
			 pronounce.setText("Z - जेड (zed)");
			 example.setImage(image26);
			 break;
		 }
            
	}
	 public void next(ActionEvent event) {
		 if (counter==8) {
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
		 			 info.setText("Position in Alphabet: 19th. \n Phonetic Pronunciation: /ɛs/");
		 			 break;
		 		 case 2:
		 			 info.setText("Position in Alphabet: 20th. \t Phonetic Pronunciation: /ti/");
		 			 break;
		 		 case 3:
		 			 info.setText("Position in Alphabet: 21st. \t Phonetic Pronunciation: /ju/ ");
		 			 break;
		 		 case 4:
		 			 info.setText("Position in Alphabet: 22nd. \t Phonetic Pronunciation: /vi/");
		 			 break;
		 		 case 5:
		 			 info.setText("Position in Alphabet: 23rd. \t Phonetic Pronunciation: /dʌblju/");
		 			 break;
		 		case 6:
		 			 info.setText("Position in Alphabet: 24th. \t Phonetic Pronunciation: /ɛks/");
		 			 break;
		 		case 7:
		 			 info.setText("Position in Alphabet: 25th. \t Phonetic Pronunciation: /waɪ/");
		 			 break;
		 		case 8:
		 			 info.setText("Position in Alphabet: 26th. \t Phonetic Pronunciation: /zɛd/");
		 			 break;
		 		 }
		 	}
		 	
		 	public void hindi() {
		 		switch (counter) {
		 		 case 1:
		 			 info.setText("वर्णमाला में स्थान: उन्नीसवाँ | \t ध्वनिक उच्चारण: /एस/");
		 			 break;
		 		 case 2:
		 			 info.setText("वर्णमाला में स्थान: बीसवा | \t ध्वनिक उच्चारण: /टी/");
		 			 break;
		 		 case 3:
		 			 info.setText("वर्णमाला में स्थान: इक्कीसवा | \t ध्वनिक उच्चारण: /यू/");
		 			 break;
		 		 case 4:
		 			 info.setText("वर्णमाला में स्थान: बाईसवा | \t ध्वनिक उच्चारण: /वी/");
		 			 break;
		 		 case 5:
		 			 info.setText("वर्णमाला में स्थान: तेइसवा | \t ध्वनिक उच्चारण: /डब्ल्यू/");
		 			 break;
		 		case 6:
		 			 info.setText("वर्णमाला में स्थान: चौबीसवा | \t ध्वनिक उच्चारण: /एक्स/");
		 			 break;
		 		case 7:
		 			 info.setText("वर्णमाला में स्थान: पच्चीसवा | \t ध्वनिक उच्चारण: /वाई/");
		 			 break;
		 		case 8:
		 			 info.setText("वर्णमाला में स्थान: छब्बीसवा | \t ध्वनिक उच्चारण: /ज़ेड/");
		 			 break;
		 		 }
		 	}
}
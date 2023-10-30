package Language;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class lesson2controller implements Initializable{

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
	

@FXML
	Image image6 = new Image(getClass().getResourceAsStream("/contents/Fish.jpg"));
	Image image7 = new Image(getClass().getResourceAsStream("/contents/Goat.jpg"));
	Image image8 = new Image(getClass().getResourceAsStream("/contents/Hen.jpg"));
	Image image9 = new Image(getClass().getResourceAsStream("/contents/IceCream.jpg"));
	Image image10 = new Image(getClass().getResourceAsStream("/contents/Jug.jpg"));
	Image image11 = new Image(getClass().getResourceAsStream("/contents/Kite.jpg"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { 
		start();
		english();
		hindi();
	}
	
	 public void start(){
		 switch (counter) {
		 case 1:
			 pronounce.setText("F - एफ (eff)");
			 example.setImage(image6);
			 break;
		 case 2:
			 pronounce.setText("G - जी (jee)");
			 example.setImage(image7);
			 break;
		 case 3:
			 pronounce.setText("H - एच (eich)");
			 example.setImage(image8);
			 break;
		 case 4:
			 pronounce.setText("I - आई (aai)");
			 example.setImage(image9);
			 break;
		 case 5:
			 pronounce.setText("J - जे (jay)");
			 example.setImage(image10);
			 break;
		 case 6:
			 pronounce.setText("K - के (kay)");
			 example.setImage(image11);
			 break;
		 }
	 }
	 
	 public void next(ActionEvent event) {
		if (counter==6) {
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
					 info.setText("Position in Alphabet: 6th. \n Phonetic Pronunciation: /ɛf/");
					 break;
				 case 2:
					 info.setText("Position in Alphabet: 7th. \t Phonetic Pronunciation: /dʒi");
					 break;
				 case 3:
					 info.setText("Position in Alphabet: 8th. \t Phonetic Pronunciation: /eɪʧ/ ");
					 break;
				 case 4:
					 info.setText("Position in Alphabet: 9th. \t Phonetic Pronunciation: /aɪ/ ");
					 break;
				 case 5:
					 info.setText("Position in Alphabet: 10th. \t Phonetic Pronunciation: /dʒeɪ/");
					 break;
				 case 6:
				 	info.setText("Position in Alphabet: 11th. \t Phonetic Pronunciation: /keɪ/");
				 	break;
				}
			}
			
			public void hindi() {
				switch (counter) {
				 case 1:
					 info.setText("वर्णमाला में स्थान: छठा | \t ध्वनिक उच्चारण: /एफ/");
					 break;
				 case 2:
					 info.setText("वर्णमाला में स्थान: सातवाँ | \t ध्वनिक उच्चारण: /जी/");
					 break;
				 case 3:
					 info.setText("वर्णमाला में स्थान: आठवाँ | \t ध्वनिक उच्चारण: /एच/");
					 break;
				 case 4:
					 info.setText("वर्णमाला में स्थान: नौवाँ | \t ध्वनिक उच्चारण: /आई/");
					 break;
				 case 5:
					 info.setText("वर्णमाला में स्थान: दसवाँ | \t ध्वनिक उच्चारण: /जे/");
					 break;
				 case 6:
		 			 info.setText("वर्णमाला में स्थान: ग्यारहवाँ | \t ध्वनिक उच्चारण: /के/");
		 			 break;
				 }
			}
}

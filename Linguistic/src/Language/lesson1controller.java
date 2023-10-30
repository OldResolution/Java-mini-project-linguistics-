package Language;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class lesson1controller implements Initializable{

	private File directory;
	private File[] files;
	
	private ArrayList<File> songs;
	
	private int songNumber;
	
	private Media media;
	private MediaPlayer mediaPlayer;
	
	@FXML
	public TextField pronounce;
	
	@FXML
	public Label info;
	
	@FXML
	public ImageView example;
	
	@FXML
	public Button menu,last,next,english,hindi,audio;
	
	static int counter = 1;
	
	private Stage stage;
	private Scene scene;
	
	@FXML
	Image image1 = new Image(getClass().getResourceAsStream("/contents/Apple.jpg"));
	Image image2 = new Image(getClass().getResourceAsStream("/contents/Ball.jpg"));
	Image image3 = new Image(getClass().getResourceAsStream("/contents/Cat.jpg"));
	Image image4 = new Image(getClass().getResourceAsStream("/contents/Dog.jpg"));
	Image image5 = new Image(getClass().getResourceAsStream("/contents/Elephant.jpg"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		songs= new ArrayList<File>();
		
		directory= new File("audios");
		
		files = directory.listFiles();
		
		if (files != null) {
			for (File file : files) {
				
				songs.add(file);
			}
			media = new Media(songs.get(songNumber).toURI().toString());
			mediaPlayer= new MediaPlayer(media);
		}
	}
	public void start(){
	 switch (counter) {
	 case 1:
		 pronounce.setText("A - ए (eh)");
		 example.setImage(image1);
		 break;
	 case 2:
		 pronounce.setText("B - बी (bee)");
		 example.setImage(image2);
		 break;
	 case 3:
		 pronounce.setText("C - सी (cee)");
		 example.setImage(image3);
		 break;
	 case 4:
		 pronounce.setText("D - डी (dee)");
		 example.setImage(image4);
		 break;
	 case 5:
		 pronounce.setText("E - ई (ee)");
		 example.setImage(image5);
		 break;
	 }
}
	public void playAudio() {
		mediaPlayer.play();
		mediaPlayer.seek(Duration.seconds(0));
	}
	
public void next(ActionEvent event) {
if (counter==5) {
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
		 info.setText("Position in Alphabet: 1st. \n Phonetic Pronunciation: /eɪ/");
		 break;
	 case 2:
		 info.setText("Position in Alphabet: 2nd. \t Phonetic Pronunciation: /bi/");
		 break;
	 case 3:
		 info.setText("Position in Alphabet: 3rd. \t Phonetic Pronunciation: /si/ ");
		 break;
	 case 4:
		 info.setText("Position in Alphabet: 4th. \t Phonetic Pronunciation: /di/");
		 break;
	 case 5:
		 info.setText("Position in Alphabet: 5th. \t Phonetic Pronunciation: /i/");
		 break;
	 }
}
public void hindi() {
	switch (counter) {
	 case 1:
		 info.setText("वर्णमाला में स्थान: पहला | \t ध्वनिक उच्चारण: /ए/");
		 break;
	 case 2:
		 info.setText("वर्णमाला में स्थान: दूसरा | \t ध्वनिक उच्चारण: /बी/");
		 break;
	 case 3:
		 info.setText("वर्णमाला में स्थान: तीसरा | \t ध्वनिक उच्चारण: /सी/");
		 break;
	 case 4:
		 info.setText("वर्णमाला में स्थान: चौथा | \t ध्वनिक उच्चारण: /डी/");
		 break;
	 case 5:
		 info.setText("वर्णमाला में स्थान: पाँचवा | \t ध्वनिक उच्चारण: /ई/");
		 break;
	 }
}
}
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
	
	private int AlfaNumber;
	
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
	Image image6 = new Image(getClass().getResourceAsStream("/contents/Fish.jpg"));
	Image image7 = new Image(getClass().getResourceAsStream("/contents/Goat.jpg"));
	Image image8 = new Image(getClass().getResourceAsStream("/contents/Hen.jpg"));
	Image image9 = new Image(getClass().getResourceAsStream("/contents/IceCream.jpg"));
	Image image10 = new Image(getClass().getResourceAsStream("/contents/Jug.jpg"));
	Image image11 = new Image(getClass().getResourceAsStream("/contents/Kite.jpg"));
	Image image12 = new Image(getClass().getResourceAsStream("/contents/Lion.jpg"));
	Image image13 = new Image(getClass().getResourceAsStream("/contents/Monkey.jpg"));
	Image image14 = new Image(getClass().getResourceAsStream("/contents/Nest.jpg"));
	Image image15 = new Image(getClass().getResourceAsStream("/contents/Orange.jpg"));
	Image image16 = new Image(getClass().getResourceAsStream("/contents/Parrot.jpg"));
	Image image17 = new Image(getClass().getResourceAsStream("/contents/Queen.jpg"));
	Image image18 = new Image(getClass().getResourceAsStream("/contents/Rabbit.jpg"));
	Image image19 = new Image(getClass().getResourceAsStream("/contents/Ship.jpg"));
	Image image20 = new Image(getClass().getResourceAsStream("/contents/Tiger.jpg"));
	Image image21 = new Image(getClass().getResourceAsStream("/contents/Umbrella.jpg"));
	Image image22 = new Image(getClass().getResourceAsStream("/contents/Van.jpg"));
	Image image23 = new Image(getClass().getResourceAsStream("/contents/Watch.jpg"));
	Image image24 = new Image(getClass().getResourceAsStream("/contents/Xylophone.jpg"));
	Image image25 = new Image(getClass().getResourceAsStream("/contents/Yak.jpg"));
	Image image26 = new Image(getClass().getResourceAsStream("/contents/Zebra.jpg"));

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		songs= new ArrayList<File>();
		
		directory= new File("audio");
		
		files = directory.listFiles();
		
		if (files != null) {
			for (File file : files) {
				
				songs.add(file);
				System.out.println(file);
				}
			media = new Media(songs.get(AlfaNumber).toURI().toString());
			mediaPlayer= new MediaPlayer(media);
		}
	}
	public void playAudio() {
		mediaPlayer.play();
		mediaPlayer.seek(Duration.seconds(0));
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
	 case 6:
		 pronounce.setText("F - एफ (eff)");
		 example.setImage(image6);
		 break;
	 case 7:
		 pronounce.setText("G - जी (jee)");
		 example.setImage(image7);
		 break;
	 case 8:
		 pronounce.setText("H - एच (eich)");
		 example.setImage(image8);
		 break;
	 case 9:
		 pronounce.setText("I - आई (aai)");
		 example.setImage(image9);
		 break;
	 case 10:
		 pronounce.setText("J - जे (jay)");
		 example.setImage(image10);
		 break;
	 case 11:
		 pronounce.setText("K - के (kay)");
		 example.setImage(image11);
		 break;
	 case 12:
		 pronounce.setText("L - एल (el)");
		 example.setImage(image12);
		 break;
	 case 13:
		 pronounce.setText("M - एम (em)");
		 example.setImage(image13);
		 break;
	 case 14:
		 pronounce.setText("N - एन (en)");
		 example.setImage(image14);
		 break;
	 case 15:
		 pronounce.setText("O - ओ (oh)");
		 example.setImage(image15);
		 break;
	 case 16:
		 pronounce.setText("P - पी (pee)");
		 example.setImage(image16);
		 break;
	 case 17:
		 pronounce.setText("Q - क्यू (kyoo)");
		 example.setImage(image17);
		 break;
	 case 18:
		 pronounce.setText("R - आर (aar)");
		 example.setImage(image18);
		 break;
	 case 19:
		 pronounce.setText("S - एस (es)");
		 example.setImage(image19);
		 break;
	 case 20:
		 pronounce.setText("T - टी (tee)");
		 example.setImage(image20);
		 break;
	 case 21:
		 pronounce.setText("U - यू (yoo))");
		 example.setImage(image21);
		 break;
	 case 22:
		 pronounce.setText("V - वी (vee)");
		 example.setImage(image22);
		 break;
	 case 23:
		 pronounce.setText("W - डब्ल्यू (double you)");
		 example.setImage(image23);
		 break;
	 case 24:
		 pronounce.setText("X - एक्स (eks)");
		 example.setImage(image24);
		 break;
	 case 25:
		 pronounce.setText("Y - वाई (wai)");
		 example.setImage(image25);
		 break;
	 case 26:
		 pronounce.setText("Z - जेड (zed)");
		 example.setImage(image26);
		 break;
	 }
}
public void next(ActionEvent event) {
if (counter==26) {
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
	if (AlfaNumber < songs.size()+1) {
		
		AlfaNumber++;
		
		mediaPlayer.stop();
		media = new Media(songs.get(AlfaNumber).toURI().toString());
		mediaPlayer= new MediaPlayer(media);
		}
	else{
			
			AlfaNumber=0;
			
			mediaPlayer.stop();
			media = new Media(songs.get(AlfaNumber).toURI().toString());
			mediaPlayer= new MediaPlayer(media);
	}
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
	if (AlfaNumber > 0) {
		
		AlfaNumber--;
		
		mediaPlayer.stop();
		media = new Media(songs.get(AlfaNumber).toURI().toString());
		mediaPlayer= new MediaPlayer(media);
		}
	else{
			AlfaNumber=songs.size()-1;
			
			mediaPlayer.stop();
			media = new Media(songs.get(AlfaNumber).toURI().toString());
			mediaPlayer= new MediaPlayer(media);
	}
	start();
	english();
	hindi();
	}
}
	@FXML
	void getback(ActionEvent event) throws IOException{
	counter=0;
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
	 case 6:
		 info.setText("Position in Alphabet: 6th. \n Phonetic Pronunciation: /ɛf/");
		 break;
	 case 7:
		 info.setText("Position in Alphabet: 7th. \t Phonetic Pronunciation: /dʒi");
		 break;
	 case 8:
		 info.setText("Position in Alphabet: 8th. \t Phonetic Pronunciation: /eɪʧ/ ");
		 break;
	 case 9:
		 info.setText("Position in Alphabet: 9th. \t Phonetic Pronunciation: /aɪ/ ");
		 break;
	 case 10:
		 info.setText("Position in Alphabet: 10th. \t Phonetic Pronunciation: /dʒeɪ/");
		 break;
	 case 11:
	 	info.setText("Position in Alphabet: 11th. \t Phonetic Pronunciation: /keɪ/");
	 	break;
	 case 12:
		 info.setText("Position in Alphabet: 12th. \n Phonetic Pronunciation: /ɛl/");
		 break;
	 case 13:
		 info.setText("Position in Alphabet: 13th. \t Phonetic Pronunciation: /ɛm/");
		 break;
	 case 14:
		 info.setText("Position in Alphabet: 14th. \t Phonetic Pronunciation: /ɛn/ ");
		 break;
	 case 15:
		 info.setText("Position in Alphabet: 15th. \t Phonetic Pronunciation: /oʊ/");
		 break;
	 case 16:
		 info.setText("Position in Alphabet: 16th. \t Phonetic Pronunciation: /pi/");
		 break;
	 case 17:
		 info.setText("Position in Alphabet: 17th. \t Phonetic Pronunciation: /kju/");
		 break;
	 case 18:
		 info.setText("Position in Alphabet: 18th. \t Phonetic Pronunciation: /ɑr/");
		 break;
	 case 19:
		 info.setText("Position in Alphabet: 19th. \n Phonetic Pronunciation: /ɛs/");
		 break;
	 case 20:
		 info.setText("Position in Alphabet: 20th. \t Phonetic Pronunciation: /ti/");
		 break;
	 case 21:
		 info.setText("Position in Alphabet: 21st. \t Phonetic Pronunciation: /ju/ ");
		 break;
	 case 22:
		 info.setText("Position in Alphabet: 22nd. \t Phonetic Pronunciation: /vi/");
		 break;
	 case 23:
		 info.setText("Position in Alphabet: 23rd. \t Phonetic Pronunciation: /dʌblju/");
		 break;
	case 24:
		 info.setText("Position in Alphabet: 24th. \t Phonetic Pronunciation: /ɛks/");
		 break;
	case 25:
		 info.setText("Position in Alphabet: 25th. \t Phonetic Pronunciation: /waɪ/");
		 break;
	case 26:
		 info.setText("Position in Alphabet: 26th. \t Phonetic Pronunciation: /zɛd/");
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
	 case 6:
		 info.setText("वर्णमाला में स्थान: छठा | \t ध्वनिक उच्चारण: /एफ/");
		 break;
	 case 7:
		 info.setText("वर्णमाला में स्थान: सातवाँ | \t ध्वनिक उच्चारण: /जी/");
		 break;
	 case 8:
		 info.setText("वर्णमाला में स्थान: आठवाँ | \t ध्वनिक उच्चारण: /एच/");
		 break;
	 case 9:
		 info.setText("वर्णमाला में स्थान: नौवाँ | \t ध्वनिक उच्चारण: /आई/");
		 break;
	 case 10:
		 info.setText("वर्णमाला में स्थान: दसवाँ | \t ध्वनिक उच्चारण: /जे/");
		 break;
	 case 11:
		 info.setText("वर्णमाला में स्थान: ग्यारहवाँ | \t ध्वनिक उच्चारण: /के/");
		 break;
	 case 12:
		 info.setText("वर्णमाला में स्थान: बारहवाँ | \t ध्वनिक उच्चारण: /एल/");
 		 break;
 	 case 13:
 		 info.setText("वर्णमाला में स्थान: तेरहवाँ | \t ध्वनिक उच्चारण: /एम/");
 		 break;
 	 case 14:
 		 info.setText("वर्णमाला में स्थान: चौदहवाँ | \t ध्वनिक उच्चारण: /एन/");
 		 break;
 	 case 15:
 		 info.setText("वर्णमाला में स्थान: पंद्रहवाँ | \t ध्वनिक उच्चारण: /ओ/");
 		 break;
 	 case 16:
 		 info.setText("वर्णमाला में स्थान: सोलहवाँ | \t ध्वनिक उच्चारण: /पी/");
 		 break;
 	case 17:
 		info.setText("वर्णमाला में स्थान: सत्रहवाँ | \t ध्वनिक उच्चारण: /क्यू/");
 		break;
 	case 18:
 		info.setText("वर्णमाला में स्थान: अठारहवाँ | \t ध्वनिक उच्चारण: /आर/");
 		break;
 	 case 19:
		 info.setText("वर्णमाला में स्थान: उन्नीसवाँ | \t ध्वनिक उच्चारण: /एस/");
		 break;
	 case 20:
		 info.setText("वर्णमाला में स्थान: बीसवा | \t ध्वनिक उच्चारण: /टी/");
		 break;
	 case 21:
		 info.setText("वर्णमाला में स्थान: इक्कीसवा | \t ध्वनिक उच्चारण: /यू/");
		 break;
	 case 22:
		 info.setText("वर्णमाला में स्थान: बाईसवा | \t ध्वनिक उच्चारण: /वी/");
		 break;
	 case 23:
		 info.setText("वर्णमाला में स्थान: तेइसवा | \t ध्वनिक उच्चारण: /डब्ल्यू/");
		 break;
	case 24:
		 info.setText("वर्णमाला में स्थान: चौबीसवा | \t ध्वनिक उच्चारण: /एक्स/");
		 break;
	case 25:
		 info.setText("वर्णमाला में स्थान: पच्चीसवा | \t ध्वनिक उच्चारण: /वाई/");
		 break;
	case 26:
		 info.setText("वर्णमाला में स्थान: छब्बीसवा | \t ध्वनिक उच्चारण: /ज़ेड/");
		 break;
	 }
	}
}
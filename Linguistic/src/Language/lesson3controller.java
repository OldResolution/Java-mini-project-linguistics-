package Language;

<<<<<<< HEAD
import java.io.IOException;
import java.net.URL;
=======
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
>>>>>>> savin
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
<<<<<<< HEAD
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
=======
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class lesson3controller implements Initializable {

    @FXML
    public TextField pronounce;

    @FXML
    public Label info;

    @FXML
    public ImageView audiocontrol, example;

    @FXML
    public Button menu, last, next, english, hindi;

    static int counter = 1;
	
    private File directory;
	private File[] files;
	
	private ArrayList<File> songs;
	
	private int Numero;
	
	private Media media;
	private MediaPlayer mediaPlayer;
	
    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	songs= new ArrayList<File>();
		
		directory= new File("phrases");
		
		files = directory.listFiles();
		
		if (files != null) {
			for (File file : files) {
				
				songs.add(file);
				System.out.println(file);
				}
			media = new Media(songs.get(Numero).toURI().toString());
			mediaPlayer= new MediaPlayer(media);
    }
    }
    public void playAudio() {
		mediaPlayer.play();
		mediaPlayer.seek(Duration.seconds(0));
	}
    public void next(ActionEvent event) {
        if (counter == 7) {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
			if (Numero < songs.size()+1) {
				
				Numero++;
				
				mediaPlayer.stop();
				media = new Media(songs.get(Numero).toURI().toString());
				mediaPlayer= new MediaPlayer(media);
				}
			else{
					
					Numero=0;
					
					mediaPlayer.stop();
					media = new Media(songs.get(Numero).toURI().toString());
					mediaPlayer= new MediaPlayer(media);
			}
            english();
            hindi();
        }
    }

    public void last(ActionEvent event) {
        if (counter == 1) {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter--;
			if (Numero > 0) {
				
				Numero--;
				
				mediaPlayer.stop();
				media = new Media(songs.get(Numero).toURI().toString());
				mediaPlayer= new MediaPlayer(media);
				}
			else{
					
					Numero= songs.size()-1;
					
					mediaPlayer.stop();
					media = new Media(songs.get(Numero).toURI().toString());
					mediaPlayer= new MediaPlayer(media);
			}
            english();
            hindi();
        }
    }

    @FXML
    void getback(ActionEvent event) throws IOException {
    	counter=1;
        Parent root = FXMLLoader.load(getClass().getResource("lesson.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void english() {
        switch (counter) {
            case 1:
                info.setText("Hi, my name is [Your Name].");
                break;
            case 2:
                info.setText("Nice to meet you. I'm [Your Name]");
               break;
            case 3:
                info.setText("Currently, I reside in [Your Current City].");
                break;
            case 4:
                info.setText("I'm passionate about [Your Passion or Interests].");
                break;
            case 5:
                info.setText("I have a strong interest in [Your Area of Interest].");
                break;
            case 6:
                info.setText("One interesting fact about me is [Share a Fun Fact].");
                break;
            case 7:
                info.setText("I'm looking forward to getting to know all of you better.");
                break;
        }
    }

    public void hindi() {
        switch (counter) {
            case 1:
                info.setText("नमस्ते, मेरा नाम [आपका नाम] है।");
                break;
            case 2:
                info.setText("आपसे मिलकर अच्छा लगा। मैं [आपका नाम] हूं");
                break;
            case 3:
                info.setText("वर्तमान में, मैं [आपके वर्तमान शहर] में रहता हूँ।");
                break;
            case 4:
                info.setText("मैं [आपके जुनून या रुचियों] को लेकर उत्साहित हूं।");
                break;
            case 5:
                info.setText("मुझे [आपकी रुचि के क्षेत्र] में गहरी रुचि है।");
                break;
            case 6:
                info.setText("मेरे बारे में एक दिलचस्प तथ्य है [एक मजेदार तथ्य साझा करें]।");
                break;
            case 7:
                info.setText("मैं आप सभी को बेहतर तरीके से जानने का इंतजार कर रहा हूं।");
                break;
        }
    }
>>>>>>> savin
}
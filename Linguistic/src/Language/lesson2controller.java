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

public class lesson2controller implements Initializable{
	
	private File directory;
	private File[] files;
	
	private ArrayList<File> songs;
	
	private int Numero;
	
	private Media media;
	private MediaPlayer mediaPlayer;
	
	@FXML
	public TextField pronounce;
	
	@FXML
	public ImageView audiocontrol,example;
	
	@FXML
	public Button menu,last,next,audio;
	
	static int counter = 0;
	
	private Stage stage;
	private Scene scene;
	

	@FXML
	Image image1 = new Image(getClass().getResourceAsStream("/numbers/one.jpg"));
	Image image2 = new Image(getClass().getResourceAsStream("/numbers/2.jpg"));
	Image image3 = new Image(getClass().getResourceAsStream("/numbers/3.jpg"));
	Image image4 = new Image(getClass().getResourceAsStream("/numbers/4.jpg"));
	Image image5 = new Image(getClass().getResourceAsStream("/numbers/5.jpg"));
	Image image6 = new Image(getClass().getResourceAsStream("/numbers/6.jpg"));
	Image image7 = new Image(getClass().getResourceAsStream("/numbers/7.jpg"));
	Image image8 = new Image(getClass().getResourceAsStream("/numbers/8.jpg"));
	Image image9 = new Image(getClass().getResourceAsStream("/numbers/9.jpg"));
	Image image10 = new Image(getClass().getResourceAsStream("/numbers/10.jpg"));
	Image image11 = new Image(getClass().getResourceAsStream("/numbers/11.jpg"));
	Image image12 = new Image(getClass().getResourceAsStream("/numbers/12.jpg"));
	Image image13 = new Image(getClass().getResourceAsStream("/numbers/13.jpg"));
	Image image14 = new Image(getClass().getResourceAsStream("/numbers/14.jpg"));
	Image image15 = new Image(getClass().getResourceAsStream("/numbers/15.jpg"));
	Image image16 = new Image(getClass().getResourceAsStream("/numbers/16.jpg"));
	Image image17 = new Image(getClass().getResourceAsStream("/numbers/17.jpeg"));
	Image image18 = new Image(getClass().getResourceAsStream("/numbers/18.jpg"));
	Image image19 = new Image(getClass().getResourceAsStream("/numbers/19.jpg"));
	Image image20 = new Image(getClass().getResourceAsStream("/numbers/20.jpg"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { 
		songs= new ArrayList<File>();
		
		directory= new File("number");
		
		files = directory.listFiles();
		
		if (files != null) {
			for (File file : files) {
				
				songs.add(file);
				System.out.println(file);
				}
			media = new Media(songs.get(Numero).toURI().toString());
			mediaPlayer= new MediaPlayer(media);
		}
	}public void playAudio() {
		mediaPlayer.play();
		mediaPlayer.seek(Duration.seconds(0));
	}
	
	 public void start(){
		 switch (counter) {
		 case 1:
			 pronounce.setText("2 - २) - Two");
			 example.setImage(image2);
			 break;
		 case 2:
			 pronounce.setText("3 - ३) - Three");
			 example.setImage(image3);
			 break;
		 case 3:
			 pronounce.setText("4 - ४) - Four");
			 example.setImage(image4);
			 break;
		 case 4:
			 pronounce.setText("5 - ५) - Five");
			 example.setImage(image5);
			 break;
		 case 5:
			 pronounce.setText("6 - ६) - Six");
			 example.setImage(image6);
			 break;
		 case 6:
			 pronounce.setText("7 - ७) - Seven");
			 example.setImage(image7);
			 break;
		 case 7:
			 pronounce.setText("8 - ८) - Eight");
			 example.setImage(image8);
			 break;
		 case 8:
			 pronounce.setText("9 - ९) - Nine");
			 example.setImage(image9);
			 break;
		 case 9:
			 pronounce.setText("10 - १०) - Ten");
			 example.setImage(image10);
			 break;
		 case 10:
			 pronounce.setText("11 - ११) - Eleven");
			 example.setImage(image11);
			 break;
		 case 11:
			 pronounce.setText("12 - १२) - Twelve");
			 example.setImage(image12);
			 break;
		 case 12:
			 pronounce.setText("13 - १३) - Thirteen");
			 example.setImage(image13);
			 break;
		 case 13:
			 pronounce.setText("14 - १४) - Fourteen");
			 example.setImage(image14);
			 break;
		 case 14:
			 pronounce.setText("15 - १५) - Fifteen");
			 example.setImage(image15);
			 break;
		 case 15:
			 pronounce.setText("16 - १६) - Sixteen");
			 example.setImage(image16);
			 break;
		 case 16:
			 pronounce.setText("17 - १७) - Seventeen");
			 example.setImage(image17);
			 break;
		 case 17:
			 pronounce.setText("18 - १८) - Eighteen");
			 example.setImage(image18);
			 break;
		 case 18:
			 pronounce.setText("19 - १९) - Nineteen");
			 example.setImage(image19);
			 break;
		 case 19:
			 pronounce.setText("20 - २०) - Twenty");
			 example.setImage(image20);
		 }
	 }
	 
	 public void next(ActionEvent event) {
		if (counter==19) {
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
			start();
			}
		}
		public void last(ActionEvent event) {
		if (counter==0	) {
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
			start();
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
}
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
    public ImageView audiocontrol, example;

    @FXML
    public Button menu, last, next, english, hindi;

    static int counter = 0;

    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        english();
        hindi();
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
            english();
            hindi();
        }
    }

    @FXML
    void getback(ActionEvent event) throws IOException {
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
}

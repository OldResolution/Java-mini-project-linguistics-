package Language;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class quizcontroller {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;
    
    private Stage stage;
    private Scene scene;


    @FXML
    private void initialize() {
        loadQuestions();
    }
    

    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText("1. How many letters are there in the English alphabet?");
            opt1.setText("25");
            opt2.setText("27");
            opt3.setText("21");
            opt4.setText("26");
        }
        if (counter == 1) { //Question 2
            question.setText("2. What is the first letter of the English alphabet?");
            opt1.setText("B");
            opt2.setText("Z");
            opt3.setText("A");
            opt4.setText("D");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Which letter comes after 'B' in English alphabet?");
            opt1.setText("A");
            opt2.setText("D");
            opt3.setText("H");
            opt4.setText("C");
        }
        if (counter == 3) { //Question 4
            question.setText("4. What is the last letter of the english alphbets?");
            opt1.setText("G");
            opt2.setText("Z");
            opt3.setText("M");
            opt4.setText("A");
        }
        if (counter == 4) {//Question 5
            question.setText("5. What is the fifth letter in the english alphabets?");
            opt1.setText("E");
            opt2.setText("X");
            opt3.setText("Z");
            opt4.setText("A");
        }
        if (counter == 5) { //Question 6
            question.setText("6. What is the middle letter in the english alphabets ?");
            opt1.setText("G");
            opt2.setText("M");
            opt3.setText("N");
            opt4.setText("I");
        }
        if (counter == 6) { //Question 7
            question.setText("7. what comes before 'Z' in english alphabets ?");
            opt1.setText("Y");
            opt2.setText("W");
            opt3.setText("X");
            opt4.setText("U");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Fill in the blank 'P_R'");
            opt1.setText("Q");
            opt2.setText("S");
            opt3.setText("T");
            opt4.setText("O");
        }
        if (counter == 8) { //Question 9
            question.setText("9.  Fill in the blank 'H_J'");
            opt1.setText("G");
            opt2.setText("K");
            opt3.setText("L");
            opt4.setText("I");
        }
        if (counter == 9) { //Question 10
            question.setText("10.  Fill in the blank 'U_W'");
            opt1.setText("X");
            opt2.setText("y");
            opt3.setText("V");
            opt4.setText("T");
        }

    }
@FXML
public void opt1clicked(ActionEvent event) {
    checkAnswer(opt1.getText().toString());
    if (checkAnswer(opt1.getText().toString())) {
        correct = correct + 1;
    } else {
        wrong = wrong + 1;
    }
    if (counter == 9) {
        try {
            System.out.println(correct);
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    } else {
        counter++;
        loadQuestions();
    }

}

boolean checkAnswer(String answer) {

    if (counter == 0) {
        if (answer.equals("26")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 1) {
        if (answer.equals("A")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 2) {
        if (answer.equals("C")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 3) {
        if (answer.equals("Z")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 4) {
        if (answer.equals("E")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 5) {
        if (answer.equals("M")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 6) {
        if (answer.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 7) {
        if (answer.equals("Q")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 8) {
        if (answer.equals("I")) {
            return true;
        } else {
            return false;
        }
    }
    if (counter == 9) {
        if (answer.equals("V")) {
            return true;
        } else {
            return false;
        }
    }
    return false;


}

@FXML
public void opt2clicked(ActionEvent event) {
    checkAnswer(opt2.getText().toString());
    if (checkAnswer(opt2.getText().toString())) {
        correct = correct + 1;
    } else {
        wrong = wrong + 1;
    }
    if (counter == 9) {
        try {
            System.out.println(correct);
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    } else {
        counter++;
        loadQuestions();
    }
}

@FXML
public void opt3clicked(ActionEvent event) {
    checkAnswer(opt3.getText().toString());
    if (checkAnswer(opt3.getText().toString())) {
        correct = correct + 1;
    } else {
        wrong = wrong + 1;
    }
    if (counter == 9) {
        try {
            System.out.println(correct);
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    } else {
        counter++;
        loadQuestions();
    }
}

@FXML
public void opt4clicked(ActionEvent event) {
    checkAnswer(opt4.getText().toString());
    if (checkAnswer(opt4.getText().toString())) {
        correct = correct + 1;
    } else {
        wrong = wrong + 1;
    }
    if (counter == 9) {
        try {
            System.out.println(correct);
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    } else {
        counter++;
        loadQuestions();
    }
}

@FXML
void Goback(ActionEvent event) throws IOException {
	counter=0;
	correct=0;
	wrong=0;
	Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
}
@FXML
void OpenReport(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("ReportFeature.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
}
}


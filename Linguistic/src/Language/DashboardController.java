
package Language;

import java.io.IOException;
import java.math.BigDecimal;
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
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class DashboardController implements Initializable {

    @FXML
    private Button dashboard;
    @FXML
    private Button coursesButton;
    @FXML
    private Button lessons;
    @FXML
    private Button quizzes;
    @FXML
    private Button reports;
    @FXML
    private Button LogoutButton;
    @FXML
    private Label welcomelabel;
    @FXML
    private ProgressIndicator QuizzesPB;
    @FXML
    private ProgressBar CoursePB;
    @FXML
    private ProgressBar LessonsPB;
    
    private Stage stage;
    private Scene scene;
    double progress1,progress2,progress3,progress4;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    public void increaseprogress() {
    	progress1=resultcontroller.progress1;
    	progress2=LessonController.progress1;
    	progress3=resultcontroller.progress2;
    	progress4=LessonController.progress2;
    	QuizzesPB.setProgress(progress3);
    	CoursePB.setProgress(progress1+progress4);
    	LessonsPB.setProgress(progress2);
    }
    @FXML
    void OpenCourses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("courses.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

    @FXML
    void OpenLessons(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("lesson.fxml"));
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
    @FXML
    void LogoutAction(ActionEvent event) throws IOException {
    	progress1=0;
    	progress2=0;
    	progress3=0;
    	progress4=0;
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
    @FXML
    void OpenQuiz(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("QuizPage.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();       
    }
}
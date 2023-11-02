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
import javafx.stage.Stage;


public class CourseController extends DashboardController{
    private Stage stage;
    private Scene scene;

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
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
    @FXML
    void OpenProfile(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
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
    @FXML
    void OpenQL(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("QLpage.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    } 
    }

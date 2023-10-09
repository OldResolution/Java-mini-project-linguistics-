
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    @FXML
    void OpenCourses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("course.fxml"));
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
    void LogoutAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
    
}

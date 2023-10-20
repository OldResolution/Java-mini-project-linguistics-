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
import javafx.stage.Stage;

public class ReportController implements Initializable{
	 private Stage stage;
	    private Scene scene;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
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
    @FXML
    void OpenQuiz(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("QuizPage.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }
}


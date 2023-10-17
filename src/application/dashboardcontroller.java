package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class dashboardcontroller{
	@FXML
	private Button LogoutButton;
	@FXML
	private Label welcomelabel;
	@FXML
	private ProgressBar CoursePB;
	@FXML
	private ProgressBar LessonsPB;
	@FXML
	private ProgressIndicator QuizzesPB;
}
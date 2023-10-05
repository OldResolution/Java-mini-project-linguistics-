package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class logincontroller implements Initializable {
	TextField textField = new TextField();
	String text = textField.getText();

	@FXML
	private Button loginButton;
	@FXML
	private Button SignupPageButton;
	@FXML
	private Button cancelButton;
	@FXML
	private TextField usernameTextField;
	@FXML
	private TextField PwdField;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		loginButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				DBUtils.LoginUser(event, usernameTextField.getText(), PwdField.getText());
				
			}
			
		});
	
		SignupPageButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				DBUtils.changeScene(event, "Signup.fxml","SignUp", null);
			}
			
		});
		
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				DBUtils.closeScene(event);
			}
			
		});
	}
}

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Signupcontroller implements Initializable{
	@FXML
	private Button SignupButton;
	@FXML
	private Button loginpageButton;
	@FXML
	private TextField passwordTextfield;
	@FXML
	private TextField usernameTextField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		SignupButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				DBUtils.LoginUser(event, usernameTextField.getText(), passwordTextfield.getText());
			}
			
		});
		
		loginpageButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				DBUtils.changeScene(event, "login.fxml","Login", null);
			}
			
		});
		
	}

}

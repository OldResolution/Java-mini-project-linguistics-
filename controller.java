package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class controller{
	@FXML
	private Button cancelButton;
	@FXML 
	private Label loginmessagelabel;
	@FXML 
	private TextField usernameTextField; 
	@FXML 
	private PasswordField passwordPasswordField;
	 
	public void loginButtonOnAction(ActionEvent e) {
		loginmessagelabel.setText("you tried to login");
		if(usernameTextField.getText().isBlank()==false && passwordPasswordField.getText().isBlank()==false) {
			
			loginmessagelabel.setText("you tried to login");
		}else {
			loginmessagelabel.setText("Please enter username and password");
		}
	}
	
	
	public void cancelButtonOnAction(ActionEvent e) {
		Stage stage =(Stage) cancelButton.getScene().getWindow();
        stage.close();	
	}
}


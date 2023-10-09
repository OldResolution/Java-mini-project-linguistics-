package Language;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField UserField;
    @FXML
    private PasswordField PassField;
    
    @FXML
    private Button cancelButton;
    
    //@FXML
    //private TextField passwordTextField;

    //@FXML
    //private TextField usernameTextField;
    
    public void CancelAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void LoginAction(ActionEvent event) {
        String username = UserField.getText();
        String password = PassField.getText();

        // Database connection
        String Url = "jdbc:mysql://localhost:3306/language";
        String DBUser = "root";
        String DBPassword = "joshua123";

        try (Connection connection = DriverManager.getConnection(Url, DBUser, DBPassword)) {
            String query = "SELECT * FROM login WHERE Username = ? AND Password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } else {
                        showError("Login Failed", "Invalid user/password");
                    }
                }
            }
        } catch (SQLException e) {
            // Handle database connection or query errors
            e.printStackTrace();
            showError("Database Error", "An error occurred while accessing the database.");
        } catch (IOException e) {
            // Handle FXML loading errors
            e.printStackTrace();
            showError("FXML Loading Error", "An error occurred while loading the FXML file.");
        }
    }


    public void OpenSignupAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Helper method to display error messages
    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

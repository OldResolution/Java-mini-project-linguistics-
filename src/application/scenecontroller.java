package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class scenecontroller {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToLoginPage(ActionEvent event) throws IOException{         // to switch the scene to dashboard
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSign(ActionEvent event) throws IOException{         // to switch the scene to dashboard
        root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDashBoard(ActionEvent event) throws IOException{         // to switch the scene to dashboard
        root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchTocourse(ActionEvent event) throws IOException{        // to switch the scene to transaction
        root = FXMLLoader.load(getClass().getResource("course.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToLessons(ActionEvent event) throws IOException{        // to switch the scene to add transaction
        root = FXMLLoader.load(getClass().getResource("lessons.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToQuiz(ActionEvent event) throws IOException{        // to switch the scene to edit transaction
        root = FXMLLoader.load(getClass().getResource("Quizzes.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToreport(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ReportFeature.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void Logout(ActionEvent event) throws IOException {
    	stage.close();
    }
    @FXML
    private TextField tfSignUser;

    @FXML
    private PasswordField tfSignPass;

    @FXML
    private PasswordField tfSignPass1;

    @FXML
    void createAcc(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException{
        String signUser = tfSignUser.getText();
        String signpass = tfSignPass.getText();
        String signpass2 = tfSignPass1.getText();
        int status =0;
        if(signpass.compareTo(signpass2)==0){
            if((signUser.length()==0)||(signpass.length()==0)){
                alertscontroller.Handle2();
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "oracle");
            PreparedStatement ps = con.prepareStatement("insert into User (Username, Password) values('"+signUser+"', '"+signpass+"');");
            status = ps.executeUpdate();//to execute that statement
            switchToLoginPage(event);
            con.close();

        }
        else if((signUser.length()==0)||(signpass.length()==0)){
        	alertscontroller.Handle2();
        }
        else{
        	alertscontroller.wrongPass();
        }
        if(status!=0){
            System.out.println("database was connected");
            System.out.println("record was inserted");
        }
    }

    //inputs of login page
    @FXML
    private TextField tfEmail;

    @FXML
    private PasswordField tfPass;

    @FXML
    void btnClicked(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
        // checks the login is valid or not
        String email = tfEmail.getText();
        String pass = tfPass.getText();
//        System.out.println(AlertConnector.checkLogin1(email, pass));
        if(alertscontroller.checkLogin1(email, pass)){
            switchToDashBoard(event);
            System.out.println("true");
        }
    }
}
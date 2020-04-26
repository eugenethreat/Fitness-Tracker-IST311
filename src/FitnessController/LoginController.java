package FitnessController;

import FitnessModel.Login;
import FitnessModel.User;
import FitnessView.FitnessView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoginController extends AnchorPane implements Initializable {

    //public AnchorPane LoginController;

    Login login;

    private FitnessController.Main app;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public LoginController() {
    } //no-arg constructor for fxml loader method

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button loginButton;

    public void tryToLoginFX(ActionEvent event) {
        //System.out.println("cute thing ");

        String usernameString = getUsernameField().getText();
        String passwordString = getPasswordField().getText();

        //System.out.println(usernameString + passwordString);
        //testing output

        login = new Login();

        //User toTest = new User(usernameString, passwordString);
        //this needs to be the user with the matching username;

        ArrayList<User> a = Login.testUsers; //STATIC!
        //this is shit code that will be changed later
        User toTest = null;
        for(User u : a){
            if(usernameString.equals(u.getUsername())){
                toTest = u;
            }
        }//iterates through, seeing if the entered text matches a user



        boolean success = login.test(toTest);
        if (success) {
            //view.loggedIn(user);
            //System.out.println("success");
            System.out.println(toTest.getWorkout().getAllExercises().toString());
            app.setLoggedUser(toTest);
            app.gotoHome(toTest);

            //replace with method that changes scenes

        } else {
            //view.failed();
            System.out.println("failed");
            //replace with javafx that says that the login failed
        }

    }


    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }


    public void setApp(FitnessController.Main main) {
        this.app = main;
    }
}

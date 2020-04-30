package FitnessController;

import FitnessModel.Login;
import FitnessModel.User;

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

        User toTest = new User(usernameString, passwordString);
        //this is an arbitrayr user made of the entered credentials 
        
        boolean success = login.test(toTest);
        if (success) {
            //view.loggedIn(user);
            /*
            need totest to be one of the users from the static array
            so they have exercises for now ...
            */
            int index = 0;
            for(int i = 0 ; i < Login.testUsers.size() ; ++i){
                //get the index of th euesr 
                String usernameToMatch = toTest.getUsername();
                if(usernameToMatch.equals(Login.testUsers.get(i))) {
                    index = i;
                }
            }
            toTest = Login.testUsers.get(index);
            
            System.out.println("success");
            //System.out.println(toTest.getWorkout().getAllExercises().toString());
            app.setLoggedUser(toTest);
            app.goToHome(toTest);

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

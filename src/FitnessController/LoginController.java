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
import java.util.ResourceBundle;

public class LoginController extends AnchorPane implements Initializable {

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

        String usernameString = getUsernameField().getText();
        String passwordString = getPasswordField().getText();

  
        login = new Login();
        User toTest = new User(usernameString, passwordString);
        //arbitrary user with the temp credentials 
        
        boolean success = login.test(toTest);
        if (success) {       
            int index = 0;
            for(int i = 0 ; i < Login.testUsers.size() ; ++i){
                //get the index of the uesr 
                String usernameToMatch = toTest.getUsername();
                if(usernameToMatch.equals(Login.testUsers.get(i))) {
                    index = i;
                }
            } // shit garbage 
            
            toTest = Login.testUsers.get(index);
            /*
            sets toTest to the equivalent user from the static list
            so that exercises can be accessed; 
            
            this should be changed to anything else 
            */
            
            app.setLoggedUser(toTest);
            app.goToHome(toTest); 
            //goes to the home screen of the logged in user!  

        } else {
            //view.failed();
            System.out.println("Login failed");
            //replace with javafx that says that the login failed
        }

    }
    
    public void goToNewAccount(ActionEvent event){
        //goes about creating a new account and adding it. 
        
        /*
        needs to get a new username and password 
        needs to use the survey to get goals 
        create a workout 
        
        add everything to the database. 
        
        */
        System.out.println("in logincontroller");
        app.goToNewAccount();
        
        
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

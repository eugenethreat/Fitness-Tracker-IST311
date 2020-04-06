package FitnessController;

import FitnessModel.Login;
import FitnessModel.User;
import FitnessView.FitnessView;
import com.sun.tools.javac.Main;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController extends AnchorPane implements Initializable {

    //public AnchorPane LoginController;

    FitnessView view = new FitnessView();
    Login login;

    private Main app;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


    public LoginController(){
    }

    public void loggingIn() {
        login = new Login();
        view.welcomeScreen();
    }

    public void getUserChoice(int userChoice) {
        if (userChoice == 1) {
            view.login();
        } else if (userChoice == 2) {
            view.newUser();
        } else if (userChoice == 3) {
            view.exit();
        }
    }

    public void tryToLogIn(String user, String pw){
        User toTest = new User(user, pw);
        boolean success = login.test(toTest);
        if(success){
            view.loggedIn(user);
        } else{
            view.failed();
        }
    }




}

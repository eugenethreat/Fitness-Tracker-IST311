/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessController;

import FitnessModel.Callable;
import FitnessModel.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author eugene
 */
public class NewUserScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Main app;
    
    @FXML TextField usernameField;
    @FXML TextField passwordField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void getInfoSendToDb(){
        User newUser = new User(usernameField.getText(), passwordField.getText());
        Callable.createNewUser(newUser);
        
        System.out.println("got to getinfosenddb");
        
        
    }
    
    
    public void goToLogin(){
        app.goToLogin();
    }
    
    public void setApp(Main aThis) {
        app = aThis;
    }
    
    
    
}

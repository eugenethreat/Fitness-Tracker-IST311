/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessController;

import FitnessController.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author wilsonhaefner
 */
public class SelectExerciseController implements Initializable {
@FXML public Button Button1;
@FXML public Button Button2;
@FXML public Button Button3;
@FXML public Button Button4;
@FXML public Button Button5;
@FXML public Button Button6;

    private Main app;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
    public void setButton(){
        
     
    }
    
    public void setApp(FitnessController.Main main) {
        this.app = main;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessController;

import FitnessController.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author wilsonhaefner
 */
public class CreateAWorkoutController implements Initializable {
@FXML public Button Button1;
    private Main app;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void gotoExercise(ActionEvent event){
       
        app.gotoExercise();
    }
    
    public void setApp(FitnessController.Main main) {
        this.app = main;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depreciated;

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

    private Main app;

    @FXML Button absButton;
    @FXML Button bicepButton;
    @FXML Button backButton;
    @FXML Button cardioButton;
    @FXML Button chestButton;
    @FXML Button legsButton;
    @FXML Button tricepsButton;
    @FXML Button shoulderButton;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /* class that handles "Creating" the workout!
   */
    //need a method that gets the text of the clicked button and changes the text of the buttons accordingly

    //abs biceps back cardio chest legs triceps shouldess
    public void setSpecificButtons(ActionEvent event){
        String pressedButton = event.getSource().toString();
        String[] jankSplitString = pressedButton.split("]");

        //System.out.println(jankSplitString[1]);

        if(jankSplitString[1].equals("'Abs'")){
            goToExercise("Abs");
        } else if(jankSplitString[1].equals("'Back'")){
            goToExercise("Back");
        } else{
            System.out.println("not working");
        }//unit testing???

        //System.out.println(pressedButton);
        //goToExercise();
    }

    public void goToExercise(String type){
        app.goToSelectExercise(type);
    } //goes to the page that has the empty buttons with specific exercises per muscle group. the passed string is the muscle group.

    
    public void setApp(FitnessController.Main main) {
        app = main;
    }
}

package FitnessController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GoalSurveyController extends AnchorPane implements Initializable {

    private FitnessController.Main app;

    boolean weights = false;
    boolean cardio = false;

    @FXML
    Button weightliftButton;
    @FXML
    Button cardioButton;
    @FXML
    ComboBox levelBox;
    @FXML
    Button makePlanButton;
    String level;
    String[] possibleLevels = {"noob", "intermediate", "advanced"};


    public void onWeightButtonPress(ActionEvent event){
        weights = true;
        cardio = false;
        System.out.println("weights");
    }

    public void onCardioButtonPress(ActionEvent event){
        cardio = true;
        weights = false;
        System.out.println("cardio");
    }

    public void levelSelected(ActionEvent event){
        level = levelBox.getValue().toString();
        System.out.println(level);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        levelBox.getItems().setAll("noob", "intermediate", "advanced");
    }

    public GoalSurveyController(){

    }//no-arg constructor

    public void setApp(FitnessController.Main main) {
        app = main;
    }
    
    public void makePlan(ActionEvent event){
        app.goToCreateWorkout(cardio, level);
    }

}

/*




}

 */
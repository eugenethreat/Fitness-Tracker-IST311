package FitnessController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController extends AnchorPane implements Initializable {

    private Main app;

    @FXML
    Label usernameField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public HomepageController() {

    }//no-arg constructor

    public void goToSurvey(ActionEvent event) {
        app.goToSurvey();
    }

    public void goToWorkouts(ActionEvent event) {
        app.goToAllWorkouts();
    }

    public void goToDropDown(ActionEvent event) {
        app.goToDropDown();
    }
    
    public void goToProgression(ActionEvent event){
        app.goToProgression();
    }

    public void setUsernameField(String username) {
        usernameField.setText(username);
    }


    public void setApp(FitnessController.Main main) {
        this.app = main;
    }

}

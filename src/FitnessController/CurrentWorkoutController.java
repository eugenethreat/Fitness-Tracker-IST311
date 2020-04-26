package FitnessController;

import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CurrentWorkoutController extends AnchorPane implements Initializable {

    Main application;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setApp(FitnessController.Main main) {
        this.application = main;
    }

    public void gotoHome(){
        application.gotoHome();
    }




}



package FitnessController;

import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class goalSurvey extends AnchorPane implements Initializable {

    private FitnessController.Main app;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public goalSurvey(){

    }//no-arg constructor

    public void setApp(FitnessController.Main main) {
        app = main;
    }

}

/*




}

 */
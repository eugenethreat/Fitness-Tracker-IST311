/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessController;

import FitnessModel.Exercise;
import FitnessModel.User;
import FitnessModel.Workout;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author eugene
 */
public class ProgressionChartController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    LineChart progressionChart;

    Main app;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    User someUser;

    public AnchorPane setGraph(User loggedUser) {


        /*
           NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("No of employees");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Revenue per employee");
        
        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data(1, 567));
        dataSeries1.getData().add(new XYChart.Data(5, 612));
        dataSeries1.getData().add(new XYChart.Data(10, 800));
        dataSeries1.getData().add(new XYChart.Data(20, 780));
        dataSeries1.getData().add(new XYChart.Data(40, 810));
        dataSeries1.getData().add(new XYChart.Data(80, 850));

        progressionChart.getData().add(dataSeries1);
         */
        //duummy data
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("time");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("weight");
        progressionChart = new LineChart(xAxis, yAxis);

        XYChart.Series workoutData = new XYChart.Series<>();
        workoutData.setName("PROGRESSION");

        someUser = loggedUser;
        Workout workout = loggedUser.getWorkout();

        int time = 0;
        Exercise ex1 = workout.getAllExercises().get(1);
        int weight = ex1.getWeight();

        for (int i = 0; i < 3; ++i) {

            workoutData.getData().add(new XYChart.Data(time, weight));
            time = time + 10;
            weight = weight + 15;

        }
        progressionChart.getData().add(workoutData);

        AnchorPane pane = new AnchorPane(progressionChart);
        pane.setPrefSize(500, 800);
        
        Button returnButton = new Button("return");
        returnButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                app.goToHome();
            }}); //jank shit code for returning 
              
        pane.getChildren().add(returnButton);

        return pane;
    }

    public void setApp(Main application) {
        app = application;
    }

    public void goToHome() {
        app.goToHome();
    }

}

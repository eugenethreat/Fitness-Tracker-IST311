/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

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

    public void setGraph() {
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("No of employees");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Revenue per employee");

        progressionChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data(1, 567));
        dataSeries1.getData().add(new XYChart.Data(5, 612));
        dataSeries1.getData().add(new XYChart.Data(10, 800));
        dataSeries1.getData().add(new XYChart.Data(20, 780));
        dataSeries1.getData().add(new XYChart.Data(40, 810));
        dataSeries1.getData().add(new XYChart.Data(80, 850));

        progressionChart.getData().add(dataSeries1);
    }

    public void setApp(Main application) {
        app = application;
    }

    public void goToHome() {
        app.goToHome();
    }

}

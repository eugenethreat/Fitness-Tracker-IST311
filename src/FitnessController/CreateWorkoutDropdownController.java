/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author wilsonhaefner
 */


public class CreateWorkoutDropdownController extends AnchorPane implements Initializable {

    @FXML
    public ComboBox<String> exercise1Group;
    public ComboBox<String> exercise1Exercise;
    public ComboBox<String> exercise2Group;
    public ComboBox<String> exercise2Exercise;
    public ComboBox<String> exercise3Group;
    public ComboBox<String> exercise3Exercise;
    
    
    ObservableList<String> muscleGroupList = FXCollections.observableArrayList("", "Abs", "Biceps", "Back", "Cardio", "Chest", "Legs", "Shoulders", "Triceps");
    ObservableList<String> exerciseAbsList = FXCollections.observableArrayList("exercise1Abs", "exercise2Abs", "exercise3Abs", "exercise4Abs", "exercise5Abs");
    ObservableList<String> exerciseBicepsList = FXCollections.observableArrayList("exercise1Biceps", "exercise2Biceps", "exercise3Biceps", "exercise4Biceps", "exercise5Biceps");
    ObservableList<String> exerciseBackList = FXCollections.observableArrayList("exercise1Back", "exercise2Back", "exercise3Back", "exercise4Back", "exercise5Back");
    ObservableList<String> exerciseCardioList = FXCollections.observableArrayList("exercise1Cardio", "exercise2Cardio", "exercise3Cardio", "exercise4Cardio", "exercise5Cardio");
    ObservableList<String> exerciseChestList = FXCollections.observableArrayList("exercise1Chest", "exercise2Chest", "exercise3Chest", "exercise4Chest", "exercise5Chest");
    ObservableList<String> exerciseLegsList = FXCollections.observableArrayList("exercise1Legs", "exercise2Legs", "exercise3Legs", "exercise4Legs", "exercise5Legs");
    ObservableList<String> exerciseShouldersList = FXCollections.observableArrayList("exercise1Shoulders", "exercise2Shoulders", "exercise3Shoulders", "exercise4Shoulders", "exercise5Shoulders");
    ObservableList<String> exerciseTricepsList = FXCollections.observableArrayList("exercise1Triceps", "exercise2Triceps", "exercise3Triceps", "exercise4Triceps", "exercise5Triceps");
    
    private Main app;
    
    public void goBack(){
        app.goToHome();
    }
    
    public void saveWorkout(){
        
    }
    
    
    public void comboGroup1Changed(ActionEvent event){
       if("Abs".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseAbsList);
       }
       else if("Biceps".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseBicepsList);
       }
       else if("Back".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseBackList);
       }
       else if("Cardio".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseCardioList);
       }
       else if("Chest".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseChestList);
       }
       else if("Legs".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseLegsList);
       }
       else if("Shoulders".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseShouldersList);
       }
       else if("Triceps".equals(exercise1Group.getValue())){
           exercise1Exercise.setItems(exerciseTricepsList);
       }
       else{
           exercise1Exercise.setItems(null);
       }
       
    }
    
    public void comboGroup2Changed(ActionEvent event){
       if("Abs".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseAbsList);
       }
       else if("Biceps".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseBicepsList);
       }
       else if("Back".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseBackList);
       }
       else if("Cardio".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseCardioList);
       }
       else if("Chest".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseChestList);
       }
       else if("Legs".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseLegsList);
       }
       else if("Shoulders".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseShouldersList);
       }
       else if("Triceps".equals(exercise2Group.getValue())){
           exercise2Exercise.setItems(exerciseTricepsList);
       }
       else{
           exercise2Exercise.setItems(null);
       }
       
    }
    
    public void comboGroup3Changed(ActionEvent event){
       if("Abs".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseAbsList);
       }
       else if("Biceps".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseBicepsList);
       }
       else if("Back".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseBackList);
       }
       else if("Cardio".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseCardioList);
       }
       else if("Chest".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseChestList);
       }
       else if("Legs".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseLegsList);
       }
       else if("Shoulders".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseShouldersList);
       }
       else if("Triceps".equals(exercise3Group.getValue())){
           exercise3Exercise.setItems(exerciseTricepsList);
       }
       else{
           exercise3Exercise.setItems(null);
       }
       
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        exercise1Group.setItems(muscleGroupList);
        exercise2Group.setItems(muscleGroupList);
        exercise3Group.setItems(muscleGroupList);

    }    

    public void setApp(Main main) {
        this.app = main;
    }
    
}

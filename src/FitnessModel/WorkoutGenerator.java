/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author eugene
 */
public class WorkoutGenerator {

    boolean cardioOrWeights;
    String level;

    public WorkoutGenerator(boolean a, String b) {
        cardioOrWeights = a;
        //if true, cardio, if false weights 
        level = b;

    }//constructor

    ArrayList<String> cardioEasy = new ArrayList<>(Arrays.asList("EASY CARDIO EXERCISE"));
    ArrayList<String> cardioMed = new ArrayList<>(Arrays.asList("MEDIUM CARDIO EXERCISE"));
    ArrayList<String> cardioHard = new ArrayList<>(Arrays.asList("HARD CARDIO EXERCISE"));

    ArrayList<String> weightEasy = new ArrayList<>(Arrays.asList("EASY WEIGHT EXERCISE"));
    ArrayList<String> weightMed = new ArrayList<>(Arrays.asList("MEDIUM WEIGHT EXERCISE"));
    ArrayList<String> weightHard = new ArrayList<>(Arrays.asList("HARD WEIGHT EXERICSE"));

    public Workout makeWorkoutForNewUser() {
        //takes parameters and creates a new workout based off of them.

        Exercise ex1 = null;
        Exercise ex2 = null;
        Exercise ex3 = null;

        //    String[] possibleLevels = {"noob", "intermediate", "advanced"};

        
        Random random = new Random();
        int randomNum = random.nextInt(weightEasy.size());

        if (cardioOrWeights) {
            if (level.equals("easy")) {

            }
            if (level.equals("medium")) {

            }
            if (level.equals("hard")) {

            }//whatever these strings are..

        } else {
            //must be a weights plan
            if (level.equals("noob")) {
                ex1 = new Exercise(weightEasy.get(randomNum), 10, 10);
                ex2 = new Exercise(weightEasy.get(randomNum), 10, 10);
                ex3 = new Exercise(weightEasy.get(randomNum), 10, 10);

            }
            if (level.equals("intermediate")) {
                ex1 = new Exercise(weightEasy.get(randomNum), 20, 10);
                ex2 = new Exercise(weightEasy.get(randomNum), 20, 10);
                ex3 = new Exercise(weightEasy.get(randomNum), 20, 10);

            }
            if (level.equals("advanced")) {
                ex1 = new Exercise(weightEasy.get(randomNum), 30, 10);
                ex2 = new Exercise(weightEasy.get(randomNum), 30, 10);
                ex3 = new Exercise(weightEasy.get(randomNum), 30, 10);

            }//whatever these strings are..

        }
        
        Workout newWorkout = new Workout(ex1, ex2, ex3);
        
        return newWorkout;

    }

}

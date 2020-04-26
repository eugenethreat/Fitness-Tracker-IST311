package FitnessModel;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private Exercise ex1;
    private Exercise ex2;
    private Exercise ex3;
    //A workout is made of three exercises;

    public Workout(Exercise a, Exercise b, Exercise c) {
        ex1 = a;
        ex2 = b;
        ex3 = c;
    }

    public ArrayList<Exercise> getAllExercises() {
        return (new ArrayList<Exercise>(
                List.of(ex1, ex2, ex3)));
    }


}

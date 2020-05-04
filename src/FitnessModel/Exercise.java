package FitnessModel;

public class Exercise {
    private String name;
    private int weight;
    private int reps;

    public Exercise(String n, int w, int r){
        name = n;
        weight = r;
        reps = w;
    }
    //An exercise has a name, weight and reps.

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public int getReps(){
        return reps;
    }

}

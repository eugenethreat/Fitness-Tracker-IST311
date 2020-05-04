package FitnessModel;

public class User {
    private String username;
    private String password;
    private Workout workout;
    private int id; 

    public User(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWorkout(Workout w){
        this.workout = w;
    }

    public Workout getWorkout(){
        return workout;
    }
    
    public void setId(int i){
        this.id = i;
    }
    
    public int getId(){
        return this.id;
    }


}

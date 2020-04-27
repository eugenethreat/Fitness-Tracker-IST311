package depreciated.FitnessView;


public class FitnessView {

    //TODO: REMOVE SINCE NOW COVERED WITH FXML

    public void welcomeScreen() {
        System.out.println("welcome to our fitness app for IST311");
        System.out.println("select an option below by entering the corresponding number");
        System.out.println("1: login");
        System.out.println("2: create a new user");
        System.out.println("3: exit");
    }

    public void login() {
        System.out.println("1: Login");
        System.out.println("please enter username and password when prompted");
    }

    public void newUser() {
        System.out.println("TODO: NEW USER");
    }

    public void exit() {
        System.out.println("exiting!...");
    }


    public void loggedIn(String user) {
        System.out.println("Welcome, " + user + "!");
        System.out.println("from here, users will be able to view their workouts, view their progression, etc.");

        System.out.println("select an option: ");
        System.out.println("1: Setting goals and level:");

    }

    public void failed() {
        System.out.println("there was some sort of error!");
    }
}

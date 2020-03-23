package FitnessController;

import FitnessModel.Login;
import FitnessView.FitnessView;

public class FitnessController {

    FitnessView view = new FitnessView();
    Login login;

    public void loggingIn() {
        login = new Login();
        view.welcomeScreen();
    }

    public void getUserChoice(int userChoice) {
        if (userChoice == 1) {
            view.login();
        } else if (userChoice == 2) {
            view.newUser();
        } else if (userChoice == 3) {
            view.exit();
        }
    }


}

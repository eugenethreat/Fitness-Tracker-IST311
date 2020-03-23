package FitnessController;

import FitnessModel.User;
import FitnessModel.Login;
import FitnessView.FitnessView;

public class FitnessController {

    FitnessView view;


    public FitnessController() {

        User user = new User("nixxel", "dirtbag");
        Login login = new Login(user);
        login.test("nxxel", "di");


    }


}

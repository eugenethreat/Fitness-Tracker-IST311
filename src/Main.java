import FitnessController.FitnessController;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        FitnessController ft = new FitnessController();
        ft.loggingIn();

        int userChoice = scan.nextInt();
        ft.getUserChoice(userChoice);




    }
}

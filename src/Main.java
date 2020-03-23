import FitnessController.FitnessController;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        FitnessController ft = new FitnessController();
        ft.loggingIn();

        int userChoice = scan.nextInt();
        ft.getUserChoice(userChoice);

        if(userChoice == 1){
            scan.nextLine(); //clearing the buffer of any stray newline characters
            System.out.println("username");
            String username = scan.nextLine();
            System.out.println("password");
            String password = scan.nextLine();

            ft.tryToLogIn(username, password);
        }

    }

}

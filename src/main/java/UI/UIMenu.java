package UI;
import Utils.Logs.Logs;

import java.util.Scanner;
import static UI.UIAuthUser.authUserC;
import static UI.UIResgisterUser.registerUser;

public class UIMenu {
public static void showMenu() throws Exception {
    System.out.println("Welcome to the Menu");
    int response = 9;

    while(0 != response){
        System.out.println("Choose an Option");
        System.out.println("1.Login");
        System.out.println("2.Register User");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1 -> authUserC();
            case 2 -> registerUser();
            case 0 -> response=0;
            default -> Logs.toLog("Invalid Option at UIMenu");
        }
    }


   }
}




package UI;
import Model.UserDetails;
import Model.UserModel.User;

import java.util.Scanner;
import static Controller.User.reUser.reUsers;
import static UI.UIMenu.showMenu;

public class UIResgisterUser {
    public static void registerUser(){
        UserDetails user = new User();
        int response = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Write your name");
            user.setName(sc.nextLine());
            System.out.println("Write your lastName");
            user.setLastName(sc.nextLine());
            System.out.println("Write your nickname");
            user.setNickname(sc.nextLine());
            System.out.println("Write your password");
            user.setPassword(sc.nextLine());

            System.out.println("1.Confirm");
            System.out.println("2.back");
            System.out.println("3.exit");
            response = Integer.parseInt(sc.nextLine());
            switch (response){
                case 1 ->{
                    reUsers(user);
                    response = 0;
                }
                case 2 -> registerUser();
                case 3 -> response = 0;
                default -> System.out.println("Option invalid");
            }
        }while(response != 0);
    }
}

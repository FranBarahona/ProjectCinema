package UI.AdminOptions;
import Model.AdminModel.Admin;
import Model.UserDetails;

import java.util.Scanner;
import static Controller.Admin.reAdmin.reAdmins;

public class UIRegisterAdmin {
    public static void registerAdmin(){
        UserDetails admin= new Admin();
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Write your name");
            admin.setName(sc.nextLine());
            System.out.println("Write your lastName");
            admin.setLastName(sc.nextLine());
            System.out.println("Write your nickname");
            admin.setNickname(sc.nextLine());
            System.out.println("Write your password");
            admin.setPassword(sc.nextLine());
            System.out.println("1. Confirm");
            System.out.println("2. Back");
            System.out.println("3. Exit");
            response = Integer.parseInt(sc.nextLine());
            switch (response){
                case 1 ->{
                    reAdmins(admin);
                    response = 0;
                }
                case 2 -> response = 1;
                case 3 -> response = 0;
                default -> System.out.println("Option invalid");

            }
        }while(response != 0);
    }
}

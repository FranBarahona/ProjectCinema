package UI;
import Controller.Admin.CrudAdmin;
import Controller.User.CrudUser;
import Utils.Auth.AuthUser;
import java.util.Scanner;

public class UIAuthUser {

public static void authUserC() throws Exception {

    AuthUser loginSys;
    boolean userCorrect;
    Scanner sc = new Scanner(System.in);
    CrudAdmin admin = new CrudAdmin();
    CrudUser user = new CrudUser();

    int i = 3;
    do {
        System.out.println("Insert your nickname");
        String nickname = sc.nextLine();
        System.out.println("Insert your password");
        String password = sc.nextLine();

        admin.read();
        user.read();

        loginSys = new AuthUser(nickname,password);

        userCorrect = loginSys.userLogin();
        
            if (!userCorrect) {
            i = i - 1;
            if (i == 0){
                System.out.println("Login attempt failed, please try again later");
            } else {
                System.out.println("You have " + i + " attempts left");
            }
        }
        
        System.out.println("You have " + i + " attempts left");
    }while(i > 0 && !userCorrect);
    }
}


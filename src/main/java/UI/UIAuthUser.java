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

        i = i - 1;

        System.out.println("You have " + i + " attempts left");
    }while(i > 0 && !userCorrect);
    }
}


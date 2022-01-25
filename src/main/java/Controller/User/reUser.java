package Controller.User;

import Model.UserDetails;

import java.util.Scanner;

import static Controller.User.CrudUser.*;
import static Model.UserModel.Users.userList;
import static UI.UIResgisterUser.registerUser;

public class reUser{

    public static void reUsers(UserDetails user){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera usuarios actuales y add nuevos
            CrudUser cUser = new CrudUser();
            cUser.read();
            //Registra nuevos usuarios
            if(userList.containsKey(user.getNickname())){
                System.out.println("this name is not available");
                System.out.println("please write an available nickname");
                sc.nextLine();
                registerUser();
            }else{
                cUser.setUser(user);
                cUser.write();
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}

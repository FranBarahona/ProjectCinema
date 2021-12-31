package Controller.User;
import Model.User;

import java.util.Map;
import java.util.Scanner;

import static Controller.User.CrudUser.*;
import static Model.Users.userList;
import static UI.UIResgisterUser.registerUser;

public class reUser{

    public static void reUsers(String name,String lastName,String nickname,String password){
        Scanner sc = new Scanner(System.in);
        try{
                //Recupera usuarios actuales y add nuevos
                  readUser();
            if(userList.size()>=1) {
                //Registra nuevos usuarios
                for (Map.Entry<Integer,User> data: userList.entrySet()) {
                    if(data.getValue().getNickname().equals(nickname)){
                        System.out.println("this name is not available");
                        System.out.println("please write an available nickname");
                        sc.nextLine();
                        registerUser();
                    }else{
                        writeNewUser(name,lastName,nickname,password);
                    }
                }
            }else if(userList.size()<1){
                //Registra nuevos usuarios si no hay ninguno.
                writeUser(name,lastName,nickname,password);
            }
    } catch(Exception e){
        System.err.println(e.getMessage());
     }
    }
}

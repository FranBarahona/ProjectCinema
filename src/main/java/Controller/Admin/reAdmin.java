package Controller.Admin;
import Model.Admin;
import java.util.Map;
import java.util.Scanner;
import static Controller.Admin.CrudAdmin.*;
import static Model.Admins.adminList;
import static UI.UIRegisterAdmin.registerAdmin;

public class reAdmin {
    public static void reAdmins(String name,String lastName,String nickname,String password){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera usuarios actuales y add nuevos
            readAdmin();
            if(adminList.size()>=1) {
                //Registra nuevos usuarios admin
                for (Map.Entry<Integer, Admin> data: adminList.entrySet()) {
                    if(data.getValue().getNickname().equals(nickname)){
                        System.out.println("this name is not available");
                        System.out.println("please write an available nickname");
                        sc.nextLine();
                        registerAdmin();
                    }else{
                        writeNewAdmin(name,lastName,nickname,password);
                    }
                }
            }else if(adminList.size()<1){
                //Registra nuevos usuarios si no hay ninguno.
                writeAdmin(name,lastName,nickname,password);
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}

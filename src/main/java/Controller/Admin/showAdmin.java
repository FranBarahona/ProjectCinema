package Controller.Admin;
import Model.AdminModel.Admin;
import Utils.Logs.Logs;

import java.util.Map;
import java.util.Scanner;
import static Model.AdminModel.Admins.adminList;

public class showAdmin{

    public static void showAdmins(){
        try{
            //Recupera todos los usuarios admin existentes
            CrudAdmin admin = new CrudAdmin();
            admin.read();
            //Recorre los usuarios admin existentes
            for (Map.Entry<String, Admin> data: adminList.entrySet()) {
                System.out.println(data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
            Logs.toLog(e.getMessage());
        }
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
    }
}

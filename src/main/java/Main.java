import UI.AdminOptions.UIAdminMenu;
import Utils.Logs.Logs;

import static UI.AdminOptions.UIAdminMenu.adminMenu;
import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args){
        try {
            showMenu();

        }catch (Exception e){
            System.out.println(e.getMessage());
            Logs.toLog(e.getMessage());
        }

    }
}

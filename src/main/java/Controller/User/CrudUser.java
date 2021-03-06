package Controller.User;

import Model.AdminModel.Admin;
import Model.UserDetails;
import Model.UserModel.User;
import Utils.Files.FileManage;
import Utils.Interfaces.ICrud;
import Utils.Logs.Logs;

import java.io.*;
import java.util.Map;

import static Model.AdminModel.Admins.adminList;
import static Model.UserModel.Users.userList;

public class CrudUser implements ICrud {
    private FileManage a;
    private User user;

    public CrudUser(){
        this.a = new FileManage("Data");
    }

    public void setUser(UserDetails user) {
        this.user = (User)user;
        this.user.setId((userList.isEmpty())?1:userList.size() + 1);;
    }

    public User getUser(){
        return this.user;
    }

    @Override
    public void read() {
        try {
            this.a.setInput();
            userList  = (Map<String, User>) this.a.getInput() ;
            this.a.closeInputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
                Logs.toLog(e.getMessage());
        }
    }

    @Override
    public void write() {
        try {
            userList.put(user.getNickname(), getUser());
            a.OutputStreamProcess(userList);
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
                Logs.toLog(e.getMessage());
        }
    }

}



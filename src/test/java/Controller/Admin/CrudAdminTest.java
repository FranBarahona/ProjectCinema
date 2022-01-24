package Controller.Admin;
import Model.AdminModel.Admin;
import Model.UserDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Model.AdminModel.Admins.adminList;
import static org.junit.jupiter.api.Assertions.*;

class CrudAdminTest {
    CrudAdmin crudAdmin = new CrudAdmin();
    @Test
    void writeTest() throws Exception {
        UserDetails user = new Admin();
        user.setName("prueba");
        user.setLastName("prueba");
        user.setNickname("prueba");
        user.setPassword("prueba");
        crudAdmin.setAdmin(user);
        crudAdmin.write();
        Assertions.assertFalse(adminList.isEmpty());
    }

    @Test
    void readTest() throws Exception {
        crudAdmin.read();
        Assertions.assertFalse(adminList.isEmpty());
    }
}
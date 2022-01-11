package Controller_07342;
import Entity_07342.AdminEntity_07342;
import java.util.ArrayList;

public class AdminController_07342 {
    public ArrayList<AdminEntity_07342> getDataAdmin(){
        return AllObjectModel_07342.adminModel_07342.getAdmin();
    }
    public ArrayList<AdminEntity_07342> InsertAdmin(){
        return AllObjectModel_07342.adminModel_07342.tambahAdmin();
    }

}
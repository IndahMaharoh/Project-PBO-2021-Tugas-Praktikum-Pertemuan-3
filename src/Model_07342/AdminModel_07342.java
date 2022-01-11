/**
 * method getAdmin_07342 berfungsi untuk mengambil seluruh data dari database
 * @return mengembalikan kumpulan data yang telah didapat ke dalam arraylistAdmin
 */

package Model_07342;
import Entity_07342.*;
import Helper_07342.KoneksiDb_07342;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminModel_07342 {
    private String sql;
    public Connection conn = KoneksiDb_07342.getconection();
    public ArrayList <AdminEntity_07342> arraylistAdmin = new ArrayList<>();
    public Scanner scan = new Scanner(System.in);
    public ArrayList <AdminEntity_07342> getAdmin()
    {
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM Admin_07342";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                AdminEntity_07342 admin_07342 = new AdminEntity_07342(){};
                admin_07342.setId_07342(rs.getInt("id_07342"));
                admin_07342.setNama_07342(rs.getString("nama_07342"));
                admin_07342.setPassword_07342(rs.getString("password_07342"));
                admin_07342.setNoTelp_07342(rs.getString("noTelp_07342"));
                arraylistAdmin.add(admin_07342);
            }
            }catch(SQLException e){
                    System.out.println(e);
                    }
            return arraylistAdmin;
    }
    
    public ArrayList <AdminEntity_07342> tambahAdmin()
    {
        try{
            sql = "INSERT INTO Admin_07342 (nama_07342, password_07342, noTelp_07342) Values(?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            int rows = stat.executeUpdate();
            stat.setString(1, AdminEntity_07342.getNama_07342());
            }catch(SQLException e){
                    System.out.println(e);
                    }
            return arraylistAdmin;
    }
}
/**
 * method getMahasiswa_Indah berfungsi untuk mengambil seluruh data dari database
 * @return mengembalikan kumpulan data yang telah didapat ke dalam arraylistMahasiswa
 */

package Model_07342;
import Entity_07342.MahasiswaEntity_07342;
import Helper_07342.KoneksiDb_07342;
import java.sql.*;
import java.util.ArrayList;

public class MahasiswaModel_07342 {
    private String sql;
    public Connection conn = KoneksiDb_07342.getconection();
    public ArrayList <MahasiswaEntity_07342> getMahasiswa()
    {
        ArrayList <MahasiswaEntity_07342> arraylistMahasiswa = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM Mahasiswa_07342";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                MahasiswaEntity_07342 mahasiswaEntity_07342 = new MahasiswaEntity_07342();
                mahasiswaEntity_07342.setId_07342(rs.getInt("id_07342"));
                mahasiswaEntity_07342.setNama_07342(rs.getString("nama_07342"));
                mahasiswaEntity_07342.setNpm_07342(rs.getString("npm_07342"));
                mahasiswaEntity_07342.setJurusan_07342(rs.getString("jurusan_07342"));
                mahasiswaEntity_07342.setKelas_07342(rs.getString("kelas_07342"));
                mahasiswaEntity_07342.setSesi_07342(rs.getString("sesi_07342"));
                mahasiswaEntity_07342.setJenis_kursus_07342(rs.getString("jenis_kursus_07342"));
                mahasiswaEntity_07342.setNoTelp_07342(rs.getString("noTelp_07342"));
                arraylistMahasiswa.add(mahasiswaEntity_07342);
            }
            }catch(SQLException e){
                    System.out.println(e);
                    }
            return arraylistMahasiswa;
    }
}
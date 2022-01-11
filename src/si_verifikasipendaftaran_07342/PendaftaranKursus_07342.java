package si_verifikasipendaftaran_07342;
import Controller_07342.*;
import Entity_07342.*;
import PilihanMethod_07342.CRUD_Admin_07342;
import java.util.ArrayList;
import java.util.Scanner;

public class PendaftaranKursus_07342 {
    public static MahasiswaController_07342 mahasiswa07342 = new MahasiswaController_07342();
    public static AdminController_07342 admin07342 = new AdminController_07342();
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilData, pil;
        do {
        System.out.println("CRUD Pada Data : ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukan Pilihan Anda : ");
        pilData = scan.nextInt();
        switch(pilData){
            case 1 :
                do{
                    System.out.println("\n\nData Admin ");
                System.out.println("1. Tambah Admin ");
                System.out.println("2. Tampilkan Admin ");
                System.out.println("3. Update Data Admin ");
                System.out.println("4. Delete Admin ");
                System.out.println("0. Keluar ");
                System.out.print("Masukan Pilihan Anda : ");
                pil = scan.nextInt();
                switch(pil){
                    case 1 :
                        insertAdmin();
                        break;
                    case 2 :
                        showDataAdmin();
                        break;
                    case 3 :
                        CRUD_Admin_07342.update();
                        break;
                    case 4 :
                        CRUD_Admin_07342.delete();
                        break;
                    default :
                        System.out.print("Pilihan Anda Tidak Ada Pada Sistem ");
                }
                }while (pil!=0);
            case 2 :
        }
        }while(pilData != 0);
        
        showDataMahasiswa();
    }
    
    static void insertAdmin(){
        admin07342.InsertAdmin();
        String nama, password, noTelp;
            System.out.print("Masukan Nama Admin : ");
            nama = scan.next();
            System.out.print("Masukan Password : ");
            password = scan.next();
            System.out.print("Masukan No.Telepon : ");
            noTelp = scan.next();
            
    
    }
    /**
     * method showData() berfungsi untuk menampilkan data seluruh data admin
     */
    static void showDataAdmin(){
        System.out.println("========Data Admin=======");
        for(AdminEntity_07342 adminEntities : admin07342.getDataAdmin()){
            System.out.println("---------------------------");
            System.out.println("id = " + adminEntities.getId_07342());
            System.out.println("Nama = " + adminEntities.getNama_07342());
            System.out.println("Password = " + adminEntities.getPassword_07342());
            System.out.println("No. Telepon = " + adminEntities.getNoTelp_07342());
            }
    }
    
    /**
     * method showData() berfungsi untuk menampilkan data seluruh data mahasiswa
     */
    static void showDataMahasiswa(){
        System.out.println("\n\n========Data Mahasiswa=======");
        for(MahasiswaEntity_07342 mahasiswaEntities : mahasiswa07342.getDataMahasiswa()){
            System.out.println("---------------------------");
            System.out.println("id = " + mahasiswaEntities.getId_07342());
            System.out.println("Nama = " + mahasiswaEntities.getNama_07342());
            System.out.println("NPM = " + mahasiswaEntities.getNpm_07342());
            System.out.println("Jurusan = " + mahasiswaEntities.getJurusan_07342());
            System.out.println("Kelas = " + mahasiswaEntities.getKelas_07342());
            System.out.println("Sesi = " + mahasiswaEntities.getSesi_07342());
            System.out.println("Jenis Kursus = " + mahasiswaEntities.getJenis_kursus_07342());
            System.out.println("no Telp = " + mahasiswaEntities.getNoTelp_07342());
        }
    }
    
}

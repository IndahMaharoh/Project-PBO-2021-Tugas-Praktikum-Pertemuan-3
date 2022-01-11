package PilihanMethod_07342;
import Entity_07342.*;
import java.util.Scanner;

public class CRUD_Admin_07342 {
    public static Scanner scan = new Scanner(System.in);
    public static AdminEntity_07342 [] dataAdmin = new AdminEntity_07342 [100];
    public static int jumlah=0;
    
    public static void create() {
        String nama, password, noTelp;
        System.out.print("Masukan Nama Admin : ");
        nama = scan.next();
        System.out.print("Masukan Password : ");
        password = scan.next();
        System.out.print("Masukan No.Telepon : ");
        noTelp = scan.next();
        dataAdmin [jumlah]= new AdminEntity_07342(){};
        jumlah++;
        
    }
    
    public static void read(){
    if(jumlah==0){
        System.out.println("Tidak Ada Data");
    }
    else{ 
        for(int i=0; i<jumlah; i++){
        System.out.println("==================");
        System.out.print("Nama Admin : "+ dataAdmin[i].getNama_07342());
        System.out.print("Password Admin : "+ dataAdmin[i].getPassword_07342());
        System.out.print("No. Telp : "+ dataAdmin[i].getNoTelp_07342());
        System.out.println("==================");
        }
    }
}
    
    public static void update(){
        String search; int cari=0;
        int edit;
        System.out.print("Masukan Password Admin yang mau di Edit : ");
        search = scan.next();
        do{
            if(cari==jumlah){
                System.out.println("Tidak Ada Data");
                break;
            }
            else if (dataAdmin[cari].getPassword_07342().equals(search) ){
                System.out.println("1. Nama Admin ");
                System.out.println("2. Password Admin ");
                System.out.println("3. No. Telepon ");
                System.out.print("Pilih data yang ingin diubah : ");
                edit=scan.nextInt();
                switch(edit){
                    case 1 :
                        System.out.print("Ubah Nama Admin : ");
                        String newNama = scan.next();
                        dataAdmin[cari].setNama_07342(newNama); 
                        break;
                    case 2 :
                        System.out.print("Ubah Password Admin : ");
                        String newPass = scan.next();
                        dataAdmin[cari].setPassword_07342(newPass); 
                        break;
                    case 3 :
                        System.out.print("Ubah Warna Sepatu : ");
                        String newNoTelp = scan.next();
                        dataAdmin[cari].setNoTelp_07342(newNoTelp); 
                        break;
                    default :
                        System.out.println("Pilihan Tidak Ada ");
                        break;
                }
                break;
            }   
            else{
                cari++;
            }
        }while(true);
}
    
    public static void delete(){
        int cari = 0;
        System.out.println("Masukkan Password Admin yang akan di Hapus : ");
        String search= scan.next();
        scan.nextLine();
        do{
            if(cari==jumlah){
                System.out.println("Tidak Ada Data !");
                break;
            }
            else if (dataAdmin[cari].getPassword_07342().equals(search) ){
                if(cari==jumlah-1){
                    jumlah--;
                }
                else {
                    for(int i = cari; i<jumlah; i++){
                        dataAdmin[i]=dataAdmin[i+1];
                    }
                    jumlah--;
                }
                break;
            }
            else {
                cari=cari+1;
            }
        }while(true);
    }
}
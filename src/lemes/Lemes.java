/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemes;
import java.util.*;
/**
 *
 * @author Zikri
 */
public class Lemes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Login login = new Login(2);
        DataBerita beritaBaru = new DataBerita("Seorang Petani Lele Berhasil panen besar dengan bantuan aplikasi LeMES", "gatau bingung", "12-desember-2022");
        MenuAdmin menu = new MenuAdmin();
        menu.newBerita(beritaBaru);
    

        System.out.println("MENU ");
        System.out.println("1. Sign up");
        System.out.println("2. Login");
        System.out.println("0. Keluar");
        System.out.print("PILIH : ");
        int pilih = scan.nextInt();
        
        while (pilih != 0){
            if (pilih == 1){
                System.out.print("Username : ");
                String username = scan.next();
                System.out.print("Name : ");
                String name = scan.next();
                System.out.print("password : ");
                String password = scan.next();

                SignUp akunBaru = new SignUp(username, name, password); 
                System.out.println(akunBaru.getUsername());
                System.out.println(akunBaru.getName());
                
                login.tambahAkun(akunBaru);
                System.out.println("MENU ");
                System.out.println("1. Sign up");
                System.out.println("2. Login");
                System.out.println("0. Keluar");
                System.out.print("PILIH : ");
                pilih = scan.nextInt();

            }else if(pilih == 2){
                System.out.print("Username : ");
                String username = scan.next();
                System.out.print("password : ");
                String password = scan.next();
                login.validasi(username, password);

                System.out.println("MENU ");
                System.out.println("1. Sign up");
                System.out.println("2. Login");
                System.out.println("0. Keluar");
                System.out.print("PILIH : ");
                pilih = scan.nextInt();
            }else{
                System.out.println("INPUTAN TIDAK VALIDD");
            }
        }
        
    }
    
}

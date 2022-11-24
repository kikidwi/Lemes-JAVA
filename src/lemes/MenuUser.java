
package lemes;
import java.util.*;


public class MenuUser extends MenuAdmin{
    Scanner scan = new Scanner(System.in);
    private InformasiKolamLele[] info;
    private int jumlahKolam;

    /**
     * 
     */
    
    public void setMax(){
        info = new InformasiKolamLele[5];
    }
    public void createKolam(InformasiKolamLele newInfo){
        setMax();
        this.info[jumlahKolam] = newInfo;
        jumlahKolam++;
        
        System.out.println("Kolam baru dan Informasinya berhasil ditambah");
    }

    public void displayInfoKolam(){            
        if (info == null){
            System.out.println("KOLAM LELE BELUM TERSEDIA");
        }else{
            for (int i = 0 ; i < info.length ; i++){
                if (info[i] != null) {
                    System.out.println("Kolam ke-" + (i+1));
                    System.out.println("Nama Kolam : " + info[i].getNamakolam());
                    System.out.println("Berat Lele : " + info[i].getBeratlele());
                    System.out.println("Jumlah Lele : " + info[i].getJumlahlele());
                    System.out.println("Tanggal awal tebar benih : " + info[i].getTglTebarBenih());
                } 
            }
            System.out.println(" ");
        }
        
    }

    public void menu(){
        System.out.println(" ");
        System.out.println("WELLCOME TO MENU LeMES");
        System.out.println("1. Display Info Kolam ");
        System.out.println("2. Create Kolam Baru ");
        System.out.println("3. Show Berita");
        System.out.println("4. Show Pedoman");
        System.out.println("5. Notifikasi ");
        System.out.println("6. Search Kolam ");
        System.out.println("0. LOGOUT ");
        System.out.print("PILIH MENU : ");
    }

    public void pilihMenu(){
        menu();
        int pilih = scan.nextInt();
        while  (pilih != 0){
            if (pilih == 1){
                displayInfoKolam();
                
                menu();
                pilih = scan.nextInt();
            }else if(pilih == 2){
                System.out.print("Nama Kolam : ");
                String newNama = scan.next();
                System.out.print("Berat Lele : ");
                int newBerat = scan.nextInt();
                System.out.print("Jumlah Lele : ");
                int newJumlah = scan.nextInt();
                System.out.print("Tanggal awal tebar benih : ");
                String newTanggal = scan.next();

                InformasiKolamLele newInfo = new InformasiKolamLele(newNama, newBerat, newJumlah, newTanggal);
                createKolam(newInfo);
                
                menu();
                pilih = scan.nextInt();
            }else if(pilih == 3){
                

                displayBerita();
                menu();
                pilih = scan.nextInt();
            }else if(pilih == 4){
               
                
                displayPedoman();

                menu();
                pilih = scan.nextInt();
            }else if(pilih == 5){
                Notification notif = new Notification();

                notif.DisplayWaktuBeriPakan();
                // notif.DisplayWaktuPanen();
                notif.DisplaywaktuRestockpakan();

                menu();
                pilih = scan.nextInt();
            }else if (pilih == 6) {
                System.out.print("Masukkan Nama Kolam yang ingin dicari : ");
                String cari = scan.next();
                int j = cariKolam(cari);
                
                if (j != -1){
                    System.out.println("Kolam Berhasil Ditemukan");
                    System.out.println("Nama Kolam             : " + info[j].getNamakolam());
                    System.out.println("Berat lele             : " + info[j].getBeratlele());
                    System.out.println("Jumlah lele            : " + info[j].getJumlahlele());
                    System.out.println("Tanggal tebar benih    : " + info[j].getTglTebarBenih());
                }else{
                    System.out.println("KOLAM TIDAK ADA");
                }
                
                menu();
                pilih = scan.nextInt();
            }else{
                System.out.println("PILIHAN ANDA TIDAK ADA");
            }
        }
    }

    public int cariKolam(String cari){  
        for (int j = 0; j < info.length; j++) {  
            if (cari.equals(info[j].getNamakolam())){
                return j;
            }
        }
        return -1;
    }  
}

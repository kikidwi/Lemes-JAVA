
package lemes;
import java.util.*;


public class MenuAdmin {
    //private admin beritaPedoman;
    //admin admin = new admin();
    // private List<MenuAdmin> menuAdmin; //Why this is not used??
    private DataBerita[] Berita;//
    private DataPedoman[] Pedoman;
    private int jumlahBerita;
    private int jumlahPedoman;
    Scanner scan = new Scanner(System.in);

    // public void displayBerita(MenuAdmin admin){
    //     System.out.print(menuAdmin.indexOf(admin) + 1 + ". ");
    //     System.out.println(admin.getJudulBerita());
    //     System.out.println("");
    //     System.out.println(admin.getIsiBerita());
    // }
    
    public void setMax(){
        Berita = new DataBerita[5];
        Pedoman = new DataPedoman[5];
    }
 
    public void newBerita(DataBerita berita){
        setMax();
        this.Berita[jumlahBerita] = berita;
        jumlahBerita++;
    }

    public void newPedoman(DataPedoman pedoman){
        setMax();
        this.Pedoman[jumlahPedoman] = pedoman;
        jumlahPedoman++;
    }

    public void displayBerita(){
        if(Berita == null){
            System.out.println("Berita Masih Kosong");
        }else{
            for (int i = 0; i < Berita.length ; i++){
                if (Berita[i] != null){
                    System.out.println("Berita ke-" + (i+1));
                    System.out.println("Judul Berita : " + Berita[i].getJudulBerita());
                    System.out.println("ISI : ");
                    System.out.println(Berita[i].getIsiBerita());
                    System.out.println("Tanggal Upload : " + Berita[i].getTanggal());
                    System.out.println(" ");
                }
            } 
        }
       
    }
    

    public void displayPedoman(){
        if(Berita == null){
            System.out.println("Pedoman Masih Kosong");
        }else{
            for (int i = 0; i < Pedoman.length ; i++){
                System.out.println("Pedoman ke-" + i);
                System.out.println(this.Pedoman[i].getJudulPedoman());
                System.out.println(this.Pedoman[i].getTanggal());
                System.out.println(this.Pedoman[i].getIsiPedoman());

                System.out.println(" ");
            }
        }
    }

    public void menu(){
        System.out.println("MENUU ADMIN");
        System.out.println("1. Tambah Berita");
        System.out.println("2. Tambah Pedoman");
        System.out.println("3. Show Berita");
        System.out.println("4. Show Pedoman");
        System.out.println("0. LOGOUT");
        System.out.print("pilih menu : ");
    }

    public void pilihMenu(){
        menu();
        int pilih = scan.nextInt();
        while  (pilih != 0){
            if (pilih == 1){
   
                System.out.print("Tambah judul berita : ");
                String newJudul= scan.next();
                System.out.println("Isi berita : ");
                String newIsiBerita = scan.next();
                System.out.print("Tanggal Berita Terbit : ");
                String newTanggalBerita = scan.next();
                
                DataBerita BeritaBaru = new DataBerita(newJudul, newIsiBerita, newTanggalBerita);
                newBerita(BeritaBaru);
                
                menu();
                pilih = scan.nextInt();
            }else if(pilih == 2){
                System.out.print("Tambah Judul Pedoman : ");
                String newJudul = scan.next();
                System.out.println("Isi Pedoman : ");
                String newPedoman = scan.next();
                System.out.print("Tanggal Pedoman Terbit : ");
                String newTanggalPedoman = scan.next();
               

                DataPedoman PedomanBaru = new DataPedoman(newJudul, newPedoman, newTanggalPedoman);
                newPedoman(PedomanBaru);
                
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
            }
        }

    // public void displayPedoman(MenuAdmin admin){
    //     System.out.print(menuAdmin.indexOf(admin) + 1 + ". ");
    //     System.out.println(admin.getJudulPedoman());
    //     System.out.println("");
    //     System.out.println(admin.getIsiPedoman());
    // }
    }
}

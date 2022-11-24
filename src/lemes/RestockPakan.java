
package lemes;

public class RestockPakan {
    private double jumlah_pakan;


    public RestockPakan(double jumlah_pakan){
        this.jumlah_pakan = jumlah_pakan;
    }

    public double getJumlahPakan() {
        return jumlah_pakan;
    }
    public void setJumlahPakan(int jumlah_pakan) {
        this.jumlah_pakan = jumlah_pakan;
    }
    
    public void hitungRestockPakan(){
        InformasiKolamLele kolam = new InformasiKolamLele("kolam1", 80, 100, "12");
        double hasilHitung;
        
        hasilHitung = (this.jumlah_pakan / (3*(kolam.getBeratlele()*kolam.getJumlahlele())*0.03));
        System.out.println("Restock Pakan Dalam : " + Math.ceil(hasilHitung) + " HARI Lagi");
    }
}

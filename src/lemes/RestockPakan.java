/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemes;

/**
 *
 * @author Zikri
 */
public class RestockPakan {
    private double jumlah_pakan;
    private InformasiKolamLele kolam;

    public double getJumlahPakan() {
        return jumlah_pakan;
    }
    public void setJumlahPakan(int jumlah_pakan) {
        this.jumlah_pakan = jumlah_pakan;
    }
    
    public void hitungRestockPakan(){
        double hasilHitung;
        
        hasilHitung = this.jumlah_pakan / (4*(kolam.getBeratlele()*kolam.getJumlahlele())*0.03);
        System.out.println("Restock Pakan Dalam : " + hasilHitung + " HARI");
    }
}

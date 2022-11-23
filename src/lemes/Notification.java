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
public class Notification {
    private InformasiKolamLele WaktuPakan;
    private RestockPakan waktuRestockpakan;

    public void DisplayWaktuBeriPakan(){
            WaktuPakan.getJumlahlele();
        }

    public void DisplayWaktuBeriPanen(){ //Waktu panen 3 panen
            WaktuPakan.getJumlahlele();
        }

    public void DisplaywaktuRestockpakan(){
            waktuRestockpakan.hitungRestockPakan();
        }
}

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
public class InformasiKolamLele {
    private String namakolam;
    private int beratlele;
    private int jumlahlele;
    private String tglTebarBenih;
  
    public InformasiKolamLele(String namakolam, int beratlele, int jumlahlele, String tglTebarBenih) {
        this.namakolam = namakolam;
        this.beratlele = beratlele;
        this.jumlahlele = jumlahlele;
        this.tglTebarBenih = tglTebarBenih;
    }

    public String getNamakolam() {
        return namakolam;
    }

    public void setNamakolam(String namakolam) {
        this.namakolam = namakolam;
    }

    public int getBeratlele() {
        return beratlele;
    }

    public void setBeratlele(int beratlele) {
        this.beratlele = beratlele;
    }

    public int getJumlahlele() {
        return jumlahlele;
    }

    public void setJumlahlele(int jumlahlele) {
        this.jumlahlele = jumlahlele;
    }

    public String getTglTebarBenih() {
        return tglTebarBenih;
    }

    public void setTglTebarBenih(String tglTebarBenih) {
        this.tglTebarBenih = tglTebarBenih;
    }
    
}

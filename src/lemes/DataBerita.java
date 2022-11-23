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
public class DataBerita {
    private String judulBerita;
    private String isiBerita;
    private String tanggal;

    public DataBerita(String judulBerita, String isiBerita, String tanggal){ 
        this.judulBerita = judulBerita;
        this.isiBerita = isiBerita;
        this.tanggal = tanggal;
    }

    public String getJudulBerita() {
        return judulBerita;
    }
    public void setJudulBerita(String judulBerita) {
        this.judulBerita = judulBerita;
    }
    public String getIsiBerita() {
        return isiBerita;
    }
    public void setIsiBerita(String isiBerita) {
        this.isiBerita = isiBerita;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
}

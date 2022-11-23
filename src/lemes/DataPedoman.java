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
public class DataPedoman {
    private String judulPedoman;
    private String isiPedoman;
    private String tanggal;

    
    public DataPedoman(String judulPedoman, String isiPedoman, String tanggal) {
        this.judulPedoman = judulPedoman;
        this.isiPedoman = isiPedoman;
        this.tanggal = tanggal;
    }public String getJudulPedoman() {
        return judulPedoman;
    }

    public void setJudulPedoman(String judulPedoman) {
        this.judulPedoman = judulPedoman;
    }

    public String getIsiPedoman() {
        return isiPedoman;
    }

    public void setIsiPedoman(String isiPedoman) {
        this.isiPedoman = isiPedoman;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}

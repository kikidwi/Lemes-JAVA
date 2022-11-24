package lemes;


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

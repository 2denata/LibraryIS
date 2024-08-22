package Perpustakaan;

import java.io.Serializable;

public class Koleksi implements Serializable{

    protected String idKoleksi;
    protected String judul;
    protected String penerbit;
    protected String IS;
    protected boolean status_pinjam;
    protected String tahunTerbit;

    public Koleksi() {
        
    }
    
    public Koleksi(String idKoleksi, String judul, String penerbit, boolean status_pinjam) {
        this.idKoleksi = idKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.status_pinjam = status_pinjam;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getIdKoleksi() {
        return idKoleksi;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setIdKoleksi(String idKoleksi) {
        this.idKoleksi = idKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbut(String penerbit) {
        this.penerbit = penerbit;
    }

    public boolean isStatus_pinjam() {
        return status_pinjam;
    }

    public void setStatus_pinjam(boolean status_pinjam) {
        this.status_pinjam = status_pinjam;
    }
    
    //method override
    public String getIS() {
        return "";
    }

    public void setIS(String IS) {
        this.IS = IS;
    }
    
    public String getIStemp() {
        return IS;
    }
    
    public String getFormat() {
        return "";
    }
    
    public int getVolume(){
        return 0;
    }
    
    public int getSeri() {
        return 0;
    }
    
    public int getHalaman() {
        return 0;
    }
}

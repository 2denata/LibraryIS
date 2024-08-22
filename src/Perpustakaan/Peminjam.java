package Perpustakaan;

import java.io.Serializable;

public class Peminjam implements Serializable {

    protected String idPeminjam;
    protected String nama;
    protected String alamat;
    protected int mak_pinjam;
    protected long nomor;
    protected String jenis;

    public Peminjam(String idPeminjam, String nama, String alamat, int mak_pinjam) {
        this.idPeminjam = idPeminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.mak_pinjam = mak_pinjam;
    }

    public Peminjam(String idPeminjam, String nama, String jenis, long nomor, String alamat, int mak_pinjam) {
        this.idPeminjam = idPeminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.mak_pinjam = mak_pinjam;
        this.nomor = nomor;
        this.jenis = jenis;
    }

    
    
    public String getIdPeminjam() {
        return idPeminjam;
    }

    public void setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMak_pinjam() {
        return mak_pinjam;
    }

    public void setMak_pinjam(int mak_pinjam) {
        this.mak_pinjam = mak_pinjam;
    }
    
    public void setNomor(long nomor) {
        this.nomor = nomor;
    }
    
    public String getNomor() {
        return "";
    }

    
}

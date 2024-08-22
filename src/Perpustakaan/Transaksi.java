package Perpustakaan;

import java.io.Serializable;
import java.util.*;
import java.time.*;

public class Transaksi implements Serializable{
    protected int idTransaksi;
    protected LocalDate tglPinjam;
    protected Date tglKembali;
    protected float denda;
    protected Koleksi[] koleksi;
    protected Peminjam peminjam;

    public Transaksi() {
    }

    public Transaksi(int idTransaksi, LocalDate tglPinjam, Koleksi[] koleksi, Peminjam peminjam) {
        this.idTransaksi = idTransaksi;
        this.tglPinjam = tglPinjam;
        this.koleksi = koleksi;
        this.peminjam = peminjam;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public LocalDate getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(LocalDate tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public float getDenda() {
        return denda;
    }

    public void setDenda(float denda) {
        this.denda = denda;
    }

    public Koleksi[] getKoleksi() {
        return koleksi;
    }

    public void setKoleksi(Koleksi[] koleksi) {
        this.koleksi = koleksi;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
    }
    
    
    
}

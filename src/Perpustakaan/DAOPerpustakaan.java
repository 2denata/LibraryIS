package Perpustakaan;

import java.util.ArrayList;

public class DAOPerpustakaan {
    
    ArrayList<Peminjam> listPeminjam;
    ArrayList<Koleksi> listKoleksi;
    
    public DAOPerpustakaan() {
        listPeminjam = new ArrayList<Peminjam>();
        listKoleksi = new ArrayList<Koleksi>();
    }
    
    public void insertPeminjam(Peminjam data) {
        listPeminjam.add(data);
    }
    
    public void insertKoleksi(Koleksi data) {
        listKoleksi.add(data);
    }
    
    public ArrayList<Peminjam> getPeminjam() {
        return listPeminjam;
    }
    
    public ArrayList<Koleksi> getKoleksi() {
        return listKoleksi;
    }
}

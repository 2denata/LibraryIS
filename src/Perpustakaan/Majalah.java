package Perpustakaan;

public class Majalah extends Koleksi {

    protected int volume;
    protected int seri;
    protected String ISSN;

    public Majalah(int volume, int seri, String ISSN, String idKoleksi, String judul, String penerbut, boolean status_pinjam) {
        super(idKoleksi, judul, penerbut, status_pinjam);
        this.volume = volume;
        this.seri = seri;
        this.ISSN = ISSN;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
    
    @Override
    public String getIS() {
        return ISSN;
    }
}

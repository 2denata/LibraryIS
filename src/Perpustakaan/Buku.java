package Perpustakaan;

public class Buku extends Koleksi {

    protected int halaman;
    protected String ISBN;

    public Buku(int halaman, String ISBN, String idKoleksi, String judul, String penerbut, boolean status_pinjam) {
        super(idKoleksi, judul, penerbut, status_pinjam);
        this.halaman = halaman;
        this.ISBN = ISBN;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    @Override
    public String getIS() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

}

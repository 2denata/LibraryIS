package Perpustakaan;

public class Disk extends Koleksi {

    protected String format;
    protected String ISBN;

    public Disk(String format, String ISBN, String idKoleksi, String judul, String penerbut, boolean status_pinjam) {
        super(idKoleksi, judul, penerbut, status_pinjam);
        this.format = format;
        this.ISBN = ISBN;
    }

    @Override
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String getIS() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    
}

package Perpustakaan;

public class Umum extends Peminjam {

    protected String nik;

    public Umum(String nik, String idPeminjam, String nama, String alamat, int mak_pinjam) {
        super(idPeminjam, nama, alamat, mak_pinjam);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String getNomor() {
        return nik;
    }
}

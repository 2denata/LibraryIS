package Perpustakaan;

public class Dosen extends Peminjam {

    protected String nip;

    public Dosen(String nip, String idPeminjam, String nama, String alamat, int mak_pinjam) {
        super(idPeminjam, nama, alamat, mak_pinjam);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}

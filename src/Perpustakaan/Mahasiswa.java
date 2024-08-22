package Perpustakaan;

public class Mahasiswa extends Peminjam {

    protected String nim;

    public Mahasiswa(String nim, String idPeminjam, String nama, String alamat, int mak_pinjam) {
        super(idPeminjam, nama, alamat, mak_pinjam);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }
}

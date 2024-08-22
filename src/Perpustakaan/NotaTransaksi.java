package Perpustakaan;

public class NotaTransaksi {
    private int idTransaksi;
    private String namaPeminjam;
    private String alamat;
    private String tglPinjam;
    private int jumlahPinjam;

    public NotaTransaksi(int idTransaksi, String namaPeminjam, String alamat, String tglPinjam, int jumlahPinjam) {
        this.idTransaksi = idTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.alamat = alamat;
        this.tglPinjam = tglPinjam;
        this.jumlahPinjam = jumlahPinjam;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }
    
    
    
    
}

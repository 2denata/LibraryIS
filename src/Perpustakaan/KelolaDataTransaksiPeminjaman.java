package Perpustakaan;

import java.awt.Color;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KelolaDataTransaksiPeminjaman extends javax.swing.JDialog {

    DAOPerpustakaan list = new DAOPerpustakaan();
    private final int generateID = (int) (Math.random() * 1000);
    private final Connection conn;
    private String query;
    private ResultSet rset;
    private Statement s;
    private Loading loading;

    public KelolaDataTransaksiPeminjaman(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        loading = new Loading(parent, true);
        loading.setVisible(true);
        initComponents();
        setTFAwal();
        DataHandler db = new DataHandler();
        db.getDBConnection();
        conn = db.conn;
        tampilDataTransaksiDB();

    }

    private void setTFAwal() {
        tfJudul.setEditable(false);
        tfJudul.setBackground(Color.LIGHT_GRAY);
        tfPenerbit.setEditable(false);
        tfPenerbit.setBackground(Color.LIGHT_GRAY);
        tfSeri.setEditable(false);
        tfSeri.setBackground(Color.LIGHT_GRAY);
        tfVolume.setEditable(false);
        tfVolume.setBackground(Color.LIGHT_GRAY);
        tfIS.setEditable(false);
        tfIS.setBackground(Color.LIGHT_GRAY);
        tfStatus.setEditable(false);
        tfStatus.setBackground(Color.LIGHT_GRAY);
        tfNomor.setEditable(false);
        tfNomor.setBackground(Color.LIGHT_GRAY);
        tfNama.setEditable(false);
        tfNama.setBackground(Color.LIGHT_GRAY);
        tfAlamat.setEditable(false);
        tfAlamat.setBackground(Color.LIGHT_GRAY);
        tfPinjam.setEditable(false);
        tfPinjam.setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelNomor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfIDPeminjam = new javax.swing.JTextField();
        tfNomor = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        tfPinjam = new javax.swing.JTextField();
        buttonCariPeminjam = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelVolume = new javax.swing.JLabel();
        labelSeri = new javax.swing.JLabel();
        tfIDKoleksi = new javax.swing.JTextField();
        tfJudul = new javax.swing.JTextField();
        tfPenerbit = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfIS = new javax.swing.JTextField();
        tfVolume = new javax.swing.JTextField();
        tfSeri = new javax.swing.JTextField();
        buttonTambahPesanan = new javax.swing.JButton();
        buttonCariKoleksi = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buttonTransaksi = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPesananKoleksi = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data Transaksi Peminjaman");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Dafa Peminjam");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("ID");

        labelNomor.setText("Nomor");

        jLabel5.setText("Nama");

        jLabel6.setText("Alamat");

        jLabel7.setText("Pinjam");

        buttonCariPeminjam.setText("Cari");
        buttonCariPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariPeminjamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNama))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAlamat))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPinjam)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomor)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfIDPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCariPeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfNomor, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIDPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariPeminjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomor)
                    .addComponent(tfNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Data Koleksi");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("ID ");

        jLabel9.setText("Judul");

        jLabel10.setText("Penerbit");

        jLabel11.setText("Status");

        jLabel12.setText("ISSN/BN");

        labelVolume.setText("Volume");

        labelSeri.setText("Seri");

        buttonTambahPesanan.setText("Tambah Pesanan");
        buttonTambahPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahPesananActionPerformed(evt);
            }
        });

        buttonCariKoleksi.setText("Cari");
        buttonCariKoleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariKoleksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPenerbit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfIDKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCariKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfJudul)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfStatus)
                            .addComponent(tfIS)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelVolume)
                            .addComponent(labelSeri))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSeri, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonTambahPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfIDKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariKoleksi))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVolume)
                            .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSeri)
                            .addComponent(tfSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonTambahPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setText("Transaksi Peminjaman");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonTransaksi.setText("Proses Peminjaman");
        buttonTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransaksiActionPerformed(evt);
            }
        });

        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelPesananKoleksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Judul", "Penerbit", "ISBN/SN", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelPesananKoleksi);

        jLabel13.setText("Daftar Pesanan Koleksi");

        jLabel16.setText("Data Transaksi");

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transaksi", "Peminjam", "Alamat", "Tanggal Pinjam", "Jumlah Pinjam"
            }
        ));
        jScrollPane2.setViewportView(tabelTransaksi);

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel15)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonKeluar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCariPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariPeminjamActionPerformed
        Peminjam sementara = null;
        String id = tfIDPeminjam.getText();
        try {
            if (idPeminjamDitemukan()) {
                try {
                    s = conn.createStatement();
                    query = "SELECT * FROM peminjam WHERE id_peminjam LIKE '" + id + "'";
                    rset = s.executeQuery(query);
                    while (rset.next()) {
                        sementara = new Peminjam(rset.getString(1), rset.getString(2), rset.getString(3), rset.getLong(4), rset.getString(5), rset.getInt(6));
                    }
                    tfIDPeminjam.setText(sementara.idPeminjam);
                    tfNama.setText(sementara.nama);
                    tfNomor.setText(String.valueOf(sementara.nomor));
                    tfAlamat.setText(sementara.alamat);
                    tfPinjam.setText(String.valueOf(sementara.mak_pinjam));

                    switch (sementara.idPeminjam.charAt(0)) {
                        case 'D':
                            labelNomor.setText("NIP:");
                            break;
                        case 'M':
                            labelNomor.setText("NIM:");
                            break;
                        case 'U':
                            labelNomor.setText("NIK:");
                            break;
                        default:
                            break;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCariPeminjamActionPerformed

    private void buttonCariKoleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariKoleksiActionPerformed
        String id = tfIDKoleksi.getText();
        try {
            if (idKoleksiDitemukan()) {
                switch (id.charAt(0)) {
                    case 'M':
                        query = "SELECT * FROM koleksi k, majalah m WHERE k.id_koleksi LIKE '" + id + "'";
                        s = conn.createStatement();
                        rset = s.executeQuery(query);
                        while (rset.next()) {
                            tfJudul.setText(rset.getString(2));
                            tfPenerbit.setText(rset.getString(3));
                            tfIS.setText(rset.getString(4));
                            labelVolume.setText("Volume");
                            tfVolume.setText(rset.getString(7));
                            tfSeri.setEnabled(true);
                            tfSeri.setText(rset.getString(8));
                            labelSeri.setVisible(true);
                            String status;
                            if (rset.getInt(5) == 0) {
                                status = "Tidak dipinjam";
                            } else {
                                status = "Dipinjam";
                            }
                            tfStatus.setText(status);
                        }
                        break;
                    case 'B':
                        query = "SELECT * FROM koleksi k, buku b WHERE k.id_koleksi LIKE '" + id + "'";
                        s = conn.createStatement();
                        rset = s.executeQuery(query);
                        while (rset.next()) {
                            tfJudul.setText(rset.getString(2));
                            tfPenerbit.setText(rset.getNString(3));
                            tfIS.setText(rset.getString(4));
                            labelVolume.setText("Hal");
                            tfVolume.setText(rset.getString(7));
                            tfSeri.setEnabled(false);
                            String status;
                            if (rset.getInt(5) == 0) {
                                status = "Tidak dipinjam";
                            } else {
                                status = "Dipinjam";
                            }
                            tfStatus.setText(status);
                            labelSeri.setVisible(false);
                        }
                        break;
                    case 'D':
                        query = "SELECT * FROM koleksi k, kaset d WHERE k.id_koleksi LIKE '" + id + "'";
                        s = conn.createStatement();
                        rset = s.executeQuery(query);
                        while (rset.next()) {
                            tfJudul.setText(rset.getString(2));
                            tfPenerbit.setText(rset.getString(3));
                            tfIS.setText(rset.getString(4));
                            labelVolume.setText("Format");
                            tfVolume.setText(rset.getString(7));
                            tfSeri.setEnabled(false);
                            String status;
                            if (rset.getInt(5) == 0) {
                                status = "Tidak dipinjam";
                            } else {
                                status = "Dipinjam";
                            }
                            tfStatus.setText(status);
                            labelSeri.setVisible(false);
                        }
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID Koleksi tidak ditemukan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCariKoleksiActionPerformed

    private boolean idPeminjamDitemukan() throws SQLException {
        ArrayList<String> checking = new ArrayList<>();
        s = conn.createStatement();
        String id = tfIDPeminjam.getText();
        query = "SELECT id_peminjam FROM peminjam WHERE id_peminjam LIKE '" + id + "'";
        ResultSet hasil = s.executeQuery(query);
        while (hasil.next()) {
            checking.add(hasil.getString(1));
        }
        return !checking.isEmpty();
    }

    private boolean idKoleksiDitemukan() throws SQLException {
        ArrayList<String> checking = new ArrayList<>();
        s = conn.createStatement();
        String id = tfIDKoleksi.getText();
        query = "SELECT id_koleksi FROM koleksi WHERE id_koleksi LIKE '" + id + "'";
        ResultSet hasil = s.executeQuery(query);
        while (hasil.next()) {
            checking.add(hasil.getString(1));
        }
        return !checking.isEmpty();
    }

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        resetKoleksi();
        resetPeminjam();
        int jumlahData = tabelPesananKoleksi.getRowCount();
        for (int i = 0; i < jumlahData; i++) {
            list.getKoleksi().remove(i);
        }
        tampilDataKoleksi();
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void resetPeminjam() {
        tfIDPeminjam.setText("");
        tfNama.setText("");
        tfNomor.setText("");
        tfAlamat.setText("");
        tfPinjam.setText("");
    }

    private void buttonTambahPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahPesananActionPerformed
        String a;
        a = tfIDKoleksi.getText();
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon masukkan ID");
        } else if (tfStatus.getText().equalsIgnoreCase("Dipinjam")) {
            JOptionPane.showMessageDialog(this, "Mohon maaf, barang sudah dipinjam");
        } else if (tabelPesananKoleksi.getRowCount() == Integer.parseInt(tfPinjam.getText())) {
            JOptionPane.showMessageDialog(this, "Maaf, peminjaman sudah melebihi batas (maks " + tfPinjam.getText() + ")");
        } else {
            //ambil data dari textField
            boolean statusBoolean;
            String idKoleksi = tfIDKoleksi.getText();
            String judul = tfJudul.getText();
            String penerbit = tfPenerbit.getText();
            String isbnissn = tfIS.getText();
            String status = tfStatus.getText();
            statusBoolean = status.equalsIgnoreCase("Dipinjam");

            //start buat objek Koleksi sementara
            Koleksi k = new Koleksi(idKoleksi, judul, penerbit, statusBoolean);
            k.setIS(isbnissn);
            list.getKoleksi().add(k);
            //end Koleksi sementara
            tampilDataKoleksi();
            resetKoleksi();
        }
    }//GEN-LAST:event_buttonTambahPesananActionPerformed

    private void buttonTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransaksiActionPerformed

        if (tfIDPeminjam.getText().isEmpty() || tabelPesananKoleksi.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Mohon memasukkan ID data terlebih dahulu");
        } else {
            try {
                prosesTransaksi();
            } catch (SQLException ex) {
                Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                tampilDataTransaksiDB();
            } catch (SQLException ex) {
                Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Transaksi berhasil! Mohon mengembalikan sesuai sebelum batas waktu");

            buttonTransaksi.setEnabled(false);
            buttonBatal.setEnabled(false);
            resetPeminjam();
            resetKoleksi();
            list.getKoleksi().clear();
            tampilDataKoleksi();
            buttonTambahPesanan.setEnabled(false);
        }

    }//GEN-LAST:event_buttonTransaksiActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void prosesTransaksi() throws SQLException {
        Statement stmt;
        int idTransaksi = generateID;
        String idPeminjam = tfIDPeminjam.getText();
        String nama = tfNama.getText();
        String alamat = tfAlamat.getText();
        int maxPinjam = Integer.parseInt(tfPinjam.getText());
        int jumlahPinjam = tabelPesananKoleksi.getRowCount();
        String tglPinjam = String.valueOf(LocalDate.now().getDayOfMonth())
                + String.valueOf(LocalDate.now().getMonthValue())
                + String.valueOf(LocalDate.now().getYear());

        Koleksi[] koleksiNota = new Koleksi[list.getKoleksi().size()];
        for (int i = 0; i < list.getKoleksi().size(); i++) {
            koleksiNota[i] = list.getKoleksi().get(i);
        }
        Peminjam peminjamNota = new Peminjam(idPeminjam, nama, alamat, maxPinjam);

        // insert ke tabel transaksi
        query = "INSERT INTO transaksi (idTransaksi, peminjam, alamat, tglPinjam, jumlahPinjam) "
                + "VALUES ('" + idTransaksi + "', '" + idPeminjam + "' ,'" + peminjamNota.alamat + "' , to_date(" + tglPinjam + ",'ddmmyyyy'), " + jumlahPinjam + ")";
        System.out.println("Execute query : " + query);
        stmt = conn.createStatement();
        stmt.executeQuery(query);

        //insert koleksi ke tabel barang terpinjam
        for (Koleksi k : koleksiNota) {
            query = "INSERT INTO barang_terpinjam (id_barang, id_transaksi) VALUES ('" 
                    + k.idKoleksi + "'," + idTransaksi + ")";
            String query2 = "UPDATE koleksi SET status = 1 WHERE id_koleksi LIKE '" + k.idKoleksi +"'";
            System.out.println("Execute query : " + query);
            System.out.println("Execute query : " + query2);
            stmt = conn.createStatement();
            stmt.executeQuery(query);
            stmt.executeQuery(query2);
            k.setStatus_pinjam(true);
        }
    }

    private void tampilDataTransaksiDB() throws SQLException {
        ArrayList<NotaTransaksi> temp = new ArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rsetTemp;

        String[] columnNames = {"ID Transaksi", "Peminjam", "Alamat", "Tanggal Pinjam", "Jumlah Pinjam"};

        int k = 0;
        String queryTemp = "SELECT * FROM transaksi";
        rsetTemp = stmt.executeQuery(queryTemp);
        while (rsetTemp.next()) {
            NotaTransaksi notaTransaksi = new NotaTransaksi(rsetTemp.getInt(1), rsetTemp.getString(2), rsetTemp.getString(3), rsetTemp.getString(4), rsetTemp.getInt(5));
            temp.add(notaTransaksi);
            k++;
        }

        Object[][] objData = new Object[k][columnNames.length];
        int i = 0;

        for (NotaTransaksi nt : temp) {
            Object[] teks = {nt.getIdTransaksi(), nt.getNamaPeminjam(), nt.getAlamat(), nt.getTglPinjam(), nt.getJumlahPinjam()};
            objData[i] = teks;
            i++;
        }

        modelTabel = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;

            }
        };
        tabelTransaksi.setModel(modelTabel);
        tabelTransaksi.setAutoCreateRowSorter(true);
        tabelTransaksi.repaint();
    }

    private void tampilDataTransaksi() {
        String[] columnNames = {"ID Transaksi", "Peminjam", "Alamat", "Tanggal Pinjam", "Jumlah Pinjam"};
        Object[][] objData = new Object[1][columnNames.length];

        //inisisasi data
        int idTransaksi = generateID;
        String peminjam = tfNama.getText();
        String alamat = tfAlamat.getText();
        int jumlahPinjam = tabelPesananKoleksi.getRowCount();

        Object[] konten = {idTransaksi, peminjam, alamat, LocalDate.now(), jumlahPinjam};
        objData[0] = konten;
        modelTabelTransaksi = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        tabelTransaksi.setModel(modelTabelTransaksi);
        tabelTransaksi.setAutoCreateRowSorter(true);
        tabelTransaksi.repaint();
    }

    private void resetKoleksi() {
        tfIDKoleksi.setText("");
        tfJudul.setText("");
        tfPenerbit.setText("");
        tfSeri.setText("");
        tfVolume.setText("");
        tfIS.setText("");
        tfStatus.setText("");
    }

    private void tampilDataKoleksi() {

        //set format tabel
        String[] columnNames = {"ID", "Judul", "Penerbit", "ISBN/SN", "Status"};
        Object[][] objData = new Object[list.getKoleksi().size()][columnNames.length]; //maks pinjam tergantung objek Peminjam
        int i = 0;

        for (Koleksi koleksi : list.getKoleksi()) {
            Object[] teks = {koleksi.getIdKoleksi(), koleksi.getJudul(), koleksi.getPenerbit(), koleksi.getIStemp(), koleksi.isStatus_pinjam()};
            objData[i] = teks;
            i++;
        }

        //set Model Tabel
        modelTabel = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;

            }
        };
        tabelPesananKoleksi.setModel(modelTabel);
        tabelPesananKoleksi.setAutoCreateRowSorter(true);
        tabelPesananKoleksi.repaint();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            KelolaDataTransaksiPeminjaman dialog = null;
            try {
                dialog = new KelolaDataTransaksiPeminjaman(new javax.swing.JFrame(), true);
            } catch (SQLException ex) {
                Logger.getLogger(KelolaDataTransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonCariKoleksi;
    private javax.swing.JButton buttonCariPeminjam;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambahPesanan;
    private javax.swing.JButton buttonTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNomor;
    private javax.swing.JLabel labelSeri;
    private javax.swing.JLabel labelVolume;
    private javax.swing.JTable tabelPesananKoleksi;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfIDKoleksi;
    private javax.swing.JTextField tfIDPeminjam;
    private javax.swing.JTextField tfIS;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNomor;
    private javax.swing.JTextField tfPenerbit;
    private javax.swing.JTextField tfPinjam;
    private javax.swing.JTextField tfSeri;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfVolume;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel modelTabel, modelTabelTransaksi;

}

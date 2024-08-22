package Perpustakaan;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KelolaDataPengembalian extends javax.swing.JDialog {

    protected DAOPerpustakaan dao;
    protected Connection conn;
    protected Statement s;
    protected ResultSet rset;
    protected String query;
    protected DefaultTableModel modelTabel;
    private Loading loading;

    public KelolaDataPengembalian(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        loading = new Loading(parent, true);
        loading.setVisible(true);
        initComponents();
        dao = new DAOPerpustakaan();
        DataHandler dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        conn = dataHandler.conn;
    }

    private void tampilDataBarangTerpinjam() throws SQLException {
        String[] columnNames = {"ID Koleksi", "Judul", "Penerbit", "ISSN/ISBN", "Tahun Terbit"};

        query = "SELECT k.id_koleksi, k.judul, k.penerbit, k.isSBn, k.tahunTerbit "
                + "FROM koleksi k, barang_terpinjam b "
                + "WHERE k.id_koleksi = b.id_barang "
                + "AND b.id_transaksi = " + tfID.getText() + "";
        System.out.println("Execute query : " + query);
        rset = s.executeQuery(query);
        while (rset.next()) {
            Koleksi temp = new Koleksi();
            temp.setIdKoleksi(rset.getString(1));
            temp.setJudul(rset.getString(2));
            temp.setPenerbit(rset.getString(3));
            temp.setIS(rset.getString(4));
            temp.setTahunTerbit(rset.getString(5));
            dao.getKoleksi().add(temp);
        }

        Object[][] objData = new Object[dao.listKoleksi.size()][columnNames.length];
        int i = 0;

        for (Koleksi k : dao.listKoleksi) {
            Object[] teks = {k.idKoleksi, k.judul, k.penerbit, k.IS, k.tahunTerbit};
            objData[i] = teks;
            i++;
        }

        modelTabel = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;

            }
        };
        tabelKoleksi.setModel(modelTabel);
        tabelKoleksi.setAutoCreateRowSorter(true);
        tabelKoleksi.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfJenis = new javax.swing.JTextField();
        labelNomor = new javax.swing.JLabel();
        tfNomor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfMaks = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKoleksi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelJenis = new javax.swing.JLabel();
        labelJudul = new javax.swing.JLabel();
        labelDefaultVolume = new javax.swing.JLabel();
        labelVolume = new javax.swing.JLabel();
        labelDefaultSeri = new javax.swing.JLabel();
        labelSeri = new javax.swing.JLabel();
        labelDefaultFormat = new javax.swing.JLabel();
        labelFormat = new javax.swing.JLabel();
        labelDefaultHalaman = new javax.swing.JLabel();
        labelHalaman = new javax.swing.JLabel();
        buttonMengembalikan = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        labelDenda = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelKeterangan = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data Pengembalian");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Masukkan ID Transaksi");

        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setText("FORM PENGEMBALIAN");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("DATA PEMINJAM");

        jLabel4.setText("Nama");

        tfNama.setEditable(false);

        jLabel5.setText("Jenis");

        tfJenis.setEditable(false);

        labelNomor.setText("Nomor");

        tfNomor.setEditable(false);

        jLabel7.setText("Alamat");

        tfAlamat.setEditable(false);

        jLabel8.setText("Maksimal Pinjam");

        tfMaks.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNama)
                    .addComponent(tfJenis)
                    .addComponent(tfNomor)
                    .addComponent(tfAlamat)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(labelNomor)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfMaks))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(130, 130, 130))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelNomor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMaks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelKoleksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Koleksi", "Judul", "Penerbit", "ISSN/ISBN", "Tahun Terbit"
            }
        ));
        tabelKoleksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKoleksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKoleksi);

        jLabel6.setText("DATA BARANG TERPINJAM");

        jLabel9.setText("Jenis");

        jLabel10.setText("Judul");

        labelJenis.setText("-");

        labelJudul.setText("-");

        labelDefaultVolume.setText("Volume");

        labelVolume.setText("-");

        labelDefaultSeri.setText("Seri");

        labelSeri.setText("-");

        labelDefaultFormat.setText("Format");

        labelFormat.setText("-");

        labelDefaultHalaman.setText("Halaman");

        labelHalaman.setText("-");

        buttonMengembalikan.setText("Mengembalikan");
        buttonMengembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMengembalikanActionPerformed(evt);
            }
        });

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(labelDefaultVolume)
                            .addComponent(labelDefaultSeri)
                            .addComponent(labelDefaultFormat)
                            .addComponent(labelDefaultHalaman))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHalaman)
                                    .addComponent(labelJudul)
                                    .addComponent(labelJenis))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelFormat)
                                            .addComponent(labelSeri))
                                        .addGap(125, 346, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(labelVolume)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonMengembalikan)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(203, 203, 203))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelJenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelJudul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDefaultVolume)
                    .addComponent(labelVolume)
                    .addComponent(buttonMengembalikan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDefaultSeri)
                    .addComponent(labelSeri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDefaultFormat)
                    .addComponent(labelFormat))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDefaultHalaman)
                    .addComponent(labelHalaman))
                .addGap(15, 15, 15))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelDenda.setText("   ");

        jLabel11.setText("Keterangan:");

        labelKeterangan.setText("kj");

        jLabel13.setText("Denda: ");

        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(labelDenda))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelKeterangan))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDenda)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(427, 427, 427))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        try {
            String idT = tfID.getText();
            if (idTransaksiDitemukan()) {
                query = "SELECT p.nama, p.jenis, p.nomor, p.alamat, p.maks_pinjam FROM transaksi t, peminjam p WHERE t.peminjam = p.id_peminjam AND t.idTransaksi = " + idT + "";
                System.out.println("Execute query : " + query);
                rset = s.executeQuery(query);
                while (rset.next()) {
                    tfNama.setText(rset.getString(1));
                    tfJenis.setText(rset.getString(2));
                    tfNomor.setText(rset.getString(3));
                    tfAlamat.setText(rset.getString(4));
                    tfMaks.setText(rset.getString(5));
                }
                tampilDataBarangTerpinjam();
            } else {
                JOptionPane.showMessageDialog(null, "ID Transaksi tidak ditemukan");
            }

        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonCariActionPerformed

    private void tabelKoleksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKoleksiMouseClicked
        int selectedRow = tabelKoleksi.getSelectedRow();
        String id = modelTabel.getValueAt(selectedRow, 0).toString();
        String judul = modelTabel.getValueAt(selectedRow, 1).toString();

        try {
            if (id.charAt(0) == 'M') {
                labelJenis.setText("Majalah");
                query = "SELECT vol, seri FROM majalah WHERE id LIKE '" + id + "'";
                rset = s.executeQuery(query);
                while (rset.next()) {
                    labelVolume.setText(rset.getString(1));
                    labelSeri.setText(rset.getString(2));
                    labelFormat.setText("-");
                    labelHalaman.setText("-");
                }
            } else if (id.charAt(0) == 'D') {
                labelJenis.setText("Disk");
                query = "SELECT format FROM kaset WHERE id LIKE '" + id + "'";
                rset = s.executeQuery(query);
                while (rset.next()) {
                    labelFormat.setText(rset.getString(1));
                    labelVolume.setText("-");
                    labelSeri.setText("-");
                    labelHalaman.setText("-");
                }
            } else if (id.charAt(0) == 'B') {
                labelJenis.setText("Buku");
                query = "SELECT halaman FROM buku WHERE id LIKE '" + id + "'";
                rset = s.executeQuery(query);
                while (rset.next()) {
                    labelHalaman.setText(rset.getString(1));
                    labelFormat.setText("-");
                    labelVolume.setText("-");
                    labelSeri.setText("-");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }

        labelJudul.setText(judul);

    }//GEN-LAST:event_tabelKoleksiMouseClicked

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        int opsi = JOptionPane.showConfirmDialog(null, "Keluar dari menu pengembalian?");
        switch (opsi) {
            case JOptionPane.OK_OPTION:
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonMengembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMengembalikanActionPerformed
        ArrayList<String> temp = new ArrayList<>();
        int opsi = JOptionPane.showConfirmDialog(null, "Ingin mengembalikan barang?");
        switch (opsi) {
            case JOptionPane.OK_OPTION:
                try {
                    //delete dari tabel transaksi
                    query = "SELECT id_barang FROM barang_terpinjam WHERE id_transaksi = " + tfID.getText() + "";
                    System.out.println("Executing query : " + query);
                    rset = s.executeQuery(query);

                    while (rset.next()) {
                        query = "UPDATE koleksi SET status = 0 WHERE id_koleksi LIKE '" + rset.getString(1) + "'";
                        System.out.println("Executing query : " + query);
                        temp.add(query);
                    }
                        
                    for (String t : temp) {
                        s.execute(t);
                    }

                    query = "DELETE barang_terpinjam WHERE id_transaksi = " + tfID.getText() + "";
                    System.out.println("Executing query : " + query);
                    s.executeQuery(query);

                    query = "DELETE transaksi WHERE idtransaksi = " + tfID.getText() + "";
                    System.out.println("Executing query : " + query);
                    s.executeQuery(query);
                    
                    reset();
                    JOptionPane.showMessageDialog(null, "Berhasil!, Terima kasih telah mengembalikan");
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaDataPengembalian.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_buttonMengembalikanActionPerformed

    private void resetTabel() {
        String[] columnNames = {"ID Koleksi", "Judul", "Penerbit", "ISSN/ISBN", "Tahun Terbit"};
        Object[][] objData = new Object[0][columnNames.length];
        
        DefaultTableModel awal = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;

            }
        };
        
        tabelKoleksi.setModel(awal);
    }
    
    private void reset() {
        tfAlamat.setText("");
        tfID.setText("");
        tfJenis.setText("");
        tfMaks.setText("");
        tfNama.setText("");
        tfNomor.setText("");
        labelFormat.setText("-");
        labelHalaman.setText("-");
        labelJenis.setText("-");
        labelJudul.setText("-");
        labelSeri.setText("-");
        labelVolume.setText("-");
        dao.listKoleksi.clear();
        resetTabel();
        tabelKoleksi.repaint();
    }
    
    private boolean idTransaksiDitemukan() throws SQLException {
        ArrayList<String> checking = new ArrayList<>();
        s = conn.createStatement();
        String id = tfID.getText();
        query = "SELECT idTransaksi FROM transaksi WHERE idTransaksi LIKE '" + id + "'";
        ResultSet hasil = s.executeQuery(query);
        while (hasil.next()) {
            checking.add(hasil.getString(1));
        }
        return !checking.isEmpty();
    }

    public static void main(String args[]) {

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KelolaDataPengembalian dialog = new KelolaDataPengembalian(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonMengembalikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDefaultFormat;
    private javax.swing.JLabel labelDefaultHalaman;
    private javax.swing.JLabel labelDefaultSeri;
    private javax.swing.JLabel labelDefaultVolume;
    private javax.swing.JLabel labelDenda;
    private javax.swing.JLabel labelFormat;
    private javax.swing.JLabel labelHalaman;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelNomor;
    private javax.swing.JLabel labelSeri;
    private javax.swing.JLabel labelVolume;
    private javax.swing.JTable tabelKoleksi;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfJenis;
    private javax.swing.JTextField tfMaks;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNomor;
    // End of variables declaration//GEN-END:variables
}

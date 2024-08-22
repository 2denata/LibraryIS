package Perpustakaan;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KelolaDataKoleksi extends javax.swing.JDialog {

    Koleksi koleksi;
    DefaultTableModel modelTabel;
    DAOPerpustakaan list = new DAOPerpustakaan();
    private Loading loading;

    //database
    String jdbcURL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    String user;
    String password;
    Connection conn;

    public KelolaDataKoleksi(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        loading = new Loading(parent, true);
        loading.setVisible(true);
        initComponents();
        //awal();
        DataHandler dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        conn = dataHandler.conn;
        tampilDataDB();
    }

    private void awal() {
        textFieldFormat.setVisible(false);
        textFieldHalaman.setVisible(false);
        textFieldISBN.setVisible(false);
        labelFormat.setVisible(false);
        labelHalaman.setVisible(false);
        labelISBN.setVisible(false);
        textFieldVolume.setVisible(false);
        textFieldSeri.setVisible(false);
        textFieldISSN.setVisible(false);
        textFieldHalaman.setVisible(false);
        labelVolume.setVisible(false);
        labelSeri.setVisible(false);
        labelISSN.setVisible(false);
        labelHalaman.setVisible(false);
        buttonTambah.setEnabled(false);

    }

    private void reset() {
        textFieldFormat.setText("");
        textFieldHalaman.setText("");
        textFieldIDKoleksi.setText("");
        textFieldISBN.setText("");
        textFieldISSN.setText("");
        textFieldJudul.setText("");
        textFieldPenerbit.setText("");
        textFieldSeri.setText("");
        textFieldVolume.setText("");
        textFieldTahunTerbit.setText("");
        checkBoxStatusPinjam.setSelected(false);
        radioBuku.setSelected(false);
        radioMajalah.setSelected(false);
        radioBuku.setSelected(false);
        buttonGroup1.clearSelection();
        checkBoxVerif.setSelected(false);
        buttonTambah.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelTextField = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKoleksi = new javax.swing.JTable();
        radioBuku = new javax.swing.JRadioButton();
        radioMajalah = new javax.swing.JRadioButton();
        radioDisk = new javax.swing.JRadioButton();
        labelIDKoleksi = new javax.swing.JLabel();
        textFieldIDKoleksi = new javax.swing.JTextField();
        labelJudul = new javax.swing.JLabel();
        labelPenerbit = new javax.swing.JLabel();
        textFieldJudul = new javax.swing.JTextField();
        textFieldPenerbit = new javax.swing.JTextField();
        textFieldISBN = new javax.swing.JTextField();
        checkBoxStatusPinjam = new javax.swing.JCheckBox();
        labelVolume = new javax.swing.JLabel();
        labelHalaman = new javax.swing.JLabel();
        labelFormat = new javax.swing.JLabel();
        textFieldSeri = new javax.swing.JTextField();
        textFieldHalaman = new javax.swing.JTextField();
        textFieldVolume = new javax.swing.JTextField();
        labelSeri = new javax.swing.JLabel();
        textFieldISSN = new javax.swing.JTextField();
        labelStatusPinjam1 = new javax.swing.JLabel();
        labelISSN = new javax.swing.JLabel();
        textFieldTahunTerbit = new javax.swing.JTextField();
        textFieldFormat = new javax.swing.JTextField();
        labelISBN = new javax.swing.JLabel();
        labelStatusPinjam = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        checkBoxVerif = new javax.swing.JCheckBox();
        buttonHapus = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data Koleksi");

        panelTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelKoleksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Koleksi", "Judul", "Penerbit", "Status Pinjam", "ISBN/ISSN", "Tahun Terbit"
            }
        ));
        tabelKoleksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKoleksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKoleksi);

        buttonGroup1.add(radioBuku);
        radioBuku.setText("Buku");
        radioBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBukuActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioMajalah);
        radioMajalah.setText("Majalah");
        radioMajalah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMajalahActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioDisk);
        radioDisk.setText("Disk");
        radioDisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiskActionPerformed(evt);
            }
        });

        labelIDKoleksi.setText("id Koleksi");

        textFieldIDKoleksi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldIDKoleksiFocusLost(evt);
            }
        });

        labelJudul.setText("Judul");

        labelPenerbit.setText("Penerbit");

        checkBoxStatusPinjam.setText("Dipinjam");

        labelVolume.setText("Volume");

        labelHalaman.setText("Halaman");

        labelFormat.setText("Format");

        textFieldSeri.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldSeriFocusLost(evt);
            }
        });

        textFieldHalaman.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldHalamanFocusLost(evt);
            }
        });

        textFieldVolume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldVolumeFocusLost(evt);
            }
        });

        labelSeri.setText("Seri");

        labelStatusPinjam1.setText("Tahun Terbit");

        labelISSN.setText("ISSN");

        textFieldTahunTerbit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldTahunTerbitFocusLost(evt);
            }
        });

        textFieldFormat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFormatFocusLost(evt);
            }
        });

        labelISBN.setText("ISBN");

        labelStatusPinjam.setText("Status Pinjam");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        checkBoxVerif.setText("Verifikasi");
        checkBoxVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxVerifActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

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
                .addGap(84, 84, 84)
                .addComponent(checkBoxVerif)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(checkBoxVerif)
                .addGap(18, 18, 18)
                .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout panelTextFieldLayout = new javax.swing.GroupLayout(panelTextField);
        panelTextField.setLayout(panelTextFieldLayout);
        panelTextFieldLayout.setHorizontalGroup(
            panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelStatusPinjam)
                        .addGroup(panelTextFieldLayout.createSequentialGroup()
                            .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelIDKoleksi)
                                .addComponent(labelPenerbit)
                                .addComponent(labelJudul)
                                .addComponent(labelStatusPinjam1)
                                .addComponent(labelVolume)
                                .addComponent(labelSeri)
                                .addComponent(labelISSN)
                                .addComponent(labelISBN)
                                .addComponent(labelFormat)
                                .addComponent(labelHalaman))
                            .addGap(98, 98, 98)
                            .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldISSN, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldSeri, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBoxStatusPinjam)
                                .addGroup(panelTextFieldLayout.createSequentialGroup()
                                    .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldIDKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelTextFieldLayout.createSequentialGroup()
                                            .addComponent(radioMajalah)
                                            .addGap(126, 126, 126)
                                            .addComponent(radioDisk)
                                            .addGap(125, 125, 125)
                                            .addComponent(radioBuku)))
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelTextFieldLayout.setVerticalGroup(
            panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextFieldLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTextFieldLayout.createSequentialGroup()
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioMajalah)
                            .addComponent(radioDisk)
                            .addComponent(radioBuku))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIDKoleksi)
                            .addComponent(textFieldIDKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJudul)
                            .addComponent(textFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPenerbit)
                            .addComponent(textFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelStatusPinjam)
                            .addComponent(checkBoxStatusPinjam))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelStatusPinjam1)
                            .addComponent(textFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVolume)
                            .addComponent(textFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSeri)
                            .addComponent(textFieldSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelISSN)
                            .addComponent(textFieldISSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelISBN)
                            .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFormat)
                            .addComponent(textFieldFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHalaman)
                            .addComponent(textFieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTextFieldLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("Form Data Koleksi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(panelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioMajalahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMajalahActionPerformed
        //show
        textFieldVolume.setVisible(true);
        textFieldSeri.setVisible(true);
        textFieldISSN.setVisible(true);
        labelVolume.setVisible(true);
        labelSeri.setVisible(true);
        labelISSN.setVisible(true);
        //hide
        textFieldFormat.setVisible(false);
        textFieldHalaman.setVisible(false);
        textFieldISBN.setVisible(false);
        labelFormat.setVisible(false);
        labelHalaman.setVisible(false);
        labelISBN.setVisible(false);
    }//GEN-LAST:event_radioMajalahActionPerformed

    private void radioDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiskActionPerformed
        textFieldFormat.setVisible(true);
        labelFormat.setVisible(true);
        textFieldISBN.setVisible(true);
        labelISBN.setVisible(true);
        textFieldVolume.setVisible(false);
        textFieldSeri.setVisible(false);
        textFieldISSN.setVisible(false);
        textFieldHalaman.setVisible(false);
        labelVolume.setVisible(false);
        labelSeri.setVisible(false);
        labelISSN.setVisible(false);
        labelHalaman.setVisible(false);
    }//GEN-LAST:event_radioDiskActionPerformed


    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        try {
            if (idTersedia()) {
                try {
                    //MAJALAH
                    if (radioMajalah.isSelected()) {
                        String id, judul, penerbit, issn, tgl;
                        int volume, seri;
                        boolean checkBox;
                        int status;
                        id = textFieldIDKoleksi.getText();
                        judul = textFieldJudul.getText();
                        penerbit = textFieldPenerbit.getText();
                        issn = textFieldISSN.getText();
                        volume = Integer.parseInt(textFieldVolume.getText());
                        seri = Integer.parseInt(textFieldSeri.getText());
                        tgl = textFieldTahunTerbit.getText();
                        checkBox = checkBoxStatusPinjam.isSelected();
                        if (checkBox) {
                            status = 1;
                        } else {
                            status = 0;
                        }
                        if (id.isEmpty() || judul.isEmpty() || penerbit.isEmpty() || issn.isEmpty()
                                || textFieldVolume.getText().isEmpty() || textFieldSeri.getText().isEmpty()) {
                            throw new Exception();
                        }
                        koleksi = new Majalah(volume, seri, issn, id, judul, penerbit, checkBox);

                        String query1 = "INSERT INTO koleksi (id_koleksi, judul, penerbit, issbn, status, tahunTerbit)"
                                + " VALUES ('" + id + "', '" + judul + "', '" + penerbit + "', " + issn + ", " + status + ", " + tgl + ")";
                        String query2 = "INSERT INTO majalah (id, vol, seri)"
                                + " VALUES ('" + id + "'," + volume + "," + seri + ")";
                        Statement stmt = conn.createStatement();
                        System.out.println("Executing query " + query1);
                        stmt.executeQuery(query1);
                        System.out.println("Executing query " + query2);
                        stmt.executeQuery(query2);

                        //DISK
                    } else if (radioDisk.isSelected()) {
                        String id, judul, penerbit, f, ISBN, tgl;
                        boolean checkBox;
                        int status;
                        f = textFieldFormat.getText();
                        id = textFieldIDKoleksi.getText();
                        judul = textFieldJudul.getText();
                        penerbit = textFieldPenerbit.getText();
                        ISBN = textFieldISBN.getText();
                        tgl = textFieldTahunTerbit.getText();
                        checkBox = checkBoxStatusPinjam.isSelected();
                        if (checkBox) {
                            status = 1;
                        } else {
                            status = 0;
                        }
                        if (id.isEmpty() || judul.isEmpty() || penerbit.isEmpty() || ISBN.isEmpty() || f.isEmpty()) {
                            throw new Exception();
                        }
                        if (f.equals("Audio") || f.equals("Video") || f.equals("Document")) {
                            koleksi = new Disk(f, ISBN, id, judul, penerbit, checkBox);
                            String query1 = "INSERT INTO koleksi (id_koleksi, judul, penerbit, issbn, status, tahunTerbit)"
                                    + " VALUES ('" + id + "', '" + judul + "', '" + penerbit + "', " + ISBN + ", " + status + ", " + tgl + ")";
                            String query2 = "INSERT INTO kaset (id, format) VALUES ('" + id + "', '" + f + "')";
                            Statement stmt = conn.createStatement();
                            System.out.println("Executing query " + query1);
                            stmt.executeQuery(query1);
                            System.out.println("Executing query " + query2);
                            stmt.executeQuery(query2);

                        } else {
                            JOptionPane.showMessageDialog(this, "Format Disk berupa 'Audio', 'Video', dan 'Document'");
                            textFieldFormat.setText("");
                        }

                        //BUKU
                    } else if (radioBuku.isSelected()) {
                        String id, judul, penerbit, ISBN, hal, tgl;
                        int halaman, status;
                        boolean checkBox;
                        id = textFieldIDKoleksi.getText();
                        judul = textFieldJudul.getText();
                        penerbit = textFieldPenerbit.getText();
                        ISBN = textFieldISBN.getText();
                        tgl = textFieldTahunTerbit.getText();
                        hal = textFieldHalaman.getText();
                        halaman = Integer.parseInt(textFieldHalaman.getText());
                        checkBox = checkBoxStatusPinjam.isSelected();
                        if (checkBox) {
                            status = 1;
                        } else {
                            status = 0;
                        }
                        if (id.isEmpty() || judul.isEmpty() || penerbit.isEmpty() || ISBN.isEmpty() || hal.isEmpty()) {
                            throw new Exception();
                        }

                        koleksi = new Buku(halaman, ISBN, id, judul, penerbit, checkBox);
                        String query1 = "INSERT INTO koleksi (id_koleksi, judul, penerbit, issbn, status, tahunTerbit)"
                                + " VALUES ('" + id + "', '" + judul + "', '" + penerbit + "', " + ISBN + ", " + status + ", " + tgl + ")";
                        String query2 = "INSERT INTO buku (id, halaman) VALUES ('" + id + "', '" + halaman + "')";
                        Statement stmt = conn.createStatement();
                        System.out.println("Executing query " + query1);
                        stmt.executeQuery(query1);
                        System.out.println("Executing query " + query2);
                        stmt.executeQuery(query2);
                    }

                    list.getKoleksi().add(koleksi);
                    tampilDataDB();
                    reset();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Mohon masukkan halaman, volume, atau seri dengan angka");
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaDataKoleksi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Mohon isi semua data yang tersedia");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Maaf ID sudah terpakai, coba lagi");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataKoleksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void tampilDataDB() throws SQLException {
        ArrayList<Koleksi> temp = new ArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rset;

        String[] columnNames = {"ID Koleksi", "Judul", "Penerbit", "Status Pinjam", "ISBN/ISSN", "Tahun Terbit"};

        String query = "SELECT * FROM koleksi";
        rset = stmt.executeQuery(query);
        while (rset.next()) {
            Koleksi sementara = new Koleksi(rset.getString(1), rset.getString(2), rset.getString(3), rset.getBoolean(5));
            sementara.setIS(rset.getString(4));
            sementara.setTahunTerbit(rset.getString(6));
            temp.add(sementara);
        }

        Object[][] objData = new Object[temp.size()][columnNames.length];
        int i = 0;

        for (Koleksi k : temp) {
            Object[] teks = {k.idKoleksi, k.judul, k.penerbit, k.isStatus_pinjam(), k.IS, k.tahunTerbit};
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

    public boolean idTersedia() throws SQLException {
        ArrayList<String> checking = new ArrayList<>();
        Statement s = conn.createStatement();
        String id = textFieldIDKoleksi.getText();
        String query = "SELECT id_koleksi FROM koleksi WHERE id_koleksi LIKE '" + id + "'";
        ResultSet hasil = s.executeQuery(query);
        while (hasil.next()) {
            checking.add(hasil.getString(1));
        }
        if (checking.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void radioBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBukuActionPerformed
        textFieldHalaman.setVisible(true);
        textFieldISBN.setVisible(true);
        labelHalaman.setVisible(true);
        labelISBN.setVisible(true);
        textFieldFormat.setVisible(false);
        textFieldISSN.setVisible(false);
        textFieldVolume.setVisible(false);
        textFieldSeri.setVisible(false);
        labelFormat.setVisible(false);
        labelISSN.setVisible(false);
        labelVolume.setVisible(false);
        labelSeri.setVisible(false);

    }//GEN-LAST:event_radioBukuActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        reset();
        awal();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        int opsi = JOptionPane.showConfirmDialog(this, "Yakin ingin keluar?");
        switch (opsi) {
            case JOptionPane.OK_OPTION:
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                break;

        }
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int a = tabelKoleksi.getSelectedRow();
        String idKoleksi = modelTabel.getValueAt(a, 0).toString();
        String query;
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?");

        switch (opsi) {
            case JOptionPane.OK_OPTION:
                try {
                    if (a == -1) {
                    } else {
                        if (idKoleksi.charAt(0) == 'M') {
                            query = "DELETE majalah WHERE id LIKE '" + idKoleksi + "'";
                        } else if (idKoleksi.charAt(0) == 'D') {
                            query = "DELETE kaset WHERE id LIKE '" + idKoleksi + "'";
                        } else {
                            query = "DELETE buku WHERE id LIKE '" + idKoleksi + "'";
                        }
                        String query2 = "DELETE KOLEKSI WHERE id_koleksi LIKE '" + idKoleksi + "'";
                        Statement stmt = conn.createStatement();
                        stmt.executeQuery(query);
                        stmt.executeQuery(query2);
                        tampilDataDB();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaDataKoleksi.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
        reset();
        awal();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void textFieldIDKoleksiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldIDKoleksiFocusLost
        String id = textFieldIDKoleksi.getText();
        if (id.isEmpty()) {
        } else if (id.charAt(0) == 'D' || id.charAt(0) == 'M' || id.charAt(0) == 'B') {
        } else {
            JOptionPane.showMessageDialog(this, "ID Koleksi harus diawali dengan D/M/B");
            textFieldIDKoleksi.setText("");
            return;
        }

        if (id.isEmpty()) {
        } else {
            if (radioMajalah.isSelected()) {
                if (id.charAt(0) == 'M') {
                } else {
                    JOptionPane.showMessageDialog(this, "ID Majalah diawali huruf M!");
                    textFieldIDKoleksi.setText("");
                }
            } else if (radioDisk.isSelected()) {
                if (id.charAt(0) == 'D') {
                } else {
                    JOptionPane.showMessageDialog(this, "ID Disk diawali huruf D!");
                    textFieldIDKoleksi.setText("");
                }
            } else if (radioBuku.isSelected()) {
                if (id.charAt(0) == 'B') {
                } else {
                    JOptionPane.showMessageDialog(this, "ID Buku diawali huruf B!");
                    textFieldIDKoleksi.setText("");
                }
            }
        }
    }//GEN-LAST:event_textFieldIDKoleksiFocusLost

    private void textFieldTahunTerbitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldTahunTerbitFocusLost
        String pattern = "[0-9]*";
        String tahun = textFieldTahunTerbit.getText();
        if (tahun.matches(pattern) && tahun.length() == 4) {
        } else if (tahun.matches(pattern)) {
            JOptionPane.showMessageDialog(this, "Mohon memasukkan 4 angka tahun");
            textFieldTahunTerbit.setText("");
        } else if (tahun.length() == 4) {
            JOptionPane.showMessageDialog(this, "Mohon memasukkan angka untuk tahun!");
            textFieldTahunTerbit.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Mohon memasukkan format tahun yang benar!");
            textFieldTahunTerbit.setText("");
        }
    }//GEN-LAST:event_textFieldTahunTerbitFocusLost

    private void textFieldVolumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldVolumeFocusLost
        String pattern = "[0-9]*";
        String volume = textFieldVolume.getText();
        if (!(volume.matches(pattern))) {
            JOptionPane.showMessageDialog(this, "Volume berupa digit integer!");
            textFieldVolume.setText("");
        }
    }//GEN-LAST:event_textFieldVolumeFocusLost

    private void textFieldSeriFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSeriFocusLost
        String pattern = "[0-9]*";
        String volume = textFieldSeri.getText();
        if (!(volume.matches(pattern))) {
            JOptionPane.showMessageDialog(this, "Seri berupa digit integer!");
            textFieldSeri.setText("");
        }
    }//GEN-LAST:event_textFieldSeriFocusLost

    private void textFieldHalamanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldHalamanFocusLost
        String pattern = "[0-9]*";
        String volume = textFieldHalaman.getText();
        if (!(volume.matches(pattern))) {
            JOptionPane.showMessageDialog(this, "Halaman berupa digit integer!");
            textFieldHalaman.setText("");
        }
    }//GEN-LAST:event_textFieldHalamanFocusLost

    private void textFieldFormatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFormatFocusLost
        String f = textFieldFormat.getText();
        if (f.equals("Audio") || f.equals("Video") || f.equals("Document")) {
        } else {
            JOptionPane.showMessageDialog(this, "Format Disk berupa 'Audio', 'Video', dan 'Document'");
            textFieldFormat.setText("");
        }
    }//GEN-LAST:event_textFieldFormatFocusLost

    private void tabelKoleksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKoleksiMouseClicked
        try {
            reset();
            int selectedRow = tabelKoleksi.getSelectedRow();
            String id = modelTabel.getValueAt(selectedRow, 0).toString();
            String query;
            Statement stmt = conn.createStatement();
            ResultSet rset;

            textFieldIDKoleksi.setText(modelTabel.getValueAt(selectedRow, 0).toString());
            textFieldJudul.setText(modelTabel.getValueAt(selectedRow, 1).toString());
            textFieldPenerbit.setText(modelTabel.getValueAt(selectedRow, 2).toString());

            String temp = modelTabel.getValueAt(selectedRow, 3).toString();
            if (temp.equals("true")) {
                checkBoxStatusPinjam.setSelected(true);
            } else {
                checkBoxStatusPinjam.setSelected(false);
            }
            textFieldTahunTerbit.setText(modelTabel.getValueAt(selectedRow, 5).toString());
            if (id.charAt(0) == 'M') {
                query = "SELECT vol, seri FROM majalah WHERE id LIKE '" + id + "'";
                rset = stmt.executeQuery(query);
                while (rset.next()) {
                    textFieldVolume.setText(rset.getString(1));
                    textFieldSeri.setText(rset.getString(2));
                }
                textFieldISSN.setText(modelTabel.getValueAt(selectedRow, 4).toString());

                //set visible
                textFieldVolume.setVisible(true);
                textFieldSeri.setVisible(true);
                textFieldISSN.setVisible(true);
                labelVolume.setVisible(true);
                labelSeri.setVisible(true);
                labelISSN.setVisible(true);
                textFieldFormat.setVisible(false);
                textFieldHalaman.setVisible(false);
                textFieldISBN.setVisible(false);
                labelFormat.setVisible(false);
                labelHalaman.setVisible(false);
                labelISBN.setVisible(false);
                radioMajalah.setSelected(true);

            } else if (id.charAt(0) == 'D') {
                query = "SELECT format FROM kaset WHERE id LIKE '" + id + "'";
                rset = stmt.executeQuery(query);
                while (rset.next()) {
                    textFieldFormat.setText(rset.getString(1));
                }
                textFieldISBN.setText(modelTabel.getValueAt(selectedRow, 4).toString());

                //set visible
                textFieldFormat.setVisible(true);
                labelFormat.setVisible(true);
                textFieldISBN.setVisible(true);
                labelISBN.setVisible(true);
                textFieldVolume.setVisible(false);
                textFieldSeri.setVisible(false);
                textFieldISSN.setVisible(false);
                textFieldHalaman.setVisible(false);
                labelVolume.setVisible(false);
                labelSeri.setVisible(false);
                labelISSN.setVisible(false);
                labelHalaman.setVisible(false);
                radioDisk.setSelected(true);

            } else if (id.charAt(0) == 'B') {
                query = "SELECT halaman FROM buku WHERE id LIKE '" + id + "'";
                rset = stmt.executeQuery(query);
                while (rset.next()) {
                    textFieldHalaman.setText(rset.getString(1));
                }
                textFieldISBN.setText(modelTabel.getValueAt(selectedRow, 4).toString());

                //set visible
                textFieldHalaman.setVisible(true);
                textFieldISBN.setVisible(true);
                labelHalaman.setVisible(true);
                labelISBN.setVisible(true);
                textFieldFormat.setVisible(false);
                textFieldISSN.setVisible(false);
                textFieldVolume.setVisible(false);
                textFieldSeri.setVisible(false);
                labelFormat.setVisible(false);
                labelISSN.setVisible(false);
                labelVolume.setVisible(false);
                labelSeri.setVisible(false);
                radioBuku.setSelected(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataKoleksi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tabelKoleksiMouseClicked

    private void checkBoxVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxVerifActionPerformed
        if (checkBoxVerif.isSelected()) {
            buttonTambah.setEnabled(true);
        } else {
            buttonTambah.setEnabled(false);
        }
    }//GEN-LAST:event_checkBoxVerifActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KelolaDataKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaDataKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaDataKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaDataKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KelolaDataKoleksi dialog = new KelolaDataKoleksi(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaDataKoleksi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JCheckBox checkBoxStatusPinjam;
    private javax.swing.JCheckBox checkBoxVerif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFormat;
    private javax.swing.JLabel labelHalaman;
    private javax.swing.JLabel labelIDKoleksi;
    private javax.swing.JLabel labelISBN;
    private javax.swing.JLabel labelISSN;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelPenerbit;
    private javax.swing.JLabel labelSeri;
    private javax.swing.JLabel labelStatusPinjam;
    private javax.swing.JLabel labelStatusPinjam1;
    private javax.swing.JLabel labelVolume;
    private javax.swing.JPanel panelTextField;
    private javax.swing.JRadioButton radioBuku;
    private javax.swing.JRadioButton radioDisk;
    private javax.swing.JRadioButton radioMajalah;
    private javax.swing.JTable tabelKoleksi;
    private javax.swing.JTextField textFieldFormat;
    private javax.swing.JTextField textFieldHalaman;
    private javax.swing.JTextField textFieldIDKoleksi;
    private javax.swing.JTextField textFieldISBN;
    private javax.swing.JTextField textFieldISSN;
    private javax.swing.JTextField textFieldJudul;
    private javax.swing.JTextField textFieldPenerbit;
    private javax.swing.JTextField textFieldSeri;
    private javax.swing.JTextField textFieldTahunTerbit;
    private javax.swing.JTextField textFieldVolume;
    // End of variables declaration//GEN-END:variables

}

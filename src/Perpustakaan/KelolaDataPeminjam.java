package Perpustakaan;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class KelolaDataPeminjam extends javax.swing.JDialog {

    DAOPerpustakaan list = new DAOPerpustakaan();
    Peminjam peminjam;
    DefaultTableModel modelTabel;
    private Loading loading;

    //database
    Connection conn;

    public KelolaDataPeminjam(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        loading = new Loading(parent, true);
        loading.setVisible(true);
        initComponents();
        buttonTambah.setEnabled(false);
        DataHandler dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        conn = dataHandler.conn;
        tampilDataDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelFormDataPeminjam = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        radioDosen = new javax.swing.JRadioButton();
        radioMahasiswa = new javax.swing.JRadioButton();
        radioUmum = new javax.swing.JRadioButton();
        labelIDPeminjam = new javax.swing.JLabel();
        labelNomor = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelJumlahPinjam = new javax.swing.JLabel();
        textFIeldIDPeminjam = new javax.swing.JTextField();
        textFieldNomor = new javax.swing.JTextField();
        textFIeldNama = new javax.swing.JTextField();
        textFieldAlamat = new javax.swing.JTextField();
        textFieldJumlahPinjam = new javax.swing.JTextField();
        buttonTambah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPeminjam = new javax.swing.JTable();
        cbVerifikasi = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data Peminjam");

        labelFormDataPeminjam.setText("Form Data Peminjam");

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonGroup1.add(radioDosen);
        radioDosen.setText("Dosen");
        radioDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDosenActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioMahasiswa);
        radioMahasiswa.setText("Mahasiswa");
        radioMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMahasiswaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioUmum);
        radioUmum.setText("Umum");
        radioUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUmumActionPerformed(evt);
            }
        });

        labelIDPeminjam.setText("id Peminjam");

        labelNomor.setText("Nomor");

        labelNama.setText("Nama");

        labelAlamat.setText("Alamat");

        labelJumlahPinjam.setText("Jumlah Pinjam");

        textFIeldIDPeminjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFIeldIDPeminjamFocusLost(evt);
            }
        });

        textFieldNomor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNomorFocusLost(evt);
            }
        });

        textFIeldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFIeldNamaFocusLost(evt);
            }
        });
        textFIeldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFIeldNamaActionPerformed(evt);
            }
        });

        textFieldJumlahPinjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldJumlahPinjamFocusLost(evt);
            }
        });

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
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

        tabelPeminjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Peminjam", "Nomor", "Nama", "Alamat", "Maks Pinjam"
            }
        ));
        tabelPeminjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPeminjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPeminjam);

        cbVerifikasi.setText("Verifikasi");
        cbVerifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVerifikasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(radioDosen)
                                .addGap(126, 126, 126)
                                .addComponent(radioMahasiswa)
                                .addGap(125, 125, 125)
                                .addComponent(radioUmum))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIDPeminjam)
                                    .addComponent(labelNomor)
                                    .addComponent(labelNama)
                                    .addComponent(labelAlamat)
                                    .addComponent(labelJumlahPinjam))
                                .addGap(37, 37, 37)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFIeldIDPeminjam)
                                    .addComponent(textFieldNomor)
                                    .addComponent(textFIeldNama)
                                    .addComponent(textFieldAlamat)
                                    .addComponent(textFieldJumlahPinjam))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(cbVerifikasi)
                                .addGap(83, 83, 83))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDosen)
                            .addComponent(radioMahasiswa)
                            .addComponent(radioUmum))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(cbVerifikasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIDPeminjam)
                            .addComponent(textFIeldIDPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomor)
                            .addComponent(textFieldNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(textFIeldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlamat)
                            .addComponent(textFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJumlahPinjam)
                            .addComponent(textFieldJumlahPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFormDataPeminjam)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelFormDataPeminjam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        try {
            buatFile();
        } catch (IOException ex) {
            Logger.getLogger(KelolaDataPeminjam.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void textFIeldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFIeldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFIeldNamaActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        reset();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buatFile() throws FileNotFoundException, IOException {
        File outFile = new File("C:\\Users\\LENOVO\\Desktop\\Peminjam.dat");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);

        Peminjam[] temp = new Peminjam[list.getPeminjam().size()];
        for (int i = 0; i < list.getPeminjam().size(); i++) {
            temp[i] = list.getPeminjam().get(i);
        }

        outObjectStream.writeObject(temp);
        outObjectStream.close();
    }

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        try {
            if (idTersedia()) {
                try {
                    if (radioDosen.isSelected()) {
                        String id, nomor, nama, alamat;
                        int maksPinjam;
                        id = textFIeldIDPeminjam.getText();
                        nomor = textFieldNomor.getText();
                        nama = textFIeldNama.getText();
                        alamat = textFieldAlamat.getText();
                        maksPinjam = Integer.parseInt(textFieldJumlahPinjam.getText());
                        if (id.isEmpty() || nomor.isEmpty() || nama.isEmpty() || alamat.isEmpty() || textFieldJumlahPinjam.getText().isEmpty()) {
                            throw new Exception();
                        }
                        peminjam = new Dosen(nomor, id, nama, alamat, maksPinjam);
                        String query = "INSERT INTO peminjam (id_peminjam, nama, jenis, nomor, alamat, maks_pinjam)"
                                + "           VALUES ('" + id + "', '" + nama + "', 'Dosen'," + nomor + ", '" + alamat + "', " + maksPinjam + ")";
                        Statement stmt = conn.createStatement();
                        System.out.println("Execute Query : " + query);
                        stmt.executeQuery(query);

                    } else if (radioMahasiswa.isSelected()) {
                        String id, nomor, nama, alamat;
                        int maksPinjam;
                        id = textFIeldIDPeminjam.getText();
                        nomor = textFieldNomor.getText();
                        nama = textFIeldNama.getText();
                        alamat = textFieldAlamat.getText();
                        maksPinjam = Integer.parseInt(textFieldJumlahPinjam.getText());
                        if (id.isEmpty() || nomor.isEmpty() || nama.isEmpty() || alamat.isEmpty() || textFieldJumlahPinjam.getText().isEmpty()) {
                            throw new Exception();
                        }
                        peminjam = new Mahasiswa(nomor, id, nama, alamat, maksPinjam);
                        String query = "INSERT INTO peminjam (id_peminjam, nama, jenis, nomor, alamat, maks_pinjam)"
                                + "           VALUES ('" + id + "', '" + nama + "', 'Mahasiswa'," + nomor + ", '" + alamat + "', " + maksPinjam + ")";
                        Statement stmt = conn.createStatement();
                        System.out.println("Execute Query : " + query);
                        stmt.executeQuery(query);

                    } else if (radioUmum.isSelected()) {
                        String id, nomor, nama, alamat;
                        int maksPinjam;
                        id = textFIeldIDPeminjam.getText();
                        nomor = textFieldNomor.getText();
                        nama = textFIeldNama.getText();
                        alamat = textFieldAlamat.getText();
                        maksPinjam = Integer.parseInt(textFieldJumlahPinjam.getText());
                        if (id.isEmpty() || nomor.isEmpty() || nama.isEmpty() || alamat.isEmpty() || textFieldJumlahPinjam.getText().isEmpty()) {
                            throw new Exception();
                        }
                        peminjam = new Umum(nomor, id, nama, alamat, maksPinjam);
                        String query = "INSERT INTO peminjam (id_peminjam, nama, jenis, nomor, alamat, maks_pinjam)"
                                + "           VALUES ('" + id + "', '" + nama + "', 'Umum'," + nomor + ", '" + alamat + "', " + maksPinjam + ")";
                        Statement stmt = conn.createStatement();
                        System.out.println("Execute Query : " + query);
                        stmt.executeQuery(query);

                    }
                    list.getPeminjam().add(peminjam);
                    tampilDataDB();
                    reset();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Mohon masukkan data dengan benar");
                } catch (SQLException e) {
                    Logger.getLogger(KelolaDataPeminjam.class.getName()).log(Level.SEVERE, null, e);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Mohon isi semua data!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Maaf ID Peminjam sudah terpakai, coba lagi");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaDataPeminjam.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buttonTambahActionPerformed

    private boolean idTersedia() throws SQLException {
        ArrayList<String> checking = new ArrayList<>();
        Statement s = conn.createStatement();
        String id = textFIeldIDPeminjam.getText();
        String query = "SELECT id_peminjam FROM peminjam WHERE id_peminjam LIKE '" + id + "'";
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

    private void tampilData() {
        String[] columnNames = {"ID Peminjam", "Nomor", "Nama", "Alamat", "Maks Pinjam"};
        Object[][] objData = new Object[list.getPeminjam().size()][columnNames.length];
        int i = 0;
        for (Peminjam p : list.getPeminjam()) {
            Object[] teks = {p.getIdPeminjam(), p.getNomor(), p.getNama(), p.getAlamat(), p.getMak_pinjam()};
            objData[i] = teks;
            i++;
        }
        modelTabel = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;

            }
        };
        tabelPeminjam.setModel(modelTabel);
        tabelPeminjam.setAutoCreateRowSorter(true);
        tabelPeminjam.repaint();
    }

    private void tampilDataDB() throws SQLException {
        ArrayList<Peminjam> temp = new ArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rset;

        String[] columnNames = {"ID Peminjam", "Nama", "Jenis", "No Identitas", "Alamat", "Maks pinjam"};

        String query = "SELECT * FROM peminjam";
        rset = stmt.executeQuery(query);
        while (rset.next()) {
            Peminjam sementara = new Peminjam(rset.getString(1), rset.getString(2), rset.getString(3), rset.getLong(4), rset.getString(5), rset.getInt(6));
            temp.add(sementara);
        }

        Object[][] objData = new Object[temp.size()][columnNames.length];
        int i = 0;

        for (Peminjam p : temp) {
            Object[] teks = {p.idPeminjam, p.nama, p.jenis, p.nomor, p.alamat, p.mak_pinjam};
            objData[i] = teks;
            i++;
        }

        modelTabel = new DefaultTableModel(objData, columnNames) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;

            }
        };
        tabelPeminjam.setModel(modelTabel);
        tabelPeminjam.setAutoCreateRowSorter(true);
        tabelPeminjam.repaint();
    }


    private void radioDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDosenActionPerformed
        labelNomor.setText("NIP");
    }//GEN-LAST:event_radioDosenActionPerformed

    private void radioMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMahasiswaActionPerformed
        labelNomor.setText("NIM");
    }//GEN-LAST:event_radioMahasiswaActionPerformed

    private void radioUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUmumActionPerformed
        labelNomor.setText("NIK");
    }//GEN-LAST:event_radioUmumActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int a = tabelPeminjam.getSelectedRow();
        String idKoleksi = modelTabel.getValueAt(a, 0).toString();
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?");

        switch (opsi) {
            case JOptionPane.OK_OPTION:
                try {
                    if (a == -1) {
                    } else {
                        String query2 = "DELETE peminjam WHERE id_peminjam LIKE '" + idKoleksi + "'";
                        Statement stmt = conn.createStatement();
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
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void textFIeldIDPeminjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFIeldIDPeminjamFocusLost
        String id = textFIeldIDPeminjam.getText();
        if (id.isEmpty()) {
        } else if (id.charAt(0) == 'M' || id.charAt(0) == 'D' || id.charAt(0) == 'U') {
        } else {
            JOptionPane.showMessageDialog(this, "ID Peminjam harus diawali dengan M/D/U");
            textFIeldIDPeminjam.setText("");
            return;
        }

        if (id.isEmpty()) {
        } else {
            if (radioDosen.isSelected()) {
                if (id.charAt(0) == 'D') {

                } else {
                    JOptionPane.showMessageDialog(this, "ID Dosen diawali huruf D!");
                    textFIeldIDPeminjam.setText("");
                }
            } else if (radioMahasiswa.isSelected()) {
                if (id.charAt(0) == 'M') {

                } else {
                    JOptionPane.showMessageDialog(this, "ID Mahasiswa diawali huruf M!");
                    textFIeldIDPeminjam.setText("");
                }
            } else if (radioUmum.isSelected()) {
                if (id.charAt(0) == 'U') {

                } else {
                    JOptionPane.showMessageDialog(this, "ID Umum diawali huruf U!");
                    textFIeldIDPeminjam.setText("");
                }
            }
        }
    }//GEN-LAST:event_textFIeldIDPeminjamFocusLost

    private void textFieldNomorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNomorFocusLost
        String n = textFieldNomor.getText();

        if (radioDosen.isSelected()) {
            if (n.isEmpty()) {
            } else if (n.length() != 18) {
                JOptionPane.showMessageDialog(this, "NIP berupa 18 digit angka");
                textFieldNomor.setText("");
            }
        } else if (radioMahasiswa.isSelected()) {
            if (n.isEmpty()) {
            } else if (n.length() != 9) {
                JOptionPane.showMessageDialog(this, "NIM berupa 9 digit angka");
                textFieldNomor.setText("");
            }
        } else if (radioUmum.isSelected()) {
            if (n.isEmpty()) {
            } else if (n.length() != 16) {
                JOptionPane.showMessageDialog(this, "NIK berupa 16 digit angka");
                textFieldNomor.setText("");
            }
        }
    }//GEN-LAST:event_textFieldNomorFocusLost

    private void textFIeldNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFIeldNamaFocusLost
        String nama = textFIeldNama.getText();
        String pattern = "[a-zA-Z][^0-9]*";
        if (nama.isEmpty()) {
        } else if (!(nama.matches(pattern))) {
            JOptionPane.showMessageDialog(this, "Nama tidak mengandung angka");
            textFIeldNama.setText("");
        }
    }//GEN-LAST:event_textFIeldNamaFocusLost

    private void textFieldJumlahPinjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldJumlahPinjamFocusLost
        String jumlahPinjam = textFieldJumlahPinjam.getText();
        if (jumlahPinjam.isEmpty()) {
        } else {
            try {
                int max = Integer.parseInt(textFieldJumlahPinjam.getText());
                if (radioDosen.isSelected()) {
                    if (max > 7) {
                        JOptionPane.showMessageDialog(this, "Maks pinjam untuk Dosen adalah 7");
                        textFieldJumlahPinjam.setText("");
                    }
                } else if (radioMahasiswa.isSelected()) {
                    if (max > 5) {
                        JOptionPane.showMessageDialog(this, "Maks pinjam untuk Mahasiswa adalah 5");
                        textFieldJumlahPinjam.setText("");
                    }
                } else if (radioUmum.isSelected()) {
                    if (max > 3) {
                        JOptionPane.showMessageDialog(this, "Maks pinjam untuk Umum adalah 3");
                        textFieldJumlahPinjam.setText("");
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mohon mengisi jumlah pinjam dengan angka!");
            }
        }
    }//GEN-LAST:event_textFieldJumlahPinjamFocusLost

    private void tabelPeminjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPeminjamMouseClicked
        int selectedRow = tabelPeminjam.getSelectedRow();
        textFIeldIDPeminjam.setText(modelTabel.getValueAt(selectedRow, 0).toString());
        textFieldNomor.setText(modelTabel.getValueAt(selectedRow, 3).toString());
        textFIeldNama.setText(modelTabel.getValueAt(selectedRow, 1).toString());
        textFieldAlamat.setText(modelTabel.getValueAt(selectedRow, 4).toString());
        textFieldJumlahPinjam.setText(modelTabel.getValueAt(selectedRow, 5).toString());
        
        String jenis = modelTabel.getValueAt(selectedRow, 2).toString();
        switch (jenis.charAt(0)) {
            case 'U':
                radioUmum.setSelected(true);
                break;
            case 'M':
                radioMahasiswa.setSelected(true);
                break;
            case 'D':
                radioDosen.setSelected(true);
                break;
        }
    }//GEN-LAST:event_tabelPeminjamMouseClicked

    private void cbVerifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVerifikasiActionPerformed
        if (cbVerifikasi.isSelected()) {
            buttonTambah.setEnabled(true);
        } else {
            buttonTambah.setEnabled(false);
        }
    }//GEN-LAST:event_cbVerifikasiActionPerformed

    private void reset() {
        textFIeldIDPeminjam.setText("");
        textFIeldNama.setText("");
        textFieldAlamat.setText("");
        textFieldJumlahPinjam.setText("");
        textFieldNomor.setText("");
        radioDosen.setSelected(false);
        radioMahasiswa.setSelected(false);
        radioUmum.setSelected(false);
        buttonGroup1.clearSelection();
        cbVerifikasi.setSelected(false);
        buttonTambah.setEnabled(false);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KelolaDataPeminjam dialog = new KelolaDataPeminjam(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaDataPeminjam.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JCheckBox cbVerifikasi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelFormDataPeminjam;
    private javax.swing.JLabel labelIDPeminjam;
    private javax.swing.JLabel labelJumlahPinjam;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNomor;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton radioDosen;
    private javax.swing.JRadioButton radioMahasiswa;
    private javax.swing.JRadioButton radioUmum;
    private javax.swing.JTable tabelPeminjam;
    private javax.swing.JTextField textFIeldIDPeminjam;
    private javax.swing.JTextField textFIeldNama;
    private javax.swing.JTextField textFieldAlamat;
    private javax.swing.JTextField textFieldJumlahPinjam;
    private javax.swing.JTextField textFieldNomor;
    // End of variables declaration//GEN-END:variables

}

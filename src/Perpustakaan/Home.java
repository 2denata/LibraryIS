
package Perpustakaan;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {

    private String nama;
    protected Login frameLogin;
    
    public Home() {
        initComponents();
    }

    public Home(String nama, Login login) {
        this.nama = nama;
        this.frameLogin = login;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuItemPeminjam = new javax.swing.JMenuItem();
        MenuItemKoleksi = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        MenuItemPinjam = new javax.swing.JMenuItem();
        MenuItemKembali = new javax.swing.JMenuItem();
        MenuHelp = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpustakaan USD");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perpustakaan/LogoUSD.png"))); // NOI18N

        MenuFile.setText("File");
        MenuFile.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        MenuItemPeminjam.setText("Peminjam");
        MenuItemPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPeminjamActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemPeminjam);

        MenuItemKoleksi.setText("Koleksi");
        MenuItemKoleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemKoleksiActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemKoleksi);

        jMenuBar1.add(MenuFile);

        MenuEdit.setText("Edit");
        MenuEdit.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        MenuItemPinjam.setText("Pinjam");
        MenuItemPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPinjamActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemPinjam);

        MenuItemKembali.setText("Kembali");
        MenuItemKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemKembaliActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemKembali);

        jMenuBar1.add(MenuEdit);

        MenuHelp.setText("Help");
        MenuHelp.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        MenuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHelpMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuHelp);

        menuLogout.setText("Halo, " + nama);
        menuLogout.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuLogout.add(jMenuItem1);

        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPeminjamActionPerformed
        try {
            KelolaDataPeminjam frame = new KelolaDataPeminjam(this, true);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuItemPeminjamActionPerformed

    private void MenuItemKoleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemKoleksiActionPerformed
        try {
            KelolaDataKoleksi frame = new KelolaDataKoleksi(this, true);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuItemKoleksiActionPerformed

    private void MenuItemPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPinjamActionPerformed

        KelolaDataTransaksiPeminjaman frame = null;
        try {
            frame = new KelolaDataTransaksiPeminjaman(this, true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_MenuItemPinjamActionPerformed

    private void MenuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHelpMouseClicked
        Help frame = new Help(this, true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_MenuHelpMouseClicked

    private void MenuItemKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemKembaliActionPerformed
        KelolaDataPengembalian frame;
        frame = new KelolaDataPengembalian(this, true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_MenuItemKembaliActionPerformed

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked

    }//GEN-LAST:event_menuLogoutMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        JOptionPane.showMessageDialog(null, "Silahkan login kembali");
        frameLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JMenuItem MenuItemKembali;
    private javax.swing.JMenuItem MenuItemKoleksi;
    private javax.swing.JMenuItem MenuItemPeminjam;
    private javax.swing.JMenuItem MenuItemPinjam;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuLogout;
    // End of variables declaration//GEN-END:variables
}

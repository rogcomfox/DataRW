/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datarw;

/**
 *
 * @author Root
 */
public class MainForm extends javax.swing.JFrame {

    String ladmin;
    public MainForm(String loginadmin) {
        initComponents();
        this.ladmin = loginadmin;
        String getValue = welcome.getText();
        welcome.setText(getValue + " "+loginadmin);
    }
    
    public MainForm(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        PanelDalam = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Tamu = new javax.swing.JMenuItem();
        Domisili = new javax.swing.JMenuItem();
        Tampil = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        DPT = new javax.swing.JMenuItem();
        penduduk = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Fasilitas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Tambah = new javax.swing.JMenuItem();
        welcome = new javax.swing.JMenu();
        Keluar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartRW");

        javax.swing.GroupLayout PanelDalamLayout = new javax.swing.GroupLayout(PanelDalam);
        PanelDalam.setLayout(PanelDalamLayout);
        PanelDalamLayout.setHorizontalGroup(
            PanelDalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelDalamLayout.setVerticalGroup(
            PanelDalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jMenu1.setText("Perizinan");

        Tamu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        Tamu.setText("Tamu");
        Tamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamuActionPerformed(evt);
            }
        });
        jMenu1.add(Tamu);

        Domisili.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Domisili.setText("Domisili");
        jMenu1.add(Domisili);

        Tampil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Tampil.setText("Tampil Data");
        jMenu1.add(Tampil);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pendataan");

        DPT.setText("DPT");
        jMenu2.add(DPT);

        penduduk.setText("Penduduk Baru");
        penduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendudukActionPerformed(evt);
            }
        });
        jMenu2.add(penduduk);

        jMenuItem1.setText("Tampil Penduduk");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Peminjaman");

        Fasilitas.setText("Fasilitas");
        jMenu4.add(Fasilitas);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Proker");

        Tambah.setText("Tambah");
        jMenu5.add(Tambah);

        jMenuBar1.add(jMenu5);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        welcome.add(Keluar);

        jMenuBar1.add(welcome);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamuActionPerformed
        PerizinanTamu pt = new PerizinanTamu();
        PanelDalam.add(pt);
        pt.show();
    }//GEN-LAST:event_TamuActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        this.dispose();
        Splash s = new Splash();
        s.setVisible(true);
    }//GEN-LAST:event_KeluarActionPerformed

    private void pendudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendudukActionPerformed
        PendudukBaru pb = new PendudukBaru();
        PanelDalam.add(pb);
        pb.show();
    }//GEN-LAST:event_pendudukActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DPT;
    private javax.swing.JMenuItem Domisili;
    private javax.swing.JMenuItem Fasilitas;
    private javax.swing.JMenuItem Keluar;
    private javax.swing.JPanel PanelDalam;
    private javax.swing.JMenuItem Tambah;
    private javax.swing.JMenuItem Tampil;
    private javax.swing.JMenuItem Tamu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JMenuItem penduduk;
    private javax.swing.JMenu welcome;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author aliframadhan
 */
public class dasboard extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public dasboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuKasir = new javax.swing.JMenuItem();
        menuPelanggan = new javax.swing.JMenuItem();
        menuBarang = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuNota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Main Menu");

        jMenu1.setText("Menu");

        menuKasir.setText("Kasir");
        menuKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKasirActionPerformed(evt);
            }
        });
        jMenu1.add(menuKasir);

        menuPelanggan.setText("Pelanggan");
        menuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(menuPelanggan);

        menuBarang.setText("Barang");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        jMenu1.add(menuBarang);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        menuNota.setText("Nota");
        menuNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNotaActionPerformed(evt);
            }
        });
        jMenu2.add(menuNota);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKasirActionPerformed
        // TODO add your handling code here:
        form_kasir kasir = new form_kasir();
        kasir.setVisible(true);
        kasir.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuKasirActionPerformed

    private void menuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPelangganActionPerformed
        // TODO add your handling code here:
        form_pelanggan pelanggan = new form_pelanggan();
        pelanggan.setVisible(true);
        pelanggan.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuPelangganActionPerformed

    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarangActionPerformed
        // TODO add your handling code here:
        form_barang barang = new form_barang();
        barang.setVisible(true);
        barang.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuBarangActionPerformed

    private void menuNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNotaActionPerformed
        // TODO add your handling code here:
        form_nota nota = new form_nota();
        nota.setVisible(true);
        nota.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuNotaActionPerformed

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
            java.util.logging.Logger.getLogger(dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new dasboard().setVisible(true);
                dasboard mainMenu = new dasboard();
                mainMenu.setLocationRelativeTo(null);
                mainMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuKasir;
    private javax.swing.JMenuItem menuNota;
    private javax.swing.JMenuItem menuPelanggan;
    // End of variables declaration//GEN-END:variables
}

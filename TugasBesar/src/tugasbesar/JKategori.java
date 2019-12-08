/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class JKategori extends javax.swing.JFrame {

    /**
     * Creates new form JKategori
     */
    public JKategori() {
        initComponents();
        kosongkanForm();
        tampilkanData();
    }
    public void kosongkanForm() {
        fidkat.setText("0");
        fkat.setText("");
    }
    
    public void tampilkanData() {
        String[] kolom = {"ID", "Nama"};
        ArrayList<Kategori> list = new Kategori().getAll();
        Object rowData[] = new Object[3];
        
        jTable1.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Kategori kat : list) {
            rowData[0] = kat.getId();
            rowData[1] = kat.getNama();
            
            ((DefaultTableModel)jTable1.getModel()).addRow(rowData);
        }
    }
    
    /*public void cari(String keyword) {
        String[] kolom = {"ID", "Nama", "Keterangan"};
        ArrayList<Kategori> list = new Kategori().search(keyword);
        Object rowData[] = new Object[3];
        
        jTable1.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Kategori kat : list) {
            rowData[0] = kat.getId();
            rowData[1] = kat.getNama();
            
            ((DefaultTableModel) jTable1.getModel()).addRow(rowData);
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bsimpan = new javax.swing.JButton();
        Btambah = new javax.swing.JButton();
        Bhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fidkat = new javax.swing.JTextField();
        fkat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID. Kategori");

        jLabel2.setText("Kategori");

        Bsimpan.setText("Simpan");
        Bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsimpanActionPerformed(evt);
            }
        });

        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Bhapus.setText("Hapus");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Kategori", "Kategori"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        fidkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fidkatActionPerformed(evt);
            }
        });

        fkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fkatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bsimpan)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btambah)
                                .addGap(18, 18, 18)
                                .addComponent(Bhapus))
                            .addComponent(fkat)
                            .addComponent(fidkat)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fidkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsimpan)
                    .addComponent(Btambah)
                    .addComponent(Bhapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtambahActionPerformed

    private void BsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsimpanActionPerformed
        Kategori kat = new Kategori();
        kat.setId(Integer.parseInt(fidkat.getText()));
        kat.setNama(fkat.getText());
        kat.save();
        fidkat.setText(Integer.toString(kat.getId()));
        tampilkanData();
    }//GEN-LAST:event_BsimpanActionPerformed

    private void fidkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fidkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fidkatActionPerformed

    private void fkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fkatActionPerformed

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
            java.util.logging.Logger.getLogger(JKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Bsimpan;
    private javax.swing.JButton Btambah;
    private javax.swing.JTextField fidkat;
    private javax.swing.JTextField fkat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
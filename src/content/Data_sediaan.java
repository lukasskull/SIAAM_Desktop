/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

import inc.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUKAS PUTRA DIANTAMA
 */
public class Data_sediaan extends javax.swing.JInternalFrame {
    Connection conn = config.Conn();
    Statement st;
    ResultSet rs;
    
     private void tampilData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("Nama Sediaan");
        bTambah.setEnabled(true);
      
        try{
            String sql = "SELECT * FROM sys_sediaan";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object []{
                    no,rs.getString("sediaan_id"), rs.getString("sediaan_name"),
                });
            }
            tData.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Creates new form Data_sediaan
     */
    public Data_sediaan() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        as = new javax.swing.JLabel();
        assa = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        bBatal = new javax.swing.JButton();
        tCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1301, 632));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setForeground(new java.awt.Color(51, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Sediaan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        as.setText("ID");

        assa.setText("Nama Sediaan");

        tId.setEditable(false);

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "Nama Sediaan"
            }
        ));
        tData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tData);

        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tCariKeyPressed(evt);
            }
        });

        jLabel2.setText("Pencarian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(as)
                    .addComponent(assa)
                    .addComponent(bTambah))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bUbah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addGap(18, 18, 18)
                        .addComponent(bReset))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tId)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBatal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(as)
                            .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assa)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bUbah)
                            .addComponent(bHapus)
                            .addComponent(bReset)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(121, 121, 121))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bBatal)
                                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        String cekNama = tNama.getText();
      
        if(cekNama.equals("")){
          JOptionPane.showMessageDialog(null, "Nama Satuan Obat HArus Diisi!!");
          JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!");
        } 
       else {
             if(JOptionPane.showConfirmDialog(null, "Anda Yakin Data Yang Anda Tambahkan Sudah Benar?","Menambahkan Data",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                try{
                    st = conn.createStatement();
                    String ifExsist = "SELECT * FROM sys_sediaan WHERE sediaan_name ='"+tNama.getText()+"'";
                    rs = st.executeQuery(ifExsist);
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Data Sudah Pernah Disimpan!");
                        JOptionPane.showMessageDialog(null,"Data Batal Disimpan!");
                    }
                    else{   
                         try{
                            String sql = "INSERT INTO sys_sediaan VALUES (NULL,'"+tNama.getText()+"')";
                            st = conn.createStatement();
                            st.executeUpdate(sql);

                            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan!");
                            clearText();
                            tampilData();

                         }catch(Exception e){
                             System.out.println("error 1");
                         }
                    }
                }catch(Exception e){
                     System.out.println("error 2");
                }
             }else{
                   JOptionPane.showMessageDialog(null,"Data Batal Disimpan!");
             }
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         tampilData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyPressed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("Nama Sediaan");
        bTambah.setEnabled(true);
      
        try{
            String sql = "SELECT * FROM sys_sediaan WHERE sediaan_name LIKE '%"+tCari.getText()+"%'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object []{
                    no,rs.getString("sediaan_id"), rs.getString("sediaan_name"),
                });
            }
            tData.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tCariKeyPressed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
       clearTextCari();
    }//GEN-LAST:event_bBatalActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Yakin Ingin Mereset Inputan?","Reset Data",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
              JOptionPane.showMessageDialog(null,"Berhasil Mereset Inputan!");
              clearText();
          }else{
              JOptionPane.showMessageDialog(null,"Data Inputan Batal Direset!");
          }
    }//GEN-LAST:event_bResetActionPerformed

    private void tDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDataMouseClicked
        int baris = tData.getSelectedRow();
        tId.setText(tData.getModel().getValueAt(baris, 1).toString());
        tNama.setText(tData.getModel().getValueAt(baris, 2).toString());
        bTambah.setEnabled(false);
    }//GEN-LAST:event_tDataMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
            String cekNama = tNama.getText();
            String cekId = tId.getText();
      
            if(cekNama.equals("")){
              JOptionPane.showMessageDialog(null, "Nama Satuan Obat HArus Diisi!");
              JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!");
            } else if(cekId.equals("")){
              JOptionPane.showMessageDialog(null, "Pilih Data Yang Ingin Diubah Terlebih Dahulu!");
              JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!"); 
            }
           else {
                 if(JOptionPane.showConfirmDialog(null, "Anda Yakin Data Yang Anda Tambahkan Sudah Benar?","Merubah Data",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                    try{
                        st = conn.createStatement();
                        String ifExsist = "SELECT * FROM sys_sediaan WHERE sediaan_name ='"+tNama.getText()+"'";
                        rs = st.executeQuery(ifExsist);
                        if(rs.next()){
                            JOptionPane.showMessageDialog(null,"Data Sudah Pernah Disimpan!");
                            JOptionPane.showMessageDialog(null,"Data Batal Disimpan!");
                        }
                        else{   
                             try{
                                String sql = "UPDATE sys_sediaan SET sediaan_name ='"+tNama.getText()+"' WHERE sediaan_id = '"+tId.getText()+"'";
                                st = conn.createStatement();
                                st.executeUpdate(sql);

                                JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan!");
                                clearText();
                                tampilData();

                             }catch(Exception e){
                                 System.out.println("error 1");
                             }
                        }
                    }catch(Exception e){
                         System.out.println("error 2");
                    }
                 }else{
                       JOptionPane.showMessageDialog(null,"Data Batal Disimpan!");
                 }
            }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        String cekId = tId.getText();
        
        if(cekId.equals("")){
            JOptionPane.showMessageDialog(null, "Pilih Data Yang Akan Dihapus Terlebih Dahulu!");
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus!");
        }else {
            if(JOptionPane.showConfirmDialog(null, "Anda Yakin Menghapus Data Ini?","Menghapus Data",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                try{
                   String sql = "DELETE FROM sys_sediaan WHERE sediaan_id = '"+tId.getText()+"'";
                   st = conn.createStatement();
                   st.executeUpdate(sql);


                   JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!");
                   clearText();
                   tampilData();

                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else{
                   JOptionPane.showMessageDialog(null,"Data Batal Dihapus!");
            }
        }
    }//GEN-LAST:event_bHapusActionPerformed

   private void clearText(){
        tId.setText("");
        tNama.setText("");
        tId.setEditable(false);
        bTambah.setEnabled(true);
        
    }
   
   private void clearTextCari(){
        tCari.setText("");
        tampilData();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel as;
    private javax.swing.JLabel assa;
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tData;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tNama;
    // End of variables declaration//GEN-END:variables
}
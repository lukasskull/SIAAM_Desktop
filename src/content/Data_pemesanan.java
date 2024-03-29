/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

import static content.Data_detail_pemesanan.tidPemesanan2;
import inc.config;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author LUKAS PUTRA DIANTAMA
 */
public class Data_pemesanan extends javax.swing.JInternalFrame {
    Connection conn = config.Conn();
    Statement st;
    ResultSet rs;
    String idPemesanan,tIdE;
     private void tampilData(){
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("No");
       model.addColumn("ID");
       model.addColumn("Kode Pemesanan");
       model.addColumn("Tanggal Pemesanan");
       model.addColumn("Nama Karyawan");
       model.addColumn("Nama Sales");
       model.addColumn("Nama Sales(*)");
       model.addColumn("No Telepon");
       model.addColumn("Status Pemesanan");
       model.addColumn("Total");
       //bDetailPemesanan.setEnabled(false);
       bUbah.setEnabled(false);
       bTambahPemesanan.setEnabled(false);//Button Lihat Detail
       bDetailPemesanan.setEnabled(true);//button Tambah Pemesanan
       bHapus.setEnabled(false);
       bKonfirmasiPemesanan.setEnabled(false);



       try{
           String sql = "SELECT sys_pemesanan.pemesanan_id,pemesanan_code,pemesanan_datetime,sys_karyawan.karyawan_name,sys_sales.sales_name, pemesanan_sales_name, pemesanan_sales_phone,pemesanan_status,pemesanan_total_order FROM sys_pemesanan, sys_karyawan, sys_sales WHERE sys_pemesanan.pemesanan_karyawan_id= sys_karyawan.karyawan_id AND sys_pemesanan.pemesanan_sales_id= sys_sales.sales_id ORDER BY pemesanan_id ASC";
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           
           

           int no = 0;
           while(rs.next()){
              
               no++;
               model.addRow(new Object []{
                   no, rs.getString("pemesanan_id"),rs.getString("pemesanan_code"),rs.getString("pemesanan_datetime"),rs.getString("karyawan_name"),rs.getString("sales_name"),rs.getString("pemesanan_sales_name"),rs.getString("pemesanan_sales_phone"),rs.getString("pemesanan_status"),rs.getString("pemesanan_total_order"),
               });
               
           }
           
           tData.setModel(model);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }

    /**
     * Creates new form Data_pemesanan
     */
    public Data_pemesanan() {
        initComponents();
       
    }

    //public static int getId(){
    //    return tIdP;
    //}
   
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        bTambahPemesanan = new javax.swing.JButton();
        bDetailPemesanan = new javax.swing.JButton();
        bBatal = new javax.swing.JButton();
        tIdPemesanan = new javax.swing.JTextField();
        tCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bKonfirmasiPemesanan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Pemesanan Obat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "ID", "Kode Pemesanan", "Tanggal Pemesanan", "Nama Karyawan", "Nama Sales", "Nama Sales (*)", "Nomor Telepon (*)", "Status Pemesanan", "Total"
            }
        ));
        tData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tData);

        bTambahPemesanan.setText("Lihat Detail Pemesanan");
        bTambahPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahPemesananActionPerformed(evt);
            }
        });

        bDetailPemesanan.setText("Tambah Pemesanan");
        bDetailPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDetailPemesananActionPerformed(evt);
            }
        });

        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        tIdPemesanan.setEditable(false);
        tIdPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIdPemesananActionPerformed(evt);
            }
        });

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tCariKeyPressed(evt);
            }
        });

        jLabel2.setText("Pencarian");

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bKonfirmasiPemesanan.setText("Konfirmasi Pemesanan");
        bKonfirmasiPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonfirmasiPemesananActionPerformed(evt);
            }
        });

        jLabel3.setText("Selected ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tIdPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bDetailPemesanan)
                            .addGap(18, 18, 18)
                            .addComponent(bTambahPemesanan)
                            .addGap(18, 18, 18)
                            .addComponent(bKonfirmasiPemesanan)
                            .addGap(18, 18, 18)
                            .addComponent(bUbah)
                            .addGap(18, 18, 18)
                            .addComponent(bHapus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bBatal))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDetailPemesanan)
                    .addComponent(bBatal)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bHapus)
                    .addComponent(bUbah)
                    .addComponent(bKonfirmasiPemesanan)
                    .addComponent(bTambahPemesanan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tIdPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        tampilData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tIdPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIdPemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIdPemesananActionPerformed

    private void tDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDataMouseClicked
        
        int baris = tData.getSelectedRow();
        //
        tIdPemesanan.setText(tData.getModel().getValueAt(baris, 1).toString());
        //
        bDetailPemesanan.setEnabled(true);//button tambah
        bTambahPemesanan.setEnabled(true);
        bUbah.setEnabled(true);
        bHapus.setEnabled(true);
        bKonfirmasiPemesanan.setEnabled(true);
    }//GEN-LAST:event_tDataMouseClicked

    private void bDetailPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDetailPemesananActionPerformed
       idPemesanan = tIdPemesanan.getText();
       xTambah_pemesanan2 xtambah_pemesanan2 = new xTambah_pemesanan2();
       this.getParent().add(xtambah_pemesanan2);
         
       Dimension parentSize = this.getParent().getSize();
       Dimension childSize = xtambah_pemesanan2.getSize();
        
       xtambah_pemesanan2.setLocation((parentSize.width - childSize.width)/2, (parentSize.height-childSize.height)/2);
       xtambah_pemesanan2.setVisible(true);
       tampilData();
    }//GEN-LAST:event_bDetailPemesananActionPerformed

    private void bTambahPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahPemesananActionPerformed
       idPemesanan = tIdPemesanan.getText();
       
       Data_detail_pemesanan data_detail_pemesanan = new Data_detail_pemesanan();
       Data_detail_pemesanan.tidPemesanan2.setText(this.idPemesanan);
       this.getParent().add(data_detail_pemesanan);
        
       Dimension parentSize = this.getParent().getSize();
       Dimension childSize = data_detail_pemesanan.getSize();
        
       data_detail_pemesanan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height-childSize.height)/2);
       data_detail_pemesanan.setVisible(true);  
    }//GEN-LAST:event_bTambahPemesananActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // String cekId = tId.getText();
        
       
            if(JOptionPane.showConfirmDialog(null, "Anda Yakin Menghapus Data Ini?","Menghapus Data",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                try{
                    String sql = "DELETE FROM sys_pemesanan WHERE pemesanan_id = '"+tIdPemesanan.getText()+"'";
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!");
                    tampilData();

                 }catch(Exception e){
                     System.out.println(e.getMessage());
                 }
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bKonfirmasiPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonfirmasiPemesananActionPerformed
         if(JOptionPane.showConfirmDialog(null, "Ubah Status Pemesanan Obat Ini?","KOnfirmasi Pemesanan",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                try{
                    String sql = "UPDATE sys_pemesanan SET  pemesanan_status = 'approved' WHERE pemesanan_id = '"+tIdPemesanan.getText()+"'";
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Status Pemesanan Berhasil Dikonfirmasi!");
                    tampilData();

                 }catch(Exception e){
                     System.out.println(e.getMessage());
                 }
         }
    }//GEN-LAST:event_bKonfirmasiPemesananActionPerformed

    private void tCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyPressed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("Kode Pemesanan");
        model.addColumn("Tanggal Pemesanan");
        model.addColumn("Nama Karyawan");
        model.addColumn("Nama Sales");
        model.addColumn("Nama Sales(*)");
        model.addColumn("Nomor Telepon(*)");
        model.addColumn("Status Pemesanan");
        model.addColumn("Total");
      
        try{
            String sql = "SELECT * FROM sys_pemesanan "
                    + "INNER JOIN sys_karyawan ON sys_karyawan.karyawan_id = sys_pemesanan.pemesanan_karyawan_id "
                    + "INNER JOIN sys_sales ON sys_sales.sales_id = sys_pemesanan.pemesanan_sales_id "
                    + "WHERE pemesanan_code LIKE '%"+tCari.getText()+"%' OR karyawan_name LIKE '%"+tCari.getText()+"%' OR sales_name LIKE '%"+tCari.getText()+"%'";
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object []{
                    no,rs.getString("pemesanan_id"), rs.getString("pemesanan_code"),rs.getString("pemesanan_datetime"),rs.getString("karyawan_name"),rs.getString("sales_name"),rs.getString("pemesanan_sales_name"),rs.getString("pemesanan_sales_phone"),rs.getString("pemesanan_status"),rs.getString("pemesanan_total_order"),
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

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
       idPemesanan = tIdPemesanan.getText();
       xEdit_pemesanan xedit_pemesanan = new xEdit_pemesanan();
       //xedit_pemesanan.tIdE.setText(this.idPemesanan);
       this.getParent().add(xedit_pemesanan);
       
       Dimension parentSize = this.getParent().getSize();
       Dimension childSize = xedit_pemesanan.getSize();
        
       xedit_pemesanan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height-childSize.height)/2);
       xedit_pemesanan.setVisible(true);
    }//GEN-LAST:event_bUbahActionPerformed

      private void clearTextCari(){
        tCari.setText("");
        tampilData();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bDetailPemesanan;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKonfirmasiPemesanan;
    private javax.swing.JButton bTambahPemesanan;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tData;
    private javax.swing.JTextField tIdPemesanan;
    // End of variables declaration//GEN-END:variables
}

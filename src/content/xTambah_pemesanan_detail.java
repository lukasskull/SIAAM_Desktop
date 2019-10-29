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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author LUKAS PUTRA DIANTAMA
 */
public class xTambah_pemesanan_detail extends javax.swing.JInternalFrame {

    Connection conn = config.Conn();
    Statement st;
    ResultSet rs;
    int idObat,idSediaan,idSatuan,idPabrik, hargaObat,jumlahObat, subTotal;
    String idDetail;
    /**
     * Creates new form xTambah_pemesanan_detail
     */
    public xTambah_pemesanan_detail() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tIdPemesananSebelumnya = new javax.swing.JTextField();
        cObat = new javax.swing.JComboBox<>();
        tJumlah = new javax.swing.JTextField();
        bBatal = new javax.swing.JButton();
        bTambah = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cPabrik = new javax.swing.JComboBox<>();

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

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Detail Pemesanan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel2.setText("ID Detail");

        jLabel3.setText("ID Pemesanan ");

        jLabel4.setText("Nama Obat");

        jLabel11.setText("Jumlah");

        tId.setEditable(false);

        tIdPemesananSebelumnya.setEditable(false);

        cObat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Obat" }));
        cObat.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cObatPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cObatActionPerformed(evt);
            }
        });

        bBatal.setText("Batal");

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        jLabel12.setText("Pabrik");

        cPabrik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Nama Pabrik" }));
        cPabrik.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cPabrikPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bBatal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(42, 42, 42)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tId)
                            .addComponent(tIdPemesananSebelumnya)
                            .addComponent(cObat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cPabrik, 0, 312, Short.MAX_VALUE)
                            .addComponent(tJumlah))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(tIdPemesananSebelumnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPabrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBatal)
                    .addComponent(bTambah))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         // tampilData();
       try{
          //tampilData();
          String sql = "SELECT * FROM sys_obat";
          conn = config.Conn();
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          
           while(rs.next()){
              cObat.addItem(rs.getString("obat_name"));
           }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }  
      //////////////////////////////////////////////
       try{
          String sql = "SELECT * FROM sys_satuan";
          conn = config.Conn();
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          
           while(rs.next()){
             //  cSatuan.addItem(rs.getString("satuan_name"));
           }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
       
          try{
          //tampilData();
          String sql = "SELECT * FROM sys_sediaan";
          conn = config.Conn();
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          
           while(rs.next()){
              // cSediaan.addItem(rs.getString("sediaan_name"));
           }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }  
      //////////////////////////////////////////////
         try{
          //tampilData();
          String sql = "SELECT * FROM sys_pabrik";
          conn = config.Conn();
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          
           while(rs.next()){
               cPabrik.addItem(rs.getString("pabrik_name"));
           }
      }catch(Exception e){
          System.out.println(e.getMessage());
      } 
    }//GEN-LAST:event_formInternalFrameOpened

    private void cObatPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cObatPopupMenuWillBecomeInvisible
         try{
          String sql = "SELECT * FROM sys_obat WHERE obat_name = '"+cObat.getSelectedItem()+"'";
          conn = config.Conn();
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          
          
           if(rs.next()){
               idObat = rs.getInt("obat_id");
               //System.out.println(idObat);
           }
      }catch(Exception e){
          System.out.println(e.getMessage());
      } 
    }//GEN-LAST:event_cObatPopupMenuWillBecomeInvisible

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
       String namaSediaan="";
       String namaSatuan="";
       String kodeObat="";
       String namaObat="";
     
       
       String cekIdPemesananInduk = tIdPemesananSebelumnya.getText();
       String cekObat = cObat.getSelectedItem().toString();
       //String cekKode = tKode.getText().trim().replaceAll("\\s","");
       //String cekNamaObat = tNamaObat.getText();
       //String cekSatuan = cSatuan.getSelectedItem().toString();
       //String cekNamaSatuan = tNamaSatuan.getText();
       //String cekSediaan = cSediaan.getSelectedItem().toString();
       //String cekNamaSediaan = tNamaSediaan.getText();
       String cekPabrik = cPabrik.getSelectedItem().toString();
       String cekJumlah= tJumlah.getText();
       if(!cekJumlah.matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Format Harga Adalah Angka!");
                JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!");
        }else{
            try{
            
            String sqll ="SELECT * FROM sys_obat INNER JOIN sys_satuan ON sys_obat.obat_satuan_id = sys_satuan.satuan_id INNER JOIN  sys_sediaan ON sys_obat.obat_sediaan_id = sys_sediaan.sediaan_id  WHERE obat_id = '"+idObat+"' ";
            //String sqll = "SELECT * FROM sys_pemesanan_detail INNER JOIN sys_pemesanan ON sys_pemesanan.pemesanan_id = sys_pemesanan_detail.pemesanan_detail_pemesanan_id WHERE pemesanan_detail_pemesanan_id = '"+tIdPemesananSebelumnya+"'";
            conn = config.Conn();
            st = conn.createStatement();
            rs = st.executeQuery(sqll);
            //System.out.println(sqll);
          
          
           if(rs.next()){
              namaSediaan = rs.getString("sediaan_name");
              namaSatuan = rs.getString("satuan_name");
              kodeObat = rs.getString("obat_barcode");
              namaObat = rs.getString("obat_name");
              idSatuan = rs.getInt("obat_satuan_id");
              idSediaan = rs.getInt("obat_sediaan_id");
              hargaObat = rs.getInt("obat_price");
           }
       
        }catch(Exception e){
            System.out.println("Query Error Selctnya Error");
        }
       
        try{    
           jumlahObat = Integer.parseInt(tJumlah.getText());
           subTotal = hargaObat*jumlahObat;
        
           String sql = "INSERT INTO sys_pemesanan_detail VALUES (NULL,'"+tIdPemesananSebelumnya.getText()+"', '"+idObat+"','"+kodeObat+"','"+namaObat+"', '"+idSatuan+"','"+namaSatuan+"', '"+idSatuan+"', '"+namaSediaan+"','"+idPabrik+"','"+tJumlah.getText()+"','"+hargaObat+"','"+subTotal+"')";        
           st = conn.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan!");
           dispose();


        }catch(Exception e){
            System.out.println("Query Error");
        }
       }
    }//GEN-LAST:event_bTambahActionPerformed

    private void cPabrikPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cPabrikPopupMenuWillBecomeInvisible
              try{
          String sql = "SELECT * FROM sys_pabrik WHERE pabrik_name = '"+cPabrik.getSelectedItem()+"'";
          conn = config.Conn();
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          
           if(rs.next()){
               idPabrik = rs.getInt("pabrik_id");
           }
      }catch(Exception e){
          System.out.println(e.getMessage());
      } 
    }//GEN-LAST:event_cPabrikPopupMenuWillBecomeInvisible

    private void cObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cObatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bTambah;
    private javax.swing.JComboBox<String> cObat;
    private javax.swing.JComboBox<String> cPabrik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tId;
    public static javax.swing.JTextField tIdPemesananSebelumnya;
    private javax.swing.JTextField tJumlah;
    // End of variables declaration//GEN-END:variables
}
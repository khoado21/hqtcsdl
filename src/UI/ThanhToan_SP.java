/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import controller.CTHD_ctrl;
import controller.HoaDon_ctrl;
import controller.KhuyenMai_ctrl;
import controller.ThanhVien_ctrl;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class ThanhToan_SP extends javax.swing.JFrame {

    /**
     * Creates new form ThanhToan_SP
     */

    public ThanhToan_SP() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Sum_num.setText(SanPham.tongtien+"");
        Total_num.setText(SanPham.tongtien+"");
        Code.setEditable(false);
        DTL_use.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));       
        

        
    }
    public static String lay(String manv)
    {
        
        return manv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GuestBt = new javax.swing.JRadioButton();
        MemberBt = new javax.swing.JRadioButton();
        Discount_use = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Discount = new javax.swing.JLabel();
        Total_num = new javax.swing.JLabel();
        SearchTV = new javax.swing.JTextField();
        Search_Open = new javax.swing.JButton();
        Code = new javax.swing.JTextField();
        DTL_ht = new javax.swing.JLabel();
        Summit_Bt = new javax.swing.JButton();
        Sum_num = new javax.swing.JLabel();
        DTL_use = new javax.swing.JSpinner();
        title = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã TV");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Điểm Tích Lũy");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Mã giảm giá");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tổng tiền");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Giảm giá");

        buttonGroup1.add(GuestBt);
        GuestBt.setForeground(new java.awt.Color(255, 255, 255));
        GuestBt.setSelected(true);
        GuestBt.setText("Khách");
        GuestBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestBtActionPerformed(evt);
            }
        });

        buttonGroup1.add(MemberBt);
        MemberBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberBtActionPerformed(evt);
            }
        });

        Discount_use.setForeground(new java.awt.Color(255, 255, 255));
        Discount_use.setText("Sử dụng");
        Discount_use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Discount_useActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thành tiền");

        Discount.setForeground(new java.awt.Color(255, 255, 255));
        Discount.setText("0");

        Total_num.setForeground(new java.awt.Color(255, 255, 255));
        Total_num.setText("0");

        SearchTV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SearchTV.setText("Mã Thành Viên");
        SearchTV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchTVMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchTVMouseExited(evt);
            }
        });
        SearchTV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTVKeyPressed(evt);
            }
        });

        Search_Open.setText("Tìm");
        Search_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_OpenActionPerformed(evt);
            }
        });

        Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodeKeyPressed(evt);
            }
        });

        DTL_ht.setForeground(new java.awt.Color(255, 255, 255));
        DTL_ht.setText("0");

        Summit_Bt.setBackground(new java.awt.Color(153, 153, 153));
        Summit_Bt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Summit_Bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/cash-payment.png"))); // NOI18N
        Summit_Bt.setText("Thanh toán");
        Summit_Bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Summit_BtActionPerformed(evt);
            }
        });

        Sum_num.setForeground(new java.awt.Color(255, 255, 255));
        Sum_num.setText("0");

        DTL_use.setEnabled(false);
        DTL_use.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DTL_useStateChanged(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("THANH TOÁN");

        Back.setBackground(new java.awt.Color(153, 153, 153));
        Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GuestBt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MemberBt))
                            .addComponent(Discount_use)
                            .addComponent(DTL_ht, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchTV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(Code, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DTL_use)))
                    .addComponent(Sum_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Total_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search_Open)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(38, 38, 38)
                .addComponent(Back))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Summit_Bt)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Back))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchTV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Search_Open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(GuestBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DTL_ht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DTL_use, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(Sum_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Code, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Discount_use)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Total_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Summit_Bt)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Summit_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Summit_BtActionPerformed
        // TODO add your handling code here:
        HoaDon_ctrl hdc = new HoaDon_ctrl();
        String MANV = DangNhap.MaNV;
        String MATV = null;
        int DTL = ((int)DTL_use.getValue());
        
        if(MemberBt.isSelected()){
            MATV = SearchTV.getText();
        }
        float ThanhTien = Float.parseFloat(Total_num.getText());
        String MAKM = null;
        if(Discount_use.isSelected()){
            MAKM = Code.getText();
        }
        int sohd = hdc.TaoHoaDon(MANV, MATV, ThanhTien, MAKM,DTL);
        
        CTHD_ctrl ctc = new CTHD_ctrl();
        boolean tmp = true;
        if (SanPham.sp1>0) {
            if(!ctc.Tao_CTHD("SP1", sohd, SanPham.sp1, 45000*SanPham.sp1))
                tmp=false;
        }
        if (SanPham.sp2>0) {
            if(!ctc.Tao_CTHD("SP2", sohd, SanPham.sp2, 55000*SanPham.sp2))
                tmp=false;
        }
        if (SanPham.sp3>0) {
            if(!ctc.Tao_CTHD("SP3", sohd, SanPham.sp3, 55000*SanPham.sp3))
                tmp=false;
        }
        if (SanPham.sp4>0) {
            if(!ctc.Tao_CTHD("SP4", sohd, SanPham.sp4, 25000*SanPham.sp4))
                tmp=false;
        }
        if (SanPham.sp5>0) {
            if(!ctc.Tao_CTHD("SP5", sohd, SanPham.sp5, 40000*SanPham.sp5))
                tmp=false;
        }
        if (SanPham.sp6>0) {
            if(!ctc.Tao_CTHD("SP6", sohd, SanPham.sp6, 25000*SanPham.sp6))
                tmp=false;
        }
        if (SanPham.sp7>0) {
            if(!ctc.Tao_CTHD("SP7", sohd, SanPham.sp7, 40000*SanPham.sp7))
                tmp=false;
        }
        if (tmp) {
                
            JOptionPane.showMessageDialog(null, "Thanh toán thành công");
            
        }
        else JOptionPane.showMessageDialog(null, "Thanh toán không thành công");
        this.dispose();
      
            
        
        
        
    }//GEN-LAST:event_Summit_BtActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        new SanPham();
    }//GEN-LAST:event_BackActionPerformed

    private void GuestBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestBtActionPerformed
        // TODO add your handling code here:
        MemberBt.setSelected(false);
        SearchTV.setText("Mã Thành Viên");
        SearchTV.setEditable(false);
        DTL_use.setEnabled(false);
    }//GEN-LAST:event_GuestBtActionPerformed

    private void MemberBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberBtActionPerformed
        // TODO add your handling code here:
        GuestBt.setSelected(false);
        SearchTV.setText("");
        SearchTV.setEditable(true);
        DTL_use.setEnabled(true);
    }//GEN-LAST:event_MemberBtActionPerformed

    private void SearchTVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTVKeyPressed
        // TODO add your handling code here:
        if (SearchTV.isEditable()){
            String MaTV = SearchTV.getText();
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                ThanhVien_ctrl  tvc = new ThanhVien_ctrl();
                if (tvc.isThanhVien(MaTV)) {
                    int DTL = tvc.getDiemTichLuy(MaTV);
                    DTL_ht.setText(DTL+"");
                    DTL_use.setModel(new javax.swing.SpinnerNumberModel(0, 0, DTL, 1));
                    DTL_use.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    DTL_use.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    DTL_useStateChanged(evt);
            }
        });
                    
                }
                else
                JOptionPane.showMessageDialog(null,"Mã thành viên không hợp lệ");
            }
        }
    }//GEN-LAST:event_SearchTVKeyPressed

    private void Search_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_OpenActionPerformed
        // TODO add your handling code here:
        /*
        QLThanhVien qltvL = new QLThanhVien(); 
        */
    }//GEN-LAST:event_Search_OpenActionPerformed

    private void CodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodeKeyPressed
        // TODO add your handling code here:
        
        if (Code.isEditable()){
            String MaGG = Code.getText();
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                KhuyenMai_ctrl  km = new KhuyenMai_ctrl();
                if (km.isKhuyenMai(MaGG)) {
                    int TLKM = km.getTyleKM(MaGG);
                    long tong= Long.parseLong(Sum_num.getText());
                    float maGiamGia = (float)tong*TLKM/100;
                    float giamGia = Float.parseFloat(Discount.getText());
                    giamGia = giamGia + maGiamGia;
                    Discount.setText(giamGia+"");
                    float thanhTien = Float.parseFloat(Total_num.getText());
                    thanhTien = tong - giamGia;
                    Total_num.setText(thanhTien+"");
                }
                else
                JOptionPane.showMessageDialog(null,"Mã khuyến mãi không hợp lệ");
            }
        }
    }//GEN-LAST:event_CodeKeyPressed

    private void Discount_useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Discount_useActionPerformed
        // TODO add your handling code here:
        Code.setEditable(true);
    }//GEN-LAST:event_Discount_useActionPerformed

    private void DTL_useStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DTL_useStateChanged
        // TODO add your handling code here:
        int giam = 1000*((int)DTL_use.getValue()-sl);
        int sum = Integer.parseInt(Sum_num.getText());
        sum = sum + giam;
        int total = Integer.parseInt(Total_num.getText());
        total= total - sum;
        Total_num.setText(total+"");
        sl=(int)DTL_use.getValue();
    }//GEN-LAST:event_DTL_useStateChanged

    private void SearchTVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchTVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTVMouseClicked

    private void SearchTVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchTVMouseExited
       
    }//GEN-LAST:event_SearchTVMouseExited

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
            java.util.logging.Logger.getLogger(ThanhToan_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan_SP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Code;
    private javax.swing.JLabel DTL_ht;
    private javax.swing.JSpinner DTL_use;
    private javax.swing.JLabel Discount;
    private javax.swing.JRadioButton Discount_use;
    private javax.swing.JRadioButton GuestBt;
    private javax.swing.JRadioButton MemberBt;
    private javax.swing.JTextField SearchTV;
    private javax.swing.JButton Search_Open;
    private javax.swing.JLabel Sum_num;
    private javax.swing.JButton Summit_Bt;
    private javax.swing.JLabel Total_num;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    public static int sl = 0;
}

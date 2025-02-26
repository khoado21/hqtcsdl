/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import controller.MaGG_ctrl;
import Model.MaKhuyenMai;

/**
 *
 * @author ASUS
 */
public class SuaKM extends javax.swing.JFrame {
    private MaKhuyenMai khuyenMai;
    //LPhim_service lPhim_service;
    MaGG_ctrl gG_ctrl;
    /**
     * Creates new form SuaLP
     */
    public SuaKM(String makm) {
        khuyenMai = new MaKhuyenMai();
        //lPhim_service = new LPhim_service();
        gG_ctrl = new MaGG_ctrl();
        khuyenMai = gG_ctrl.getKM(makm);
        initComponents();
        
        tf_makm.setText(khuyenMai.getMaKM());
        tf_tenkm.setText(khuyenMai.getTenKM());
        tf_tiLeKM.setText(String.valueOf(khuyenMai.getTyLeKM()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bt_malp = new javax.swing.JLabel();
        tf_makm = new javax.swing.JTextField();
        bt_malp1 = new javax.swing.JLabel();
        tf_tenkm = new javax.swing.JTextField();
        bt_malp2 = new javax.swing.JLabel();
        tf_tiLeKM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_back = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        bt_malp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bt_malp.setForeground(new java.awt.Color(255, 255, 255));
        bt_malp.setText("Mã Khuyến Mãi: ");

        tf_makm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tf_makm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_makm.setEnabled(false);
        tf_makm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_makmActionPerformed(evt);
            }
        });

        bt_malp1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bt_malp1.setForeground(new java.awt.Color(255, 255, 255));
        bt_malp1.setText("Tên Khuyến Mãi: ");

        tf_tenkm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tf_tenkm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tenkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tenkmActionPerformed(evt);
            }
        });

        bt_malp2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bt_malp2.setForeground(new java.awt.Color(255, 255, 255));
        bt_malp2.setText("Tỷ Lệ Khuyến Mãi:");

        tf_tiLeKM.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tf_tiLeKM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cập Nhật Khuyến Mãi");

        bt_back.setBackground(new java.awt.Color(153, 153, 153));
        bt_back.setForeground(new java.awt.Color(255, 255, 255));
        bt_back.setText("Trở lại");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_sua.setBackground(new java.awt.Color(153, 153, 153));
        bt_sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_sua.setForeground(new java.awt.Color(255, 255, 255));
        bt_sua.setText("Cập Nhật");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(bt_sua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bt_malp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_malp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_malp2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_tiLeKM, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_tenkm, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_makm, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_back)
                    .addComponent(jLabel1))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_malp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_makm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_malp1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tenkm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_malp2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tiLeKM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        // TODO add your handling code here:
        khuyenMai.setMaKM(tf_makm.getText());
        khuyenMai.setTenKM(tf_tenkm.getText());
        khuyenMai.setTyLeKM(Long.parseLong(tf_tiLeKM.getText()));
        gG_ctrl.SuaKM(khuyenMai);
        new  Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void tf_makmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_makmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_makmActionPerformed

    private void tf_tenkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tenkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tenkmActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JLabel bt_malp;
    private javax.swing.JLabel bt_malp1;
    private javax.swing.JLabel bt_malp2;
    private javax.swing.JButton bt_sua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_makm;
    private javax.swing.JTextField tf_tenkm;
    private javax.swing.JTextField tf_tiLeKM;
    // End of variables declaration//GEN-END:variables
}

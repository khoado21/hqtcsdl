/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;



//import Controller.Oracle;

import java.awt.Color;
import java.sql.Statement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import Model.NhanVien;
import Model.TaiKhoan;
import controller.JDBCConnection;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Phon
 */
public class QLNhanVien extends javax.swing.JFrame {

    private static void setModel(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    
    /**
     * Creates new form QLThanhVien
     */
    public QLNhanVien() {
        initComponents();
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
 
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);//thoát chương trình khi bấm exit
        this.setVisible(true);//chạy chương trình
       //set màu cho table
        JTableHeader table = table_nhanvien.getTableHeader();
        //table.setBackground(new Color(0,153,153));
        table.setForeground(Color.black);
        showNhanVien();
        panel_loaitk.setVisible(false);
       
    }
   
    public void showNhanVien(){
        
        ArrayList<NhanVien> list = controller.NhanVien_crl.getAllEmploy();
        DefaultTableModel model = (DefaultTableModel) table_nhanvien.getModel();
        Object[] row = new Object[11];
        for(int i=0;i< list.size();i++){
            row[0]=list.get(i).getMaNV();           
            row[1]=list.get(i).getMaNQL();
            row[2]=list.get(i).getMaTK();
            row[3]=list.get(i).getHoTenNV();
            row[4]=list.get(i).getGioiTinh();
            row[5]=list.get(i).getNgaySinh();
            row[6]=list.get(i).getDiaChi();
            row[7]=list.get(i).getSDT();
            row[8]=list.get(i).getLuong();
            row[9]=list.get(i).getNgayVL();
            row[10]=list.get(i).getChucVu();
            
            model.addRow(row);
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_tracuu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_nhanvien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_manv = new javax.swing.JTextField();
        txt_tennv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_ngaysinh = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_diachi = new javax.swing.JTextArea();
        txt_ngayvaolam = new com.toedter.calendar.JDateChooser();
        txt_sdt = new javax.swing.JTextField();
        txt_luong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        button_tracuu1 = new javax.swing.JButton();
        button_xoa = new javax.swing.JButton();
        butt_capnhat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        button_them = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_matk = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_manql = new javax.swing.JTextField();
        txt_chucvu = new javax.swing.JTextField();
        panel_loaitk = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_loaitk = new javax.swing.JComboBox<>();
        txt_gioitinh1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ THÔNG TIN NHÂN VIÊN ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(290, 0, 640, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 30, 1140, 50);

        txt_tracuu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_tracuu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_tracuu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_tracuuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tracuuFocusLost(evt);
            }
        });
        txt_tracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tracuuActionPerformed(evt);
            }
        });
        txt_tracuu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tracuuKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tracuuKeyReleased(evt);
            }
        });
        jPanel1.add(txt_tracuu);
        txt_tracuu.setBounds(450, 110, 430, 30);

        table_nhanvien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "MaNQL", "Matk", "Tên", "Giới tính", "Ngày sinh", "Địa chỉ", "SDT", "Lương", "Ngày vào làm", "Chức Vụ"
            }
        ));
        table_nhanvien.setOpaque(false);
        table_nhanvien.setSelectionBackground(new java.awt.Color(207, 190, 49));
        table_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_nhanvienMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table_nhanvienMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_nhanvien);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(450, 170, 680, 540);

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập các thông tin tra cứu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 110, 300, 25);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setBackground(new java.awt.Color(207, 190, 49));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin nhân viên");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 170, 450, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã tài khoản:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 290, 100, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên Nhân Viên:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 340, 110, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giới tính: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 370, 70, 20);
        jPanel1.add(txt_manv);
        txt_manv.setBounds(130, 210, 290, 30);
        jPanel1.add(txt_tennv);
        txt_tennv.setBounds(130, 330, 290, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ngày sinh: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 420, 90, 19);

        txt_ngaysinh.setDateFormatString("dd-MM-yyyy");
        txt_ngaysinh.setMaxSelectableDate(new java.util.Date(253370743279000L));
        txt_ngaysinh.setMinSelectableDate(new java.util.Date(-62135791121000L));
        jPanel1.add(txt_ngaysinh);
        txt_ngaysinh.setBounds(130, 410, 290, 30);

        txt_diachi.setColumns(20);
        txt_diachi.setRows(5);
        jScrollPane1.setViewportView(txt_diachi);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 450, 290, 50);

        txt_ngayvaolam.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(txt_ngayvaolam);
        txt_ngayvaolam.setBounds(130, 590, 290, 30);
        jPanel1.add(txt_sdt);
        txt_sdt.setBounds(130, 510, 290, 30);
        jPanel1.add(txt_luong);
        txt_luong.setBounds(130, 550, 290, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Địa chỉ:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 470, 60, 20);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SDT:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 520, 40, 20);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lương:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 550, 60, 19);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ngày vào làm: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 590, 110, 20);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Chức Vụ:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 630, 80, 30);

        button_tracuu1.setBackground(new java.awt.Color(153, 153, 153));
        button_tracuu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_tracuu1.setForeground(new java.awt.Color(255, 255, 255));
        button_tracuu1.setText("Tạo mới");
        button_tracuu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_tracuu1MouseClicked(evt);
            }
        });
        button_tracuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tracuu1ActionPerformed(evt);
            }
        });
        jPanel1.add(button_tracuu1);
        button_tracuu1.setBounds(300, 730, 80, 30);

        button_xoa.setBackground(new java.awt.Color(153, 153, 153));
        button_xoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_xoa.setForeground(new java.awt.Color(255, 255, 255));
        button_xoa.setText("Xoá");
        button_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_xoaActionPerformed(evt);
            }
        });
        jPanel1.add(button_xoa);
        button_xoa.setBounds(110, 730, 80, 30);

        butt_capnhat.setBackground(new java.awt.Color(153, 153, 153));
        butt_capnhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butt_capnhat.setForeground(new java.awt.Color(255, 255, 255));
        butt_capnhat.setText("Cập nhật");
        butt_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_capnhatActionPerformed(evt);
            }
        });
        jPanel1.add(butt_capnhat);
        butt_capnhat.setBounds(200, 730, 90, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tải lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(970, 110, 80, 23);

        button_them.setBackground(new java.awt.Color(153, 153, 153));
        button_them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_them.setForeground(new java.awt.Color(255, 255, 255));
        button_them.setText("Thêm");
        button_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_themActionPerformed(evt);
            }
        });
        jPanel1.add(button_them);
        button_them.setBounds(20, 730, 80, 30);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mã Nhân viên :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 210, 110, 30);

        txt_matk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matkActionPerformed(evt);
            }
        });
        jPanel1.add(txt_matk);
        txt_matk.setBounds(130, 290, 290, 30);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mã NQL:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 250, 70, 30);

        txt_manql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_manqlActionPerformed(evt);
            }
        });
        jPanel1.add(txt_manql);
        txt_manql.setBounds(130, 250, 290, 30);
        jPanel1.add(txt_chucvu);
        txt_chucvu.setBounds(130, 630, 290, 30);

        panel_loaitk.setBackground(new java.awt.Color(153, 153, 153));
        panel_loaitk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Loại TK:");
        panel_loaitk.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 55, 30));

        txt_loaitk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_loaitk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nhanvien", "quanly" }));
        txt_loaitk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loaitkActionPerformed(evt);
            }
        });
        panel_loaitk.add(txt_loaitk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 2, 291, 30));

        jPanel1.add(panel_loaitk);
        panel_loaitk.setBounds(0, 680, 450, 30);

        txt_gioitinh1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_gioitinh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));
        txt_gioitinh1.setPreferredSize(new java.awt.Dimension(7, 20));
        jPanel1.add(txt_gioitinh1);
        txt_gioitinh1.setBounds(130, 370, 290, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tracuuActionPerformed
       
    }//GEN-LAST:event_txt_tracuuActionPerformed

    private void txt_tracuuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tracuuFocusGained
          
    }//GEN-LAST:event_txt_tracuuFocusGained

    private void txt_tracuuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tracuuFocusLost
         
    }//GEN-LAST:event_txt_tracuuFocusLost

    private void txt_tracuuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tracuuKeyReleased
        DefaultTableModel table = (DefaultTableModel)table_nhanvien.getModel();
        String search = txt_tracuu.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        table_nhanvien.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
        
       
    }//GEN-LAST:event_txt_tracuuKeyReleased

    private void table_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nhanvienMouseClicked
       
       
        //int i = table_nhanvien.getSelectedRow();
        int i = table_nhanvien.convertRowIndexToModel(table_nhanvien.getSelectedRow());

        TableModel model = table_nhanvien.getModel();
        txt_manv.setText(model.getValueAt(i, 0).toString());
     
        txt_manql.setText(model.getValueAt(i, 1).toString());
        txt_matk.setText(model.getValueAt(i, 2).toString());
        txt_tennv.setText(model.getValueAt(i, 3).toString());
        //txt_gioitinh.setText(model.getValueAt(i, 4).toString());
        txt_diachi.setText(model.getValueAt(i, 6).toString());
        txt_sdt.setText(model.getValueAt(i, 7).toString());
        txt_luong.setText(model.getValueAt(i, 8).toString());
        txt_chucvu.setText(model.getValueAt(i, 10).toString());
//     

        String gioitinh = table_nhanvien.getValueAt(i, 4).toString();
            if(gioitinh.equals("Nam"))
            {
                txt_gioitinh1.setSelectedIndex(0);
            }
            else{
                txt_gioitinh1.setSelectedIndex(1);
            }
        
          try {
              //chuyển từ string qua date và gán vào jdate
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         String ngsinh = model.getValueAt(i, 5).toString();
         String ngvl = model.getValueAt(i, 9).toString();
         txt_ngaysinh.setDate(sdf.parse(ngsinh));
         txt_ngayvaolam.setDate(sdf.parse(ngvl));
         
        } catch (Exception e) {
            e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Lỗi");
        }
        
    }//GEN-LAST:event_table_nhanvienMouseClicked

    private void button_tracuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tracuu1ActionPerformed
         Random ran = new Random();
         int n = ran.nextInt(202000)+1;
         String val = String.valueOf(n);
         txt_manv.setText("NV"+val);
         int a = ran.nextInt(202000)+1;
         String val1 = String.valueOf(a);
         txt_matk.setEnabled(false);
         txt_matk.setText("TK"+val1);
        
        txt_tennv.setText("");
        //txt_gioitinh.setText("");
        txt_ngaysinh.setDate(null);
        txt_ngayvaolam.setDate(null);
        txt_diachi.setText("");
        txt_sdt.setText("");
        txt_luong.setText("");
        txt_chucvu.setText("");
        
        txt_manql.setText("");
        panel_loaitk.setVisible(true);
       
        
    }//GEN-LAST:event_button_tracuu1ActionPerformed

    private void button_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_xoaActionPerformed
         int xacnhanxoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá nhân viên này không?", "Xác nhận cậpt nhật",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(xacnhanxoa == JOptionPane.YES_OPTION)
        {
            NhanVien tv = new NhanVien();
            tv.setMaNV(txt_manv.getText());
             try {
                 if(new controller.NhanVien_crl().XoaNV(tv))
                 {
                     controller.TaiKhoan_ctrl.XoaTaiKhoan(txt_matk.getText());
                     JOptionPane.showMessageDialog(null, "Xoá nhân viên thành công");
                 }else{JOptionPane.showMessageDialog(null, "Xoá nhân viên thất bại");}
             } catch (SQLException ex) {
                 Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_button_xoaActionPerformed

    private void butt_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_capnhatActionPerformed
        
        int xacnhan = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thành viên này không?", "Xác nhận cậpt nhật",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(xacnhan == JOptionPane.YES_OPTION)
        {
           
        try {
            NhanVien tv = new NhanVien();
           
           
            tv.setMaNV(txt_manv.getText());
            tv.setMaNQL(txt_manql.getText());
            tv.setMaTK(txt_matk.getText());
            tv.setHoTenNV(txt_tennv.getText());
            //tv.setGioiTinh(txt_gioitinh.getText());
            tv.setGioiTinh(txt_gioitinh1.getSelectedItem().toString());
            tv.setDiaChi(txt_diachi.getText());
            tv.setSDT(txt_sdt.getText());
            tv.setLuong(Long.parseLong(txt_luong.getText()));
            tv.setChucVu(txt_chucvu.getText());
            
         
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String ngsinh = sdf.format(txt_ngaysinh.getDate());
                tv.setNgaySinh(ngsinh);
                String ngvl = sdf.format(txt_ngayvaolam.getDate());
                tv.setNgayVL(ngvl);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi ngày tháng năm");
                e.printStackTrace();
            }

            if (new controller.NhanVien_crl().CapNhatNV(tv)) {
                JOptionPane.showMessageDialog(null, "Cập nhật Nhân viên thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
           
        }
        
     
         
    }//GEN-LAST:event_butt_capnhatActionPerformed

    private void button_tracuu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_tracuu1MouseClicked
                
    }//GEN-LAST:event_button_tracuu1MouseClicked

    private void table_nhanvienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nhanvienMouseReleased
         
    }//GEN-LAST:event_table_nhanvienMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //table_nhanvien.setModel(new DefaultTableModel(null,new String[]{"MaNV","MANQL","MATK", "Tên", "Giới tính","Ngày Sinh","Địa chỉ","SĐT","Lương","NgàyVL","Chức Vụ"}));
       DefaultTableModel model = (DefaultTableModel) table_nhanvien.getModel();
        model.setRowCount(0);
       showNhanVien();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_themActionPerformed
  try {
      
         
            NhanVien tv = new NhanVien();
           
           
            tv.setMaNV(txt_manv.getText());
            tv.setMaNQL(txt_manql.getText());
            tv.setMaTK(txt_matk.getText());
            tv.setHoTenNV(txt_tennv.getText());
            //tv.setGioiTinh(txt_gioitinh.getText());
            tv.setGioiTinh(txt_gioitinh1.getSelectedItem().toString());
            
            tv.setDiaChi(txt_diachi.getText());
            tv.setSDT(txt_sdt.getText());
            tv.setLuong(Long.parseLong(txt_luong.getText()));
            tv.setChucVu(txt_chucvu.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try {
//               
                String ngsinh = sdf.format(txt_ngaysinh.getDate());
                tv.setNgaySinh(ngsinh);
                String ngvl = sdf.format(txt_ngayvaolam.getDate());
                tv.setNgayVL(ngvl);
            } catch (Exception e) {
               
                e.printStackTrace();
            }
            
            TaiKhoan tk = new TaiKhoan();
            tk.setMatK(txt_matk.getText());
            tk.setMaNguoiDung(txt_manv.getText());
            tk.setTenTK(txt_sdt.getText());
            tk.setPassword(txt_sdt.getText());
            tk.setLoaiTK(txt_loaitk.getSelectedItem().toString());

            if (new controller.TaiKhoan_ctrl().addTaiKhoan(tk)) {
                JOptionPane.showMessageDialog(null, "Tai khoản của bạn là:"+ tk.getTenTK()+" password tương ứng");
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản thêm không thành công");
            }
              if (new controller.NhanVien_crl().addNhanVien(tv) ) {
                JOptionPane.showMessageDialog(null, "Thêm Nhân viên thành công");
                
            } else {
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }
         

        } catch (Exception ex) {
            ex.printStackTrace();

        }
       
    }//GEN-LAST:event_button_themActionPerformed

    private void txt_matkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matkActionPerformed

    private void txt_manqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_manqlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_manqlActionPerformed

    private void txt_loaitkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loaitkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loaitkActionPerformed

    private void txt_tracuuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tracuuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tracuuKeyPressed

  

     
    public static void main(String args[]) {
       
        QLNhanVien traCuuTV = new QLNhanVien();
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt_capnhat;
    private javax.swing.JButton button_them;
    private javax.swing.JButton button_tracuu1;
    private javax.swing.JButton button_xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_loaitk;
    private javax.swing.JTable table_nhanvien;
    private javax.swing.JTextField txt_chucvu;
    private javax.swing.JTextArea txt_diachi;
    private javax.swing.JComboBox<String> txt_gioitinh1;
    private javax.swing.JComboBox<String> txt_loaitk;
    private javax.swing.JTextField txt_luong;
    private javax.swing.JTextField txt_manql;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JTextField txt_matk;
    private com.toedter.calendar.JDateChooser txt_ngaysinh;
    private com.toedter.calendar.JDateChooser txt_ngayvaolam;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tennv;
    private javax.swing.JTextField txt_tracuu;
    // End of variables declaration//GEN-END:variables
}

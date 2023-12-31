/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gui;

import com.bus.SupplierBUS;
import com.dao.SupplierDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author huynh
 */
public class SupplierInfoGUI extends javax.swing.JFrame {

    /**
     * Creates new form SupplierInfoGUI
     */
    SupplierBUS supBUS = new SupplierBUS();
    SupplierGUI ui;
    String flag = "";
    
    
    public SupplierInfoGUI(SupplierGUI ui) {
        initComponents();
        this.ui = ui;
        lidInfo.setText(supBUS.generateSupplierID());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public SupplierInfoGUI(SupplierDTO sup, String flag, SupplierGUI ui){
        this.flag = flag;
        this.ui = ui;
        initComponents();
        lidInfo.setText(sup.getId());
        tfName.setText(sup.getName());
        tfPhone.setText(sup.getPhone());
        tfAddress.setText(sup.getAddress());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        lTitle = new javax.swing.JLabel();
        lid = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lPhone = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lidInfo = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        notiName = new javax.swing.JLabel();
        notiPhone = new javax.swing.JLabel();
        notiAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lTitle.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lTitle.setText("Thông tin nhà cung cấp");

        lid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lid.setText("Mã nhà cung cấp:");

        lName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lName.setText("Tên nhà cung cấp:");

        lPhone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lPhone.setText("Số điện thoại:");

        lAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lAddress.setText("Địa chỉ:");

        lidInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNameFocusLost(evt);
            }
        });
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNameKeyPressed(evt);
            }
        });

        tfPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPhoneFocusLost(evt);
            }
        });
        tfPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPhoneKeyTyped(evt);
            }
        });

        tfAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAddressFocusLost(evt);
            }
        });
        tfAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAddressKeyPressed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConfirm.setText("Xác nhận");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExit.setText("Hủy");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lPhone)
                            .addGap(70, 70, 70)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(notiPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPhone)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lAddress)
                            .addGap(121, 121, 121)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(notiAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAddress))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lName)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notiName, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lidInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lidInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(notiName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(notiPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notiAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát ra?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.YES_OPTION) this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SupplierDTO sup = new SupplierDTO();
        sup.setId(lidInfo.getText());
        sup.setName(supBUS.normalization(tfName.getText()));
        sup.setPhone(supBUS.normalization(tfPhone.getText()));
        sup.setAddress(supBUS.normalization(tfAddress.getText()));
        if(this.flag.equalsIgnoreCase("edit")){
            supBUS.edit(sup, lidInfo.getText());
        }else{
            supBUS.add(sup);
        }
        ui.reloadData();
        this.dispose();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void tfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusLost
        // TODO add your handling code here:\
        if(supBUS.normalization(tfName.getText()).isEmpty()){
            notiName.setFont(notiName.getFont().deriveFont(Font.ITALIC));
            notiName.setForeground(Color.red);
            notiName.setText("Tên không được để trống");
        }else{
            notiName.setText("");
        }
        tfName.setText(supBUS.normalization(tfName.getText()));
        checkNoti();
    }//GEN-LAST:event_tfNameFocusLost

    private void tfPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPhoneFocusLost
        // TODO add your handling code here:
        if(supBUS.normalization(tfPhone.getText()).isEmpty()){
            notiPhone.setFont(notiPhone.getFont().deriveFont(Font.ITALIC));
            notiPhone.setForeground(Color.red);
            notiPhone.setText("Số điện thoại không được để trống");
        }else if(tfPhone.getText().trim().length() != 10){
            notiPhone.setFont(notiPhone.getFont().deriveFont(Font.ITALIC));
            notiPhone.setForeground(Color.red);
            notiPhone.setText("Số điện thoại phải có 10 số");
        }
        else{    
            notiPhone.setText("");
        }
        tfPhone.setText(supBUS.normalization(tfPhone.getText()));
        checkNoti();
    }//GEN-LAST:event_tfPhoneFocusLost

    private void tfAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusLost
        // TODO add your handling code here:
        if(supBUS.normalization(tfAddress.getText()).isEmpty()){
            notiAddress.setFont(notiAddress.getFont().deriveFont(Font.ITALIC));
            notiAddress.setForeground(Color.red);
            notiAddress.setText("Địa chỉ không được để trống");
        }else{
            notiAddress.setText("");
        }
        tfAddress.setText(supBUS.normalization(tfAddress.getText()));
        checkNoti();
    }//GEN-LAST:event_tfAddressFocusLost

    private void tfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyPressed
        // TODO add your handling code here:
        if(tfName.getText().length()!=0) notiName.setText("");
        checkNoti();
    }//GEN-LAST:event_tfNameKeyPressed

    private void tfAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddressKeyPressed
        // TODO add your handling code here:
        if(tfAddress.getText().length()!=0) notiAddress.setText("");
        checkNoti();
    }//GEN-LAST:event_tfAddressKeyPressed

    private void tfPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPhoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
            // Kiểm tra xem ký tự là số
        if (!Character.isDigit(c)) {
            // Nếu không phải là số, không cho phép nhập
           evt.consume();
        }
        if(tfPhone.getText().length()!=0) notiPhone.setText("");
        checkNoti();
    }//GEN-LAST:event_tfPhoneKeyTyped

    public void checkNoti(){
        if(notiName.getText().equals("") && notiPhone.getText().equals("") && notiAddress.getText().equals("")) 
            btnConfirm.setEnabled(true);
        else btnConfirm.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lid;
    private javax.swing.JLabel lidInfo;
    private javax.swing.JLabel notiAddress;
    private javax.swing.JLabel notiName;
    private javax.swing.JLabel notiPhone;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}

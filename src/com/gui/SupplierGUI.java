/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import com.bus.SupplierBUS;
import com.dao.SupplierDTO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author huynh
 */
public class SupplierGUI extends javax.swing.JPanel {

    /**
     * Creates new form SupplierGUI
     */
    
    SupplierBUS supBUS = new SupplierBUS();
    
    public SupplierGUI() {
        initComponents();
        svgAdd.setSVGImage("com/image/add.svg", 30, 30);
        svgEdit.setSVGImage("com/image/edit.svg", 40, 40);

        svgDelete.setVisible(false);
        svgSearch.setSVGImage("com/image/search.svg", 30, 30);
        svgSupplier.setSVGImage("com/image/supplier.svg", 70, 70);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        svgSearch = new com.gui.SvgImage();
        jLabel2 = new javax.swing.JLabel();
        svgEdit = new com.gui.SvgImage();
        svgDelete = new com.gui.SvgImage();
        svgAdd = new com.gui.SvgImage();
        svgSupplier = new com.gui.SvgImage();

        setPreferredSize(new java.awt.Dimension(1280, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(table);

        tfSearch.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        svgSearch.setText("search");
        svgSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgSearchMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("QUẢN LÝ NHÀ CUNG CẤP");

        svgEdit.setText("edit");
        svgEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgEditMouseClicked(evt);
            }
        });

        svgDelete.setText("del");
        svgDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgDeleteMouseClicked(evt);
            }
        });

        svgAdd.setText("add");
        svgAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgAddMouseClicked(evt);
            }
        });

        svgSupplier.setText("svgImage1");
        svgSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgSupplierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(svgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                        .addComponent(svgAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(svgDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(svgSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(svgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(svgSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(svgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(svgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(svgDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(svgAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void svgDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgDeleteMouseClicked
        //Xóa 1 record khỏi table và database
        if(table.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Xin chọn đối tượng khi xóa");
        }else{
            int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if(x==JOptionPane.YES_OPTION){
                supBUS.delete((String) table.getValueAt(table.getSelectedRow(), 0));
                this.reloadData();
            }
        }
    }//GEN-LAST:event_svgDeleteMouseClicked

    public void reloadData(){
        table.removeAll();
        table.repaint();
        supBUS.readData();
        table.setModel(supBUS.getModel());
    }
    
    private void svgAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgAddMouseClicked
        //Thêm 1 nhà cung cấp vào database
        SupplierInfoGUI supInfo = new SupplierInfoGUI(this);
        supInfo.setVisible(true);
        supInfo.setLocationRelativeTo(null);
        reloadData();
    }//GEN-LAST:event_svgAddMouseClicked

    private void svgEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgEditMouseClicked
        int rowSelected = table.getSelectedRow();
        if(rowSelected == -1){
            JOptionPane.showMessageDialog(null, "Xin chọn đối tượng khi sửa");
        }
        else{
            String flag = "edit";
        String[] value = new String[4];
        for(int i=0; i<4; i++){
            value[i] = (String) table.getValueAt(rowSelected, i);
        }
        SupplierDTO sup = new SupplierDTO(value[0], value[1], value[2], value[3]);
        SupplierInfoGUI supInfo = new SupplierInfoGUI(sup, flag, this);
        supInfo.setVisible(true);
        }
        
    }//GEN-LAST:event_svgEditMouseClicked

    private void svgSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgSearchMouseClicked
        // TODO add your handling code here:
        if(supBUS.isAlphaString(tfSearch.getText())){
            table.setModel(supBUS.getNameModel(supBUS.normalizeString(tfSearch.getText()).toLowerCase()));
        }else{
            table.setModel(supBUS.getIdModel(supBUS.normalizeString(tfSearch.getText()).toLowerCase()));
        }
    }//GEN-LAST:event_svgSearchMouseClicked

    private void svgSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgSupplierMouseClicked
        reloadData();
    }//GEN-LAST:event_svgSupplierMouseClicked

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(1280,620);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SupplierGUI x = new SupplierGUI();
        f.add(x);
        f.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.gui.SvgImage svgAdd;
    private com.gui.SvgImage svgDelete;
    private com.gui.SvgImage svgEdit;
    private com.gui.SvgImage svgSearch;
    private com.gui.SvgImage svgSupplier;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}

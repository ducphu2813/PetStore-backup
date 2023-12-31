/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gui;

import com.bus.EmployeeBUS;
import com.bus.ImportDetailBUS;
import com.dao.EmployeeDTO;
import com.dao.ImportDTO;
import com.dao.ImportDetailDTO;
import com.gui.ImportGUI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minht
 */
public class ImportDetailGUI extends javax.swing.JFrame {
    private ArrayList<ImportDetailDTO> impDetList = new ArrayList<>();
    private ImportDTO impDTO;
    EmployeeBUS empBUS= new EmployeeBUS();
    Validator valid = new Validator();

    /**
     * Creates new form ImportDetailGUI
     */
    public ImportDetailGUI(){
        
    }
    public ImportDetailGUI(ImportDTO impDTO) {
        try {
            initComponents();
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.impDTO=impDTO;
            addRowtoDetailTable(impDTO.getImportID());
            setLabelText();
            
        } catch (SQLException ex) {
            Logger.getLogger(ImportDetailGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setLabelText(){
        lbImpID.setText("Mã phiếu nhập: "+impDTO.getImportID());
        lbDate.setText(valid.toUIDate(impDTO.getCreatedDate()));
            
         
         empBUS.readData();

         lbEmpName.setText("Tên nhân viên: "+empBUS.getName(impDTO.getEmployeeID()));
         
         lbTotalQuantity.setText("Tổng: " + totalQuantity());
         lbTotalAmount.setText("Thành tiền: " + totalAmount());
         
    }
    
    public long totalQuantity(){
        long s=0;
        for(int i=0;i<impDetList.size();i++){
            s+=impDetList.get(i).getQuantity();
        }
        return s;
    } 
    public long totalAmount(){
        long s=0;
        for(int i=0;i<impDetList.size();i++){
            s+=impDetList.get(i).getAmount();
        }
        return s;
    } 
    
     public void addRowtoDetailTable(String impID) throws SQLException{
        ImportDetailBUS impDetBUS = new ImportDetailBUS();
        ArrayList<ImportDetailDTO> allDetList =impDetBUS.getList();
        ArrayList<ImportDetailDTO> tempDetList =new ArrayList<>();
        
        for (int i = 0; i < allDetList.size(); i++) {
            if(allDetList.get(i).getImportID().equals(impID))
                tempDetList.add(allDetList.get(i));
        }
        impDetList=tempDetList;
        
        DefaultTableModel model = (DefaultTableModel) tblDetail.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[6];
        for (int i = 0; i < impDetList.size(); i++) {
            rowData[0] = impDetList.get(i).getProductID();
            rowData[1] = impDetList.get(i).getProductName();
            rowData[2] = impDetList.get(i).getQuantity();
            rowData[3] = impDetList.get(i).getImportPrice();
            rowData[4] = impDetList.get(i).getSoldPrice();
            rowData[5] = impDetList.get(i).getAmount();
            model.addRow(rowData);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        Header = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbImpID = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbEmpName = new javax.swing.JLabel();
        lbTotalQuantity = new javax.swing.JLabel();
        lbTotalAmount = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá nhập", "Giá bán", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDetail);
        if (tblDetail.getColumnModel().getColumnCount() > 0) {
            tblDetail.getColumnModel().getColumn(0).setResizable(false);
            tblDetail.getColumnModel().getColumn(1).setResizable(false);
            tblDetail.getColumnModel().getColumn(2).setResizable(false);
            tblDetail.getColumnModel().getColumn(3).setResizable(false);
            tblDetail.getColumnModel().getColumn(4).setResizable(false);
            tblDetail.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 800, 400));

        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("CHI TIẾT PHIẾU NHẬP");
        Header.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 600, 60));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImpID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbImpID.setText("Mã Phiếu Nhập");
        jPanel1.add(lbImpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, 200, 30));

        lbDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDate.setText("DD/MM/YYYY");
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 5, 125, 30));

        lbEmpName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbEmpName.setText("Tên Nhân Viên");
        jPanel1.add(lbEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, 400, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 40));

        lbTotalQuantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTotalQuantity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTotalQuantity.setText("Tổng");
        getContentPane().add(lbTotalQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 505, 100, 25));

        lbTotalAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTotalAmount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTotalAmount.setText("Thành tiền");
        getContentPane().add(lbTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 505, 150, 25));

        btnPrint.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnPrint.setText("IN PHIẾU NHẬP");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        EmployeeBUS empBUS= new EmployeeBUS();
         empBUS.readData();
         EmployeeDTO empDTO = empBUS.searchByID(impDTO.getEmployeeID());
        
        String s="                      CHI TIẾT PHIẾU NHẬP                      \n\n";
        s+="MÃ PHIẾU NHẬP: " + impDTO.getImportID() +"  \n";
        s+="THỜI GIAN: " + impDTO.getCreatedDate() + "    \n";
        s+="NHÂN VIÊN: " + empDTO.getName() + "    \n";
        s+= "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
        long sum;
        for(int i=0;i<impDetList.size();i++){
            s+=impDetList.get(i).getProductName() + "\n";
            s+="Đơn giá: " + impDetList.get(i).getImportPrice() ;
            s+="\t Số lượng: " + impDetList.get(i).getQuantity();
            s+="\t Tổng: " + impDetList.get(i).getAmount() +"\n";
            s+= "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
        }
        s+="\n Thành tiền: " + totalAmount() +"VND\n";
        
        new ImportPrint(s).setVisible(true);
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(ImportDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportDetailGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbEmpName;
    private javax.swing.JLabel lbImpID;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTotalAmount;
    private javax.swing.JLabel lbTotalQuantity;
    private javax.swing.JTable tblDetail;
    // End of variables declaration//GEN-END:variables
}

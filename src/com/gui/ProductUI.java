/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author DUC PHU
 */
public class ProductUI extends javax.swing.JPanel {

    /**
     * Creates new form ProductCom
     */
    public ProductUI() {
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

        NavBar = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JLabel();
        BaseTable = new javax.swing.JPanel();
        scrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        NavBar.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout NavBarLayout = new javax.swing.GroupLayout(NavBar);
        NavBar.setLayout(NavBarLayout);
        NavBarLayout.setHorizontalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        NavBarLayout.setVerticalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/addIcon.png"))); // NOI18N

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1078, Short.MAX_VALUE)
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        scrollPane1.setViewportView(table);

        javax.swing.GroupLayout BaseTableLayout = new javax.swing.GroupLayout(BaseTable);
        BaseTable.setLayout(BaseTableLayout);
        BaseTableLayout.setHorizontalGroup(
            BaseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        BaseTableLayout.setVerticalGroup(
            BaseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        int scrollSpeed = 15;
        scrollPane1.getVerticalScrollBar().setUnitIncrement(scrollSpeed);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BaseTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnAdd)
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSearch)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BaseTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void add()
    {
        int num = Integer.parseInt(tfSearch.getText());
        table.removeAll();
        table.revalidate();
        table.repaint();
        int hgap = 2;
        int vgap = 2;
        
        if(num <= 6)
        {
            table.setLayout(new GridLayout(2, 3, hgap, vgap));
            for(int i = 0; i < num; i++)
            {
                ProductCom product = new ProductCom();
                table.add(product);
            }
            int remains = 6 - num;
            for(int i = 0; i < remains; i++)
            {
                EmptyProduct emp = new EmptyProduct();
                table.add(emp);
            }
        }
        else if(num > 6)
        {
            int rows = (num / 3) + 1;
            table.setLayout(new GridLayout(rows, 3, hgap, vgap));
            for(int i = 0; i < num; i++)
            {
                ProductCom product = new ProductCom();
                table.add(product);
            }
        }

        
        
        table.revalidate();
        table.repaint();
        
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(1280, 620);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ProductUI product = new ProductUI();
        f.add(product);
        f.setVisible(true);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BaseTable;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JPanel table;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
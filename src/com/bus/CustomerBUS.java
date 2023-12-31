/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.CustomerDAO;
import com.dao.CustomerDTO;
import com.gui.CustomerGUI;
import com.gui.Validator;
import java.text.Normalizer;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huynh
 */

public class CustomerBUS {

    CustomerDAO cusDAO = new CustomerDAO();
    public ArrayList<CustomerDTO> cusList = new ArrayList<>();
    Validator valid = new Validator();
    
    public CustomerBUS() {
        readData();
    }
    
    public void add(CustomerDTO cus){
        cusDAO.add(cus);
        cusList.add(cus);
    }
    
    public void edit(CustomerDTO cusTemp, String id){
        cusDAO.edit(cusTemp, id);
        cusList.removeIf(cus -> cus.getCusID().equals(id));
        cusList.add(cusTemp);
        new CustomerGUI().reloadData();
    }
    
    public ArrayList<CustomerDTO> searchByName(String name) {
        ArrayList<CustomerDTO> filteredList = new ArrayList<>();
        for (CustomerDTO cus : cusList) {
            if (cus.getCusName().toLowerCase().contains(name.toLowerCase())) {
                filteredList.add(cus);
            }
        }
        return filteredList;
    }

    
    public ArrayList<CustomerDTO> searchByPhone(String phone){
        ArrayList<CustomerDTO> filteredList = new ArrayList<>();
        for (CustomerDTO cus : cusList) {
            if (normalizeString(cus.getPhone()).toLowerCase().contains(phone)) {
                filteredList.add(cus);
            }
        }
        return filteredList;
    }
    
    
    
    public ArrayList<CustomerDTO> searchCus(String text)
    {
        ArrayList<CustomerDTO> matchingList = new ArrayList<>();
        for(CustomerDTO cus : cusList)
        {
            if(cus.getPhone().contains(text) ||
                    valid.normalizeString(cus.getCusName()).toLowerCase().contains(valid.normalizeString(text).toLowerCase()) ||
                    cus.getCusID().equalsIgnoreCase(text))
            {
                matchingList.add(cus);
            }
        }
        return matchingList;
    }
    
    public void readData(){
        cusList = cusDAO.readData();
    }
    
    public DefaultTableModel getPhoneModel(String phone){
        ArrayList<CustomerDTO> a = searchByPhone(phone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày tạo");
        for (CustomerDTO cus : a) {
            Vector row = new Vector<>();
            row.add(cus.getCusID());
            row.add(cus.getCusName());
            row.add(cus.getPhone());
            row.add(cus.getAddress());
            row.add(cus.getCreatedDate().format(formatter));
            model.addRow(row);
        }
        return model;
    }
    
    public DefaultTableModel getNameModel(String name){
        ArrayList<CustomerDTO> a = searchByName(name);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày tạo");
        for (CustomerDTO cus : a) {
            Vector row = new Vector<>();
            row.add(cus.getCusID());
            row.add(cus.getCusName());
            row.add(cus.getPhone());
            row.add(cus.getAddress());
            row.add(cus.getCreatedDate().format(formatter));
            model.addRow(row);
        }
        return model;
    }
    
    public DefaultTableModel getModel(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày tạo");
        for (CustomerDTO cus : cusList) {
            Vector row = new Vector<>();
            row.add(cus.getCusID());
            row.add(cus.getCusName());
            row.add(cus.getPhone());
            row.add(cus.getAddress());
            row.add(cus.getCreatedDate().format(formatter));
            model.addRow(row);
        }
        return model;
    }
    
    public String generateCustomerID(){
        String id = null;
        String prefix = "KH";
        int num = 0;
        while(id==null){
            num++;
            if(num>=100){
                id = prefix + num;
            }
            else if(num>=10){
                id = prefix + "0" + num;
            }
            else if(num>0){
                id = prefix + "00" + num;
            }
            if(cusDAO.isUnique(id)) break;
            else id = null;
        }
        return id;
    }
    
    //Chuẩn hóa chuỗi
    public String normalization(String s){
        String result = "";
        if(s.length()>0){
            s = s.trim().replaceAll("\\s+", " ");
            String words[] = s.split(" ");
            for (String word : words) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }
        return result.trim();
    }
    
    // Kiểm tra chuỗi chỉ có số
    public boolean isNum(String s){
        return s.matches("\\d+");
    }
    
    //Kiểm tra chuỗi không có tiếng việt
    public String normalizeString(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("[Đ]", "D");
        normalized = normalized.replaceAll("[đ]", "d");
        normalized = normalized.replaceAll("[^\\p{ASCII} \\t\\n\\x0B\\f\\r]", "");
        return normalized;
    }
    
    public String getName(String ID)
    {
        String name = "";
        for(CustomerDTO customer : cusList)
        {
            if(customer.getCusID().equalsIgnoreCase(ID))
            {
                name = customer.getCusName();
            }
        }
        return name;
    }
    
//    public String getID(String name)
//    {
//        String ID = "";
//        for(CustomerDTO customer : cusList)
//        {
//            if()
//        }
//    }
}

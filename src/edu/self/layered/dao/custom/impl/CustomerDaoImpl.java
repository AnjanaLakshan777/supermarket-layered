/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.dao.custom.impl;

import edu.self.layered.dao.CrudUtil;
import edu.self.layered.dao.custom.CustomerDao;
import edu.self.layered.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?)",t.getId(), t.getTitle(), t.getName(), t.getDob(), t.getAddress(), t.getCity(), t.getProvince(), t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET CustTitle = ?, CustName = ?, DOB = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? where CustID = ?",t.getTitle(), t.getName(), t.getDob(), t.getAddress(), t.getCity(), t.getProvince(), t.getPostalCode(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE CustID = ? ", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID = ?", id);
        if(rst.next()){
            return new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode")
            );
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
        while (rst.next()) {            
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode"))
            );
        }
        return customerEntities;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.dao.custom.impl;

import edu.self.layered.dao.CrudUtil;
import edu.self.layered.dao.custom.OrderDao;
import edu.self.layered.entity.OrderEntity;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public boolean save(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orders VALUES(?,?,?)",
                t.getOrderId(),
                t.getDate(),
                t.getCustomerId()
                );
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return true;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return true;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }
    
}

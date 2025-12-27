/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.dao.custom.impl;

import edu.self.layered.dao.CrudUtil;
import edu.self.layered.dao.custom.OrderDetailDao;
import edu.self.layered.entity.OrderDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class OrderDetailDaoImpl implements OrderDetailDao {

    @Override
    public boolean save(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO OrderDetail VALUES(?,?,?,?)",
                t.getOrderId(),
                t.getItemCode(),
                t.getOrderQty(),
                t.getDiscount()
                );
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return true;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return true;
    }

    @Override
    public OrderDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }

  
}

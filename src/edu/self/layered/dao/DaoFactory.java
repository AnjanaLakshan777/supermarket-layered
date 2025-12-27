/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.dao;

import edu.self.layered.dao.custom.impl.CustomerDaoImpl;
import edu.self.layered.dao.custom.impl.ItemDaoImpl;
import edu.self.layered.dao.custom.impl.OrderDaoImpl;
import edu.self.layered.dao.custom.impl.OrderDetailDaoImpl;

/**
 *
 * @author Anjana Lakshan
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoType type){
        switch(type){
            case ITEM:
                return new ItemDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoType{
        ITEM,CUSTOMER,ORDER,ORDER_DETAIL
    }
}

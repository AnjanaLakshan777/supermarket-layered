/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.dao;

import edu.self.layered.dao.custom.impl.ItemDaoImpl;

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
                return null;
            case ORDER:
                return null;
            case ORDER_DETAIL:
                return null;
            default:
                return null;
        }
    }
    
    public enum DaoType{
        ITEM,CUSTOMER,ORDER,ORDER_DETAIL
    }
}

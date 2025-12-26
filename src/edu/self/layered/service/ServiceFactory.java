/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.service;

import edu.self.layered.service.custom.impl.CustomerServiceImpl;
import edu.self.layered.service.custom.impl.ItemServiceImpl;

/**
 *
 * @author Anjana Lakshan
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch(type){
            case ITEM:
                return new ItemServiceImpl();
            case ORDER:
                return null;
            case CUSTOMER:
                return new CustomerServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType {
        ITEM,ORDER,CUSTOMER
    }
}

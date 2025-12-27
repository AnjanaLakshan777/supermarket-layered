/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.service.custom.impl;

import edu.self.layered.dao.DaoFactory;
import edu.self.layered.dao.custom.ItemDao;
import edu.self.layered.dao.custom.OrderDao;
import edu.self.layered.dao.custom.OrderDetailDao;
import edu.self.layered.db.DBConnection;
import edu.self.layered.dto.OrderDetailDto;
import edu.self.layered.dto.OrderDto;
import edu.self.layered.entity.ItemEntity;
import edu.self.layered.entity.OrderDetailEntity;
import edu.self.layered.entity.OrderEntity;
import edu.self.layered.service.custom.OrderService;
import java.sql.Connection;

/**
 *
 * @author Anjana Lakshan
 */
public class OrderServiceImpl implements OrderService {
    
    private ItemDao itemDao = (ItemDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);
    private OrderDao orderDao = (OrderDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER_DETAIL);

    @Override
    public String placeOrder(OrderDto orderDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try{
            connection.setAutoCommit(false);
            OrderEntity orderEntity = new OrderEntity(orderDto.getOrderId(),orderDto.getOrderDate(),orderDto.getCustId());
            if(orderDao.save(orderEntity)){
                boolean isOrderDetailSaved = true;
                for(OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos()){
                    OrderDetailEntity orderDetailEntity = new OrderDetailEntity(orderDto.getOrderId(),orderDetailDto.getItemCode(),orderDetailDto.getQty(),orderDetailDto.getDiscount());
                    if(!orderDetailDao.save(orderDetailEntity)){
                        isOrderDetailSaved = false;
                    }
                }
                if(isOrderDetailSaved){
                    boolean isItemUpdated = true;
                    for(OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos()){
                        ItemEntity itemEntity = itemDao.get(orderDetailDto.getItemCode());
                        itemEntity.setQoh(itemEntity.getQoh()-orderDetailDto.getQty());
                        if(!itemDao.update(itemEntity)){
                            isItemUpdated = false;
                        }
                    }
                    if(isItemUpdated){
                        connection.commit();
                        return "Order place successfully";
                    }else{
                        connection.rollback();
                        return "Item update error";
                    }
                    
                }else{
                    connection.rollback();
                    return "Order detail save error";
                }
            }else{
                connection.rollback();
                return "Order save error";
            }
        }catch(Exception e){
            connection.rollback();
            return e.getMessage();
        }finally{
            connection.setAutoCommit(true);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.controller;
import edu.self.layered.dto.OrderDto;
import edu.self.layered.service.ServiceFactory;
import edu.self.layered.service.custom.OrderService;
/**
 *
 * @author Anjana Lakshan
 */
public class OrderController { 
    
    private OrderService orderService = (OrderService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        return orderService.placeOrder(orderDto);
    }
}

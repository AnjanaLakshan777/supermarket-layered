/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.self.layered.service.custom;

import edu.self.layered.dto.OrderDto;
import edu.self.layered.service.SuperService;

/**
 *
 * @author Anjana Lakshan
 */
public interface OrderService extends SuperService {
    public String placeOrder(OrderDto orderDto) throws Exception ;
}

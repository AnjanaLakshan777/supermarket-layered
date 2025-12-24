/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.controller;
import edu.self.layered.dto.OrderDto;
import edu.self.layered.dto.OrderDetailDto;
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author Anjana Lakshan
 */
public class OrderController { 
    
    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws ClassNotFoundException, SQLException{
        return "Success";
    }
}

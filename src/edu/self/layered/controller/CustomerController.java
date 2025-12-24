/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.controller;
import edu.self.layered.dto.CustomerDto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class CustomerController {
    
    public String saveCustomer(CustomerDto customerDto)throws ClassNotFoundException, SQLException{
        return "Success";
    }
    public String updateCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        return "Success";
    } 
    public String deleteCustomer(String customerId) throws ClassNotFoundException, SQLException{
        return "Success";
    } 
    public CustomerDto getCustomer(String customerId) throws ClassNotFoundException, SQLException{
        return null;
    }
    public ArrayList<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
        return null;
    }
}

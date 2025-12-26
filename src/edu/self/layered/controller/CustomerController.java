/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.controller;
import edu.self.layered.dto.CustomerDto;
import edu.self.layered.service.ServiceFactory;
import edu.self.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class CustomerController {
    
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto)throws Exception{
        return customerService.saveCustomer(customerDto);
    }
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    } 
    public String deleteCustomer(String customerId) throws Exception{
        return customerService.deleteCustomer(customerId);
    } 
    public CustomerDto getCustomer(String customerId) throws Exception{
        return customerService.getCustomer(customerId);
    }
    public ArrayList<CustomerDto> getAll() throws Exception{
        return customerService.getAllCustomer();
    }
}

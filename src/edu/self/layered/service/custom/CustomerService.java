/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.self.layered.service.custom;

import edu.self.layered.dto.CustomerDto;
import java.util.ArrayList;
import edu.self.layered.service.SuperService;

/**
 *
 * @author Anjana Lakshan
 */
public interface CustomerService extends SuperService {
    public String saveCustomer(CustomerDto customerDto) throws Exception ;
    public String updateCustomer(CustomerDto customerDto) throws Exception ;
    public String deleteCustomer(String customerId) throws Exception ;
    public CustomerDto getCustomer(String customerId) throws Exception ;
    public ArrayList<CustomerDto> getAllCustomer() throws Exception ;
}

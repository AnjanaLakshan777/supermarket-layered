/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.service.custom.impl;

import edu.self.layered.dao.DaoFactory;
import edu.self.layered.dao.custom.CustomerDao;
import edu.self.layered.dto.CustomerDto;
import edu.self.layered.entity.CustomerEntity;
import edu.self.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostalCode()
        );
        boolean isSaved = customerDao.save(customerEntity);
        return isSaved ? "Customer save successfully" : "Fail";
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostalCode()
        );
        boolean isUpdated = customerDao.update(customerEntity);
        return isUpdated ? "Customer update successfully" : "Fail";
    }

    @Override
    public String deleteCustomer(String customerId) throws Exception {
        boolean isDeleted = customerDao.delete(customerId);
        return isDeleted ? "Customer delete successfully" : "Fail";
    }

    @Override
    public CustomerDto getCustomer(String customerId) throws Exception {
        CustomerEntity customerEntity = customerDao.get(customerId);
        if(customerEntity != null){
            return new CustomerDto(
                customerEntity.getId(),
                customerEntity.getTitle(),
                customerEntity.getName(),
                customerEntity.getDob(),
                customerEntity.getAddress(),
                customerEntity.getCity(),
                customerEntity.getProvince(),
                customerEntity.getPostalCode());
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        if(customerEntities != null){
            for(CustomerEntity customerEntity : customerEntities){
                customerDtos.add(new CustomerDto(
                    customerEntity.getId(),
                    customerEntity.getTitle(),
                    customerEntity.getName(),
                    customerEntity.getDob(),
                    customerEntity.getAddress(),
                    customerEntity.getCity(),
                    customerEntity.getProvince(),
                    customerEntity.getPostalCode()
                ));
            }
            return customerDtos;
        }
        return null;
    } 
}

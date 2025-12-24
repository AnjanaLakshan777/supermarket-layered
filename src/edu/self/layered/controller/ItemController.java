/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.controller;
import edu.self.layered.dto.ItemDto;
import edu.self.layered.service.ServiceFactory;
import edu.self.layered.services.custom.ItemService;
import java.util.ArrayList;
/**
 *
 * @author Anjana Lakshan
 */
public class ItemController {
    
    private ItemService itemService = (ItemService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDto itemDto)throws Exception{
        return itemService.saveItem(itemDto);
    }
    public String updateItem(ItemDto itemDto) throws Exception{
        return itemService.updateItem(itemDto);
    } 
    public String deleteItem(String itemCode) throws Exception{
        return itemService.deleteItem(itemCode);
    } 
    public ItemDto getItem(String itemCode) throws Exception{
        return itemService.getItem(itemCode);
    }
    public ArrayList<ItemDto> getAll() throws Exception{
        return itemService.getAllItem();
    }
}
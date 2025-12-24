/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.services.custom;

import edu.self.layered.dto.ItemDto;
import edu.self.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public interface ItemService extends SuperService {
    public String saveItem(ItemDto itemDto) throws Exception ;
    public String updateItem(ItemDto itemDto) throws Exception ;
    public String deleteItem(String itemCode) throws Exception ;
    public ItemDto getItem(String itemCode) throws Exception ;
    public ArrayList<ItemDto> getAllItem() throws Exception ;
}

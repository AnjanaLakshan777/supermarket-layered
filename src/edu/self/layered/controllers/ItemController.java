/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.controllers;
import edu.self.layered.dtos.ItemDto;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Anjana Lakshan
 */
public class ItemController {
    
    public String saveItem(ItemDto itemDto)throws ClassNotFoundException, SQLException{
        return "Success";
    }
    public String updateItem(ItemDto itemDto) throws ClassNotFoundException, SQLException{
        return "Success";
    } 
    public String deleteItem(String itemCode) throws ClassNotFoundException, SQLException{
        return "Success";
    } 
    public ItemDto getItem(String itemCode) throws ClassNotFoundException, SQLException{
        return null;
    }
    public ArrayList<ItemDto> getAll() throws ClassNotFoundException, SQLException{
        return null;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.self.layered.services.custom.impl;

import edu.self.layered.dao.DaoFactory;
import edu.self.layered.dao.custom.ItemDao;
import edu.self.layered.dto.ItemDto;
import edu.self.layered.entity.ItemEntity;
import edu.self.layered.services.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Anjana Lakshan
 */
public class ItemServiceImpl implements ItemService {
    
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);
    
    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(
                itemDto.getId(),
                itemDto.getDesc(),
                itemDto.getPack(),
                itemDto.getUnitPrice(),
                itemDto.getQoh()
        );
        boolean isSaved = itemDao.save(itemEntity);
        return isSaved ? "Item save successfully" : "Fail";
    };
    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(
                itemDto.getId(),
                itemDto.getDesc(),
                itemDto.getPack(),
                itemDto.getUnitPrice(),
                itemDto.getQoh()
        );
        boolean isUpdated = itemDao.update(itemEntity);
        return isUpdated ? "Item update successfully" : "Fail";
    };
    @Override
    public String deleteItem(String itemCode) throws Exception {
        
        boolean isDeleted = itemDao.delete(itemCode);
        return isDeleted ? "Item delete successfully" : "Fail";
    };
    @Override
    public ItemDto getItem(String itemCode) throws Exception {
        ItemEntity itemEntity = itemDao.get(itemCode);
        if(itemEntity != null){
            return new ItemDto(
                    itemEntity.getId(),
                    itemEntity.getDesc(),
                    itemEntity.getPack(),
                    itemEntity.getUnitPrice(),
                    itemEntity.getQoh()
            );
        }
        return null;
    };
    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemEntity> itemEntities = itemDao.getAll();
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        if(itemEntities != null){
            for(ItemEntity itemEntity : itemEntities){
                itemDtos.add(new ItemDto(itemEntity.getId(),itemEntity.getDesc(),itemEntity.getPack(),itemEntity.getUnitPrice(),itemEntity.getQoh()));
            }
            return itemDtos;
        }
        return null;
    };
}

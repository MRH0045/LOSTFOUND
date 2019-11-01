package com.lost_found.dao;

import com.lost_found.pojo.ItemType;

public interface ItemTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemType record);

    int insertSelective(ItemType record);

    ItemType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemType record);

    int updateByPrimaryKey(ItemType record);
}
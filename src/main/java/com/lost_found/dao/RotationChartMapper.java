package com.lost_found.dao;

import com.lost_found.pojo.RotationChart;

public interface RotationChartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RotationChart record);

    int insertSelective(RotationChart record);

    RotationChart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RotationChart record);

    int updateByPrimaryKey(RotationChart record);
}
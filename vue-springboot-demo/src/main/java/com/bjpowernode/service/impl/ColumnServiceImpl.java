package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.Data;
import com.bjpowernode.common.Page;
import com.bjpowernode.model.Column;
import com.bjpowernode.service.ColumnService;
import org.springframework.stereotype.Service;

@Service
public class ColumnServiceImpl implements ColumnService {
    @Override
    public Page queryDataByCondition(Integer current, Integer size, String name) {
        return Data.query(current,size,name);
    }

    @Override
    public int add(Column column) {
        return Data.add(column);
    }
    @Override
    public int editById(Column column){
        return Data.editById(column);
    }

    @Override
    public int deleteById(Integer id) {
        return Data.deleteById(id);
    }
}

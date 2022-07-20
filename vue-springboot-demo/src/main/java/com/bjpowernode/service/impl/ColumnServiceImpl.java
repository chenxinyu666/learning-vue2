package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.Data;
import com.bjpowernode.common.Page;
import com.bjpowernode.service.ColumnService;
import org.springframework.stereotype.Service;

@Service
public class ColumnServiceImpl implements ColumnService {
    @Override
    public Page queryDataByCondition(Integer current, Integer size, String name) {
        return Data.query(current,size,name);
    }
}

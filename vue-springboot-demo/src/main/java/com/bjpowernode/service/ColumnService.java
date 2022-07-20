package com.bjpowernode.service;

import com.bjpowernode.common.Page;
import com.bjpowernode.model.Column;

public interface ColumnService {
    Page queryDataByCondition(Integer current, Integer size, String name);
    int add(Column column);
    int editById(Column column);
    int deleteById(Integer id);
}

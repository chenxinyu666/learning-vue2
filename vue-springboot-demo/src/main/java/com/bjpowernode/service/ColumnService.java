package com.bjpowernode.service;

import com.bjpowernode.common.Page;

public interface ColumnService {
    Page queryDataByCondition(Integer current, Integer size, String name);
}

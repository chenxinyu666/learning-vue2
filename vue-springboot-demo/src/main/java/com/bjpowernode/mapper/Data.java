package com.bjpowernode.mapper;

import com.bjpowernode.common.Page;
import com.bjpowernode.model.Column;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//用这个类模拟mapper层
public class Data {
    private static List<Column> data = new ArrayList<>();
    static{
        for(int i=0;i<32;i++){
            data.add(new Column(i,"测试数据"+i,"描述-"+i));
        }
    }
    public static Page query(Integer current, Integer size, String name){
        List<Column> list = new ArrayList<>();//保存符合查询条件的记录
        for(Column column:data){
            if(column.getName().contains(name)){
                list.add(column);
            }
        }
        Integer fromIndex = size*(current-1);
        Integer toIndex = (fromIndex + size)<list.size()?(fromIndex + size):list.size();

        List record = data.subList(fromIndex,toIndex);
        return new Page(current,size,list.size(),record);
    }
}

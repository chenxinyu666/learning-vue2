package com.bjpowernode.controller;

import com.bjpowernode.common.Page;
import com.bjpowernode.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ColumnController {
    @Autowired
    ColumnService columnService;

    @RequestMapping("/column")
    @ResponseBody
    public Page list(Integer current,Integer size,String name){
        Page page = columnService.queryDataByCondition(current,size,name);

        //调用了转换JSON的工具
        return page;

    }
}

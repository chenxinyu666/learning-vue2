package com.bjpowernode.controller;

import com.bjpowernode.common.Page;
import com.bjpowernode.model.Column;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ColumnController {

    @RequestMapping("/column")
    @ResponseBody
    public Page list(){

        List<Column> list = new ArrayList<>();
        list.add(new Column(1001,"体育","体育新闻"));
        list.add(new Column(1002,"娱乐","娱乐新闻"));
        //调用了转换JSON的工具
        return new Page(1,5,32,list);

    }
}

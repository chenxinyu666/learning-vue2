package com.bjpowernode.controller;

import com.bjpowernode.common.Page;
import com.bjpowernode.common.ReturnObj;
import com.bjpowernode.mapper.Data;
import com.bjpowernode.model.Column;
import com.bjpowernode.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class ColumnController {
    @Autowired
    ColumnService columnService;
    @GetMapping("/column")
    @ResponseBody
    public Page list(Integer current,Integer size,String name){
        Page page = columnService.queryDataByCondition(current,size,name);
        //自动调用了转换JSON的工具
        return page;
    }

    @PostMapping("/column/add")
    @ResponseBody
    public Object add(@RequestBody Column column){//用@RequestBody注解声明的形参对象来接收前端发送表单数据
        ReturnObj returnObj = new ReturnObj();
        int code = columnService.add(column);
        returnObj.setCode(code);
        if(code==1){
            returnObj.setMsg("新增成功!");
        }else{
            returnObj.setMsg("新增失败!");
        }
        return returnObj;
    }
    @PostMapping("/column/edit")
    @ResponseBody
    public Object editById(@RequestBody Column column){
        ReturnObj returnObj = new ReturnObj();
        int code = columnService.editById(column);
        returnObj.setCode(code);
        if(code==1){
            returnObj.setMsg("编辑成功!");
        }else{
            returnObj.setMsg("编辑失败!");
        }
        return returnObj;
    }
    @PostMapping("/column/delete")
    @ResponseBody
    public Object deleteById(@RequestBody Map<String,Object> map){//axios的POST请求默认发送JSON格式的数据，后端可以用Map进行接收
        ReturnObj returnObj = new ReturnObj();
        int code = columnService.deleteById((Integer) map.get("id"));
        returnObj.setCode(code);
        if(code==1){
            returnObj.setMsg("删除成功!");
        }else{
            returnObj.setMsg("删除失败!");
        }
        return returnObj;
    }
}

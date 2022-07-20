package com.bjpowernode.common;

import java.util.List;

public class Page {
    private Integer current;//当前页
    private Integer size;//每页显示多少条
    private Integer total;// 满足条件的总记录数
    private List record;//满足条件的所有数据

    public Page() {
    }

    public Page(Integer current, Integer size, Integer total, List record) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.record = record;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", size=" + size +
                ", total=" + total +
                ", record=" + record +
                '}';
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRecord() {
        return record;
    }

    public void setRecord(List record) {
        this.record = record;
    }
}

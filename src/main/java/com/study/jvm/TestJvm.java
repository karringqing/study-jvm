package com.study.jvm;

import java.util.ArrayList;
import java.util.List;

public class TestJvm {
    public int i=111;
    public List list;
    public int test(){
        System.out.println(i);
        return i;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}

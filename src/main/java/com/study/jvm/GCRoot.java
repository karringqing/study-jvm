package com.study.jvm;

import java.util.ArrayList;
import java.util.List;

public class GCRoot {
    public static void main(String[] args) {
        TestJvm testJvm = new TestJvm();
        testJvm.setList(new ArrayList());
        List a = testJvm.getList();
        testJvm = null;

        System.gc();

        System.out.println(a);;
    }
}

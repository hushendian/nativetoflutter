package com.common.myapplication.B;

import java.math.BigDecimal;

public class B1 extends B {
    @Override
    public String name() {
        return "kk";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.1");
    }
}

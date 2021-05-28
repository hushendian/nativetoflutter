package com.common.myapplication.B;

import java.math.BigDecimal;

public class C1 extends C {
    B b1;

    public C1(B b) {
        b1 = b;
    }


    @Override
    public String name() {
        return b1.name() + "mm";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.1").add(b1.cost());
    }
}

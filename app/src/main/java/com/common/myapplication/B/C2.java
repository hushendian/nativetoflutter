package com.common.myapplication.B;

import java.math.BigDecimal;

public class C2 extends C {
    B b1;

    public C2(B b) {
        b1 = b;
    }


    @Override
    public String name() {
        return b1.name() + "mm2";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.13").add(b1.cost());
    }
}

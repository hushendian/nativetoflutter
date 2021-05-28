package com.common.myapplication.a;

import java.math.BigDecimal;

public class C1 extends des {

    @Override
    public String desc() {
        return  "c1";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(0.2);
    }
}

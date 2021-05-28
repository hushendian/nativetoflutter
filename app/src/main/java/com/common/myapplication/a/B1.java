package com.common.myapplication.a;

import java.math.BigDecimal;

public class B1 extends desc {

    des d;

    public B1(des d1) {
        d = d1;
    }

    @Override
    public String desc() {
        return "b1+" + d.desc();
    }

    @Override
    public BigDecimal cost() {
        return (new BigDecimal("0.1").add(d.cost()));
    }
}

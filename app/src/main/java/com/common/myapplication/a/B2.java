package com.common.myapplication.a;

import java.math.BigDecimal;

public class B2 extends desc {

    des d;

    public B2(des d1) {
        d = d1;
    }

    @Override
    public String desc() {
        return "b2+" + d.desc();
    }

    @Override
    public BigDecimal cost() {
        return (new BigDecimal("0.2").add(d.cost()));
    }
}

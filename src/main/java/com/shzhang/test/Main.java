package com.shzhang.test;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(1000);

        BigDecimal b = new BigDecimal(167);

        BigDecimal c = b.divide(a,0,BigDecimal.ROUND_UP);

        System.out.println(c);
    }
}

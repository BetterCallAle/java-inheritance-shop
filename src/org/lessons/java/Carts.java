package org.lessons.java;

import java.math.BigDecimal;

public class Carts {
    public static void main(String[] args) {
        Smartphones s = new Smartphones("Pixel 6", "Telefono google", new BigDecimal("599.99"), new BigDecimal("0.21"),255);
        System.out.println(s.toString());

        Televisions t = new Televisions("Samsung 50 pollici", "Televisione incredibile", new BigDecimal("1300"), new BigDecimal("0.21"), new BigDecimal("111.50"),  new BigDecimal("62.33"), true);
        System.out.println(t.toString());


    }
}

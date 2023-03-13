package org.lessons.java;

import java.math.BigDecimal;

public class Carts {
    public static void main(String[] args) {
        Smartphones s = new Smartphones("Pixel 6", "Telefono google", new BigDecimal("599.99"), new BigDecimal("0.21"),255);
        System.out.println(s.toString());
    }
}

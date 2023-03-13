package org.lessons.java;

import java.math.BigDecimal;

public class Headphones extends Products {
    private String color;
    private String type;

    //CONSTRUCTOR
    public Headphones(String name, String description, BigDecimal price, BigDecimal iva, String color, String type){
        super(name, description, price, iva);
        this.color = color;
        this.type = type;
    }

    //GETTERS

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public BigDecimal getDiscountedPrice() {
        if (type.equals("cablate")){
            return getFullPrice().subtract(getFullPrice().subtract(getFullPrice().multiply(new BigDecimal("0.93"))));
        } else {
            return super.getDiscountedPrice();
        }
    }

    //SETTERS

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    //METHODS

    @Override
    public String toString() {
        return "Headphones " + super.toString()+
                " color= " + color +
                ", type= " + type;
    }
}

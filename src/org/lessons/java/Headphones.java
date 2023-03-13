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
        return "Smartphone: " + getName() + ", product code: " + getCode() + ", Description:" + getDescription() + ", price: " + getPrice() + ", price with iva: " + getFullPrice() + ", color: " + color + ", type: " + type;
    }
}

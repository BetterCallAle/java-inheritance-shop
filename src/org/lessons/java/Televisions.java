package org.lessons.java;

import java.math.BigDecimal;

public class Televisions extends Products {
    private BigDecimal width;
    private BigDecimal height;
    private boolean isSmart;

    //Constructor
    public Televisions(String name, String description, BigDecimal price, BigDecimal iva, BigDecimal width, BigDecimal height, boolean isSmart){
        super(name, description, price, iva);
        this.width = width;
        this.height = height;
        this.isSmart = isSmart;
    }

    //GETTERS
    public BigDecimal getWidth() {
        return width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public boolean isSmart() {
        return isSmart;
    }

    //SETTERS
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    //METHODS


    @Override
    public String toString() {
        return "Television " + super.toString() +
                " width= " + width +
                ", height= " + height +
                ", isSmart= " + isSmart;
    }
}

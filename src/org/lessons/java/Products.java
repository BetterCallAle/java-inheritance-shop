package org.lessons.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Products {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    //Constructors
    public Products(){
        code = generateCode();
    }

    public Products(String name, String description, BigDecimal price, BigDecimal iva){
        code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
        this.iva = iva;
    }

    //Getter
    public String getCode(){
        return String.format("%07d", code);
    }

    public String getName(){
        return name;
    }

    public String getFullName(){
        return code + " " + name;
    }

    public String getDescription(){
        return description;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public BigDecimal getIva(){
        return iva;
    }

    public BigDecimal getFullPrice(){
        return price.add(price.multiply(iva));
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public void setIva(BigDecimal iva){
        this.iva = iva;
    }

    //Methods
    @Override
    public String toString() {
        return "Products{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }

    private int generateCode(){
        Random random = new Random();
        return random.nextInt(9999999);
    }
}

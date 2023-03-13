package org.lessons.java;

import java.util.Random;

public class Products {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    //Constructor
    public Products(String name, String description, double price, int iva){
        Random random = new Random();
        code  = random.nextInt(9999999);
        this.name = name;
        this.description = description;
        this.price = price;
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

    public double getPrice(){
        return price;
    }

    public int getIva(){
        return iva;
    }

    public double getFullPrice(){
        return price + ((price * iva) / 100);
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIva(int iva){
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
}

package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphones extends Products{
    private int imei;
    private int memory;

    //CONSTRUCTOR
    public Smartphones(String name, String description, BigDecimal price, BigDecimal iva, int memory){
        super(name, description, price, iva);
        this.imei = generateImei();
        this.memory = memory;
    }

    //GETTER

    public int getImei() {
        return imei;
    }

    public int getMemory() {
        return memory;
    }

    //SETTER

    public void setImei(int imei) {
        this.imei = imei;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    //METHODS


    @Override
    public String toString() {
        return "Smartphone " + super.toString() +
                " imei= " + imei +
                ", memory= " + memory;
    }

    public int generateImei(){
        Random rand = new Random();
        return rand.nextInt(111111111, 999999999);
    }
}

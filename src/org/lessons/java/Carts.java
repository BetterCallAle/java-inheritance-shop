package org.lessons.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Scanner;

public class Carts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi aggiungere?");
        int productNumbers = Integer.parseInt(scan.nextLine());
        BigDecimal totalPrice = new BigDecimal("0");

        System.out.println("Hai una carta fedeltà? 1 - Si | 2 - No");
        String hasCardString = scan.nextLine();
        boolean hasCard = false;
        if(hasCardString.equals("1")) {
            hasCard = true;
        }

        for (int i = 0; i < productNumbers; i++) {
            System.out.println("Inserisci il nome del prodotto da inserire nel carrello");
            String name = scan.nextLine();

            System.out.println("------------");
            System.out.println("Inserisci una breve descrizione");
            String description = scan.nextLine();

            System.out.println("------------");
            System.out.println("Inserisci il prezzo");
            BigDecimal price = new BigDecimal(scan.nextLine());

            System.out.println("------------");
            System.out.println("Inserisci l'iva");
            BigDecimal iva = new BigDecimal(scan.nextLine());

            System.out.println("------------");
            System.out.println("1 - Smartphone | 2 - Televisione | 3 - Cuffie");
            String userChoice = scan.nextLine();

            System.out.println("------------");

            if (userChoice.equals("1")){
                System.out.println("Inserisci quanta memoria ha lo smartphone");
                int memory = Integer.parseInt(scan.nextLine());
                Smartphones product = new Smartphones(name, description, price, iva, memory);

                System.out.println("------------");
                System.out.println("Ecco il tuo carrello:");
                System.out.println(product.toString());

                if (hasCard){
                    System.out.println("Prezzo scontato: " + product.getDiscountedPrice());
                    totalPrice = totalPrice.add(product.getDiscountedPrice());
                } else {
                    totalPrice = totalPrice.add(product.getFullPrice());
                }

            } else if (userChoice.equals("2")){
                System.out.println("Inserisci la larghezza");
                BigDecimal width = new BigDecimal(scan.nextLine());

                System.out.println("------------");
                System.out.println("Inserisci l'altezza");
                BigDecimal height = new BigDecimal(scan.nextLine());

                System.out.println("------------");
                System.out.println("È una tv smart? 1 - Si | 2 - No");
                String isSmartString = scan.nextLine();
                boolean isSmart = false;
                if(isSmartString.equals("1")){
                    isSmart = true;
                }

                Televisions product = new Televisions(name, description, price, iva, width, height, isSmart);

                System.out.println("------------");
                System.out.println("Ecco il tuo carrello:");
                System.out.println(product.toString());

                if (hasCard){
                    System.out.println("Prezzo scontato: " + product.getDiscountedPrice());
                    totalPrice = totalPrice.add(product.getDiscountedPrice());
                } else {
                    totalPrice = totalPrice.add(product.getFullPrice());
                }

            } else if (userChoice.equals("3")) {
                System.out.println("Inserisci il colore");
                String color = scan.nextLine();

                System.out.println("------------");
                System.out.println("Inserisci la tipologia");
                String type = scan.nextLine();

                Headphones product = new Headphones(name, description, price, iva, color, type);

                System.out.println("------------");
                System.out.println("Ecco il tuo carrello:");
                System.out.println(product.toString());

                if (hasCard){
                    System.out.println("Prezzo scontato: " + product.getDiscountedPrice());
                    totalPrice = totalPrice.add(product.getDiscountedPrice());
                } else {
                    totalPrice = totalPrice.add(product.getFullPrice());
                }
            }
        }

        System.out.println(totalPrice.setScale(2, RoundingMode.HALF_EVEN));
        scan.close();

    }
}

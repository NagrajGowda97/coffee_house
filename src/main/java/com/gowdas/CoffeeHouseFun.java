package com.gowdas;

import java.util.Scanner;

public class CoffeeHouseFun {
    static Expresso expresso =new Expresso();
    static Cappuccino cappuccino = new Cappuccino();
    static Latte latte = new Latte();
    public static int value1 = 0;
    public static  int value2 = 0;

    public static int total;
    static Scanner sc = new Scanner(System.in);

    public static void selectOrder(){
        System.out.println("WELCOME TO COFFEE HOUSE");
        System.out.println("Select Order");
        System.out.println("Expresso, Cappuccino, Latte");
        String order = sc.next().toLowerCase();
        switch (order){
            case "expresso":
                expressoAddsOn();
                break;
            case "cappuccino":
                cappuccinoAddsOn();
                break;
            case "latte":
                latteAddsOn();
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        System.out.println("do you want to order another coffee press 'y/n'");
        String get = sc.next();
        if (get.equals("y")) {
            orderAnother();
        } else if (get.equals("n")) {
            System.out.println("thank you for your order");
            generateBill();
        }
    }
    public static void orderAnother(){

        boolean exit = false;
        while (!exit) {
            System.out.println("Select Order");
            System.out.println("Expresso, Cappuccino, Latte");
            String order = sc.next().toLowerCase();
            switch (order) {
                case "expresso":
                    expressoAddsOn();
                    break;
                case "cappuccino":
                    cappuccinoAddsOn();
                    break;
                case "latte":
                    latteAddsOn();
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
            System.out.println("do you want to order another coffee press 'y/n'");
            String get = sc.next();
            if (get.equals("y")){
                orderAnother();
            }else if (get.equals("n")){
                System.out.println("thank you for your order");
                generateBill();
                exit = true;
            }
        }
    }
     public static void cappuccinoAddsOn() {

            System.out.println("Select any addition to your Cappuccino");
            System.out.println("Milk, Cream, Latte");
            String adds = sc.next().toLowerCase();
            if (adds.equals("milk")) {
                value1 = cappuccino.milkPrice;
            } else if (adds.equals("cream")) {
                value1 = cappuccino.creamPrice;
            } else if (adds.equals("latte")) {
                value1 = cappuccino.lattePrice;
            }

            System.out.println("do want any other addition to Cappuccino press 'y/n' ");
            if (sc.next().equals("y")){
                System.out.println("Milk, Cream, Latte");
                adds = sc.next().toLowerCase();
                if (adds.equals("milk")) {
                    value2 = cappuccino.milkPrice;
                } else if (adds.equals("cream")) {
                    value2 = cappuccino.creamPrice;
                } else if (adds.equals("latte")) {
                    value2 = cappuccino.lattePrice;
                }
            }else if (sc.next().equals("n")) {
                System.out.println("thank you for your order");
            }
            total = value1 + value2;
            //System.out.println("Your total bill is "+total);

    }
    public static void latteAddsOn() {

            System.out.println("Select any addition to your Latte");
            System.out.println("Milk, Cream, Latte");
            String adds = sc.next().toLowerCase();
            if (adds.equals("milk")) {
                value1 = latte.milkPrice;
            } else if (adds.equals("cream")) {
                value1 = latte.creamPrice;
            } else if (adds.equals("latte")) {
                value1 = latte.lattePrice;
            }
        System.out.println("do want any other addition to Latte press 'y/n' ");
        if (sc.next().equals("y")){
            System.out.println("Milk, Cream, Latte");
            adds = sc.next().toLowerCase();
            if (adds.equals("milk")) {
                value2 = latte.milkPrice;
            } else if (adds.equals("cream")) {
                value2 = latte.creamPrice;
            } else if (adds.equals("latte")) {
                value2 = latte.lattePrice;
            }
        } else if (sc.next().equals("n")) {
            System.out.println("thank you for your order");
        }
        total = value1 + value2;
        //System.out.println("Your total bill is "+total);
    }
    public static void expressoAddsOn() {

        System.out.println("Select any addition to your Expresso");
        System.out.println("Milk, Cream, Latte");
        String adds1 = sc.next().toLowerCase();
        if (adds1.equals("milk")) {
            value1 = expresso.milkPrice;
        } else if (adds1.equals("cream")) {
            value1 = expresso.creamPrice;
        } else if (adds1.equals("latte")) {
            value1 = expresso.lattePrice;
        }
        System.out.println("do want any other addition to Expresso press 'y/n' ");
        if (sc.next().equals("y")) {
            System.out.println("Milk, Cream, Latte");
            String adds2 = sc.next().toLowerCase();
            if (adds2.equals("milk")) {
                value2 = expresso.milkPrice;
            } else if (adds2.equals("cream")) {
                value2 = expresso.creamPrice;
            } else if (adds2.equals("latte")) {
                value2 = expresso.lattePrice;
            }
        } else if (sc.next().equals("n")) {
            System.out.println("thank you for your order");
        }
        total = value1 + value2;
        //System.out.println("Your total bill is "+total);
    }

    static void generateBill(){
        System.out.println("total payable amount is "+ total);
    }


}

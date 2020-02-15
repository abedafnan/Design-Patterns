package com.abedafnan.Factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Delivery Method: \n1- Air Delivery\n2- Land Delivery\n3- Sea Delivery");
        int choice = input.nextInt();

        Delivery delivery = DeliveryFactory.createDelivery(choice);
        if (delivery != null) {
            delivery.printDeliveryInfo();
        }
    }
}

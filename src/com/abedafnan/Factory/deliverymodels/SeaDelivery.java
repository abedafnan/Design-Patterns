package com.abedafnan.Factory.deliverymodels;

import com.abedafnan.Factory.Delivery;

public class SeaDelivery implements Delivery {

    private String name;
    private Double cost;
    private String duration;
    // .. and other possible properties


    public SeaDelivery(String name, Double cost, String duration) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }

    @Override
    public void printDeliveryInfo() {
        System.out.println("---------------------------------------" +
                "\n Sea Delivery" +
                "\n---------------------------------------" +
                "\nName: " + name +
                "\nDuration: " + duration +
                "\nCost: " + cost);
    }
}

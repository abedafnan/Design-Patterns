package com.abedafnan.Factory.deliverymodels;

import com.abedafnan.Factory.Delivery;

public class LandDelivery implements Delivery {

    private String name;
    private Double cost;
    private String duration;
    // .. and other possible properties


    public LandDelivery(String name, Double cost, String duration) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }

    @Override
    public void printDeliveryInfo() {
        System.out.println("---------------------------------------" +
                "\n Land Delivery" +
                "\n---------------------------------------" +
                "\nName: " + name +
                "\nDuration: " + duration +
                "\nCost: " + cost);
    }
}

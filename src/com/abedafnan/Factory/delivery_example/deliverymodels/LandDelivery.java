package com.abedafnan.Factory.delivery_example.deliverymodels;

import com.abedafnan.Factory.delivery_example.Delivery;

public class LandDelivery implements Delivery {

    private String name;
    private Double cost;
    private String duration;
    // .. and other possible properties


    public LandDelivery() {
        this.name = "Land";
        this.cost = 35.00;
        this.duration = "30 days";
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

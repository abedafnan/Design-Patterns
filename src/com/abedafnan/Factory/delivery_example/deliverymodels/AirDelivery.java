package com.abedafnan.Factory.delivery_example.deliverymodels;

import com.abedafnan.Factory.delivery_example.Delivery;

public class AirDelivery implements Delivery {

    private String name;
    private Double cost;
    private String duration;
    // .. and other possible properties


    public AirDelivery() {
        this.name = "Air";
        this.cost = 99.99;
        this.duration = "3 days";
    }

    @Override
    public void printDeliveryInfo() {
        System.out.println("---------------------------------------" +
                "\n Air Delivery" +
                "\n---------------------------------------" +
                "\nName: " + name +
                "\nDuration: " + duration +
                "\nCost: " + cost);
    }
}

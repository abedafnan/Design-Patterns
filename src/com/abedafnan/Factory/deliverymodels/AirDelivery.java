package com.abedafnan.Factory.deliverymodels;

import com.abedafnan.Factory.Delivery;

public class AirDelivery implements Delivery {

    private String name;
    private Double cost;
    private String duration;
    // .. and other possible properties


    public AirDelivery(String name, Double cost, String duration) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
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

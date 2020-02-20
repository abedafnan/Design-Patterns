package com.abedafnan.Factory.delivery_example.deliverymodels;

import com.abedafnan.Factory.delivery_example.Delivery;

public class SeaDelivery implements Delivery {

    private String name;
    private Double cost;
    private String duration;
    // .. and other possible properties


    public SeaDelivery() {
        this.name = "Sea";
        this.cost = 12.55;
        this.duration = "7 days";
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

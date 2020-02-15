package com.abedafnan.Factory;

import com.abedafnan.Factory.deliverymodels.AirDelivery;
import com.abedafnan.Factory.deliverymodels.LandDelivery;
import com.abedafnan.Factory.deliverymodels.SeaDelivery;

public class DeliveryFactory {

    public static Delivery createDelivery(int choice) {

        Delivery delivery = null;
        switch (choice) {
            case 1:
                delivery = new AirDelivery("Air", 99.99, "3 days");
                break;
            case 2:
                delivery = new LandDelivery("Land", 35.00, "30 days");
                break;
            case 3:
                delivery = new SeaDelivery("Sea", 12.55, "7 days");
                break;
            default:
                System.out.println("Choice Not Available !");
        }

        return delivery;
    }
}

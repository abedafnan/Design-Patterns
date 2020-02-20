package com.abedafnan.Factory.delivery_example;

import com.abedafnan.Factory.delivery_example.deliverymodels.AirDelivery;
import com.abedafnan.Factory.delivery_example.deliverymodels.LandDelivery;
import com.abedafnan.Factory.delivery_example.deliverymodels.SeaDelivery;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class DeliveryFactory {

    private static HashMap<Integer, Class<? extends Delivery>> hashMap = new HashMap<>();

    static {
        // Get the folder that has all the delivery models
        File classesFolder = new File(
                "C:\\Users\\HP\\IdeaProjects\\SoftwareArchitecture\\src\\com\\abedafnan\\Factory\\delivery_example\\deliverymodels");

        // Loop on the files in the models folder
        int classId = 1;
        for (File f : classesFolder.listFiles()) {
            // Store the class's name without ".java"
            String className = f.getName().split("\\.")[0];

            // Store the class id and the class itself in the hashmap
            try {
                Class c = Class.forName(
                        "com.abedafnan.Factory.delivery_example.deliverymodels." + className).asSubclass(Delivery.class);
                hashMap.put(classId, c);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            // increment the class id
            classId++;
        }
    }

    public static Delivery createDelivery(int choice) {
        Class<? extends Delivery> c = hashMap.get(choice);
        Delivery delivery = null;
        if (c != null) {
            try {
                delivery = c.getConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Choice Unavailable !");
        }

        return delivery;
    }
}

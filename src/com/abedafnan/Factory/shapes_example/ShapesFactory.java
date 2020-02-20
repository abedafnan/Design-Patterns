package com.abedafnan.Factory.shapes_example;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ShapesFactory {

    public static HashMap<Integer, Class<? extends Shape>> shapesHashMap = new HashMap<>();

    static {
        File shapesFolder = new File(
                "C:\\Users\\HP\\IdeaProjects\\SoftwareArchitecture\\src\\com\\abedafnan\\Factory\\shapes_example\\shapemodels");
        int i = 1;
        for (File file : shapesFolder.listFiles()) {
            String className = file.getName().split("\\.")[0];
            try {
                Class c = Class.forName(
                        "com.abedafnan.Factory.shapes_example.shapemodels." + className).asSubclass(Shape.class);
                shapesHashMap.put(i, c);
                i++;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static Shape createShape(int type) {
        Class<? extends Shape> c = shapesHashMap.get(type);
        Shape shape = null;
        try {
            shape = c.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return shape;
    }
}

package com.abedafnan.Factory.shapes_example.shapemodels;

import com.abedafnan.Factory.shapes_example.Shape;

import java.awt.*;
import java.util.Random;

public class Triangle implements Shape {

    int x, y;
    Random random;

    public Triangle() {
        random = new Random();
        x = random.nextInt(500);
        y = random.nextInt(600);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(x, y, x + 50, y + 50);
        graphics.drawLine(x, y, x - 50, y + 50);
        graphics.drawLine(x + 50, y + 50, x - 50, y + 50);
    }
}

package com.abedafnan.Factory.shapes_example.shapemodels;

import com.abedafnan.Factory.shapes_example.Shape;

import java.awt.*;
import java.util.Random;

public class Circle implements Shape {

    int x, y;
    int raduis;
    Random random;

    public Circle() {
        random = new Random();
        this.setRaduis(50);
        this.setX(random.nextInt(600));
        this.setY(random.nextInt(500));
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(this.getX(), this.getY(), this.getRaduis(), this.getRaduis());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaduis() {
        return raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }
}

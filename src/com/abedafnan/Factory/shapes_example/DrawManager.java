package com.abedafnan.Factory.shapes_example;

import java.awt.*;
import java.util.ArrayList;

public class DrawManager {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void drawShape(Shape shape, Graphics g) {
        shape.draw(g);
        shapes.add(shape);
    }

    public void clear(Graphics graphics) {
        graphics.clearRect(0, 0, 700, 600);
    }

    public void undo(Graphics graphics) {
        for (Shape s: shapes) {
            s.draw(graphics);
        }
        shapes.clear();
    }
}

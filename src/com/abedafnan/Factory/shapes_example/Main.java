package com.abedafnan.Factory.shapes_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *  SDA Lecture 2 & 5
 */
public class Main extends JFrame {

    private JButton btnClear;
    private JButton btnUndo;
    private JPanel drawArea;
    private JPanel panel;

    private Random random = new Random();
    private DrawManager drawManager = new DrawManager();

    public Main() {
        // Set the frame properties
        this.setTitle("Painter");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        // Create and add the main panel
        panel = new JPanel();
        panel.setAlignmentX(CENTER_ALIGNMENT);
        this.add(panel, BorderLayout.SOUTH);

        // Create and add the drawing panel
        drawArea = new JPanel();
        this.add(drawArea, BorderLayout.CENTER);

        for (int i: ShapesFactory.shapesHashMap.keySet()) {
            String className = ShapesFactory.shapesHashMap.get(i).getSimpleName();
            JButton brnShape = new JButton(className);
            panel.add(brnShape);
            brnShape.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Shape shape = ShapesFactory.createShape(i);
                    drawManager.drawShape(shape, drawArea.getGraphics());
                }
            });

        }

        btnClear = new JButton("Clear");
        panel.add(btnClear);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawManager.clear(drawArea.getGraphics());
            }
        });

        btnUndo = new JButton("Undo");
        panel.add(btnUndo);
        btnUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawManager.undo(drawArea.getGraphics());
            }
        });
    }

    public static void main(String[] args) {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
    }
}

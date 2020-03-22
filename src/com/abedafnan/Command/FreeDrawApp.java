package com.abedafnan.Command;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

/**
 * SDA Lecture 13
 */
public class FreeDrawApp extends JFrame {

    DrawCommandManager manager;

    public FreeDrawApp() {
        this.setTitle("draw app");
        manager = new DrawCommandManager();

        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.WHITE);
        final DrawingPanel drawPanel = new DrawingPanel(manager);
        this.getContentPane().add(drawPanel, BorderLayout.CENTER);
        String[] btns = {"Undo", "Redo"};
        ControlPanel cp = new ControlPanel(btns);
        cp.addControlPanelListener(new ControlPanel.ControlPanelListener() {

            @Override
            public void buttonPressed(String btnName) {
                if (btnName.equals("Undo")) {
                    manager.undo();

                } else if (btnName.equals("Redo")) {
                    manager.redo();
                }
            }

        });
        this.getContentPane().add(cp, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        new FreeDrawApp();
    }

}

package com.abedafnan.State;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI extends JFrame {

    IMediaPlayer player;

    public UI() {
        player = new StateMediaPlayer();
        //player = new NoStateMediaPlayer();

        this.getContentPane().setLayout(new FlowLayout());
        JButton prepareBtn = new JButton("Load Album");
        JButton playBtn = new JButton("Play");
        JButton stopBtn = new JButton("Stop");
        JButton pauseBtn = new JButton("Pause");


        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                player.destroy();
            }


            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

        });
        prepareBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.loadAlbum();
            }

        });
        playBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.play();
            }

        });
        stopBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.stop();
            }

        });
        pauseBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.pause();
            }

        });

        this.getContentPane().add(prepareBtn);
        this.getContentPane().add(playBtn);
        this.getContentPane().add(stopBtn);
        //this.getContentPane().add(nextBtn);
        //this.getContentPane().add(previousBtn);
        this.getContentPane().add(pauseBtn);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(300, 200));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        new UI();
    }

}

package com.abedafnan.Strategy;

public class MyService {

    Strategy currentStrategy;

    public void setCurrentStrategy(Strategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public void process() {
        currentStrategy.action();
    }

    public static void main(String[] args) {
        MyService s = new MyService();

        Mode1 mode1 = new Mode1();
        Mode2 mode2 = new Mode2();

        // Run in mode #1
        s.setCurrentStrategy(mode1);
        s.process();

        // Run in mode #2
        s.setCurrentStrategy(mode2);
        s.process();
    }
}

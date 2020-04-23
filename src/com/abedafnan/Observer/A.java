package com.abedafnan.Observer;

public class A implements Source.SourceListener {

    public void update(String date) {
        System.out.println("A is updated with " + date);
    }
}

package com.abedafnan.Observer;

public class B implements Source.SourceListener {

    public void update(String date) {
        System.out.println("B is updated with " + date);
    }
}

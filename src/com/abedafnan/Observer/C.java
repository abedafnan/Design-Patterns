package com.abedafnan.Observer;

public class C implements Source.SourceListener {

    public void update(String date) {
        System.out.println("C is updated with " + date);
    }
}

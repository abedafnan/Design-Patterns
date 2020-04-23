package com.abedafnan.Observer;

public class Main {

    public Main() {
        Source s = new Source();
        A a = new A();
        B b = new B();
        C c = new C();

        s.setSourceListener(a);
        s.setSourceListener(b);
        s.setSourceListener(c);

        s.setDate("Hello World!");
    }

    public static void main(String[] args) {
        new Main();
    }
}

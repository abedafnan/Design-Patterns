package com.abedafnan.Memento.example2;

public class Memento {

    private State state;

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

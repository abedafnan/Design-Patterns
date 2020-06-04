package com.abedafnan.Memento.example2;

public class Toaster {

    private State state;

    public Toaster(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void goNext() {
        state.toggleOnOff(this);
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
    }

    public String getStateString() {
        return state.toString();
    }
}

package com.abedafnan.Memento.example2;

public class OffState implements State {

    @Override
    public void toggleOnOff(Toaster toaster) {
        toaster.setState(new OnState());
    }

    @Override
    public String toString() {
        return "Off";
    }
}

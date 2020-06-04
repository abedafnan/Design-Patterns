package com.abedafnan.Memento.example2;

public class OnState implements State {

    @Override
    public void toggleOnOff(Toaster toaster) {
        toaster.setState(new OffState());
    }

    @Override
    public String toString() {
        return "On";
    }
}

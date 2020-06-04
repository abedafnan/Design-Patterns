package com.abedafnan.Memento.example2;

public class Main {

    public static void main(String[] args) {

        // Initial State
        OnState state = new OnState();
	    Toaster toaster = new Toaster(state);

	    // Save to Memento
	    Memento memento = toaster.saveToMemento();

	    // Toggle next state
	    toaster.goNext();
	    // New Toaster state
        System.out.println("New state: " + toaster.getStateString());

        // Restore the old state
        toaster.restoreFromMemento(memento);
        // Restored Memento state
        System.out.println("Restored state: " + toaster.getStateString());
    }
}

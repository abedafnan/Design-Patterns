package com.abedafnan.State;

import com.abedafnan.State.states.IState;
import com.abedafnan.State.states.Idle;

public class StateMediaPlayer implements IMediaPlayer {

    IState currentState = null;

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    public StateMediaPlayer() {
        System.out.println("Creating player");
        this.setCurrentState(new Idle(this));
    }

    @Override
    public void destroy() {
        this.currentState.playerUnprepared();
        this.currentState.playerDestroy();
    }

    @Override
    public void loadAlbum() {
        this.currentState.playerPrepared();
    }

    @Override
    public void stop() {
        this.currentState.playerStop();
    }

    @Override
    public void play() {
        this.currentState.playerStart();
    }

    @Override
    public void pause() {
        this.currentState.playerPaused();
    }

}

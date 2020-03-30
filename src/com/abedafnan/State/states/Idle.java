package com.abedafnan.State.states;

import com.abedafnan.State.IMediaPlayer;

public class Idle extends AbstractState {

    public Idle(IMediaPlayer player) {
        super(player);
    }

    @Override
    public void playerDestroy() {
        System.out.println("Destroy player");
        player.setCurrentState(null);

    }

    @Override
    public void playerCreate() {
        // TODO Auto-generated method stub

    }

    @Override
    public void playerPrepared() {
        System.out.println("Loading album tracks in memory");
        player.setCurrentState(new Ready(player));
        System.out.println("Ready");
    }

    @Override
    public void playerUnprepared() {
        // TODO Auto-generated method stub

    }

    @Override
    public void playerStart() {
        // TODO Auto-generated method stub

    }

    @Override
    public void playerStop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void playerPaused() {
        // TODO Auto-generated method stub

    }


}

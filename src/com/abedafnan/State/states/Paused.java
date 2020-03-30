package com.abedafnan.State.states;

import com.abedafnan.State.IMediaPlayer;

public class Paused extends AbstractState{

	public Paused(IMediaPlayer player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playerDestroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerCreate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerPrepared() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerUnprepared() {
		System.out.println("stop current track");
		System.out.println("Release album from mempry");
		player.setCurrentState(new Idle(player));
		System.out.println("Idle");
	}

	@Override
	public void playerStart() {
		System.out.println("load last from from the store timeframe");
		System.out.println("Resume current track");
		player.setCurrentState(new Playing(player));
		System.out.println("playing");		
	}

	@Override
	public void playerStop() {
		System.out.println("stop current track");
		player.setCurrentState(new Ready(player));
		System.out.println("Ready");		
	}

	@Override
	public void playerPaused() {
		// TODO Auto-generated method stub
		
	}

	

}
